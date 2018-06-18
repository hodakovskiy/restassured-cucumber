/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepdefs;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import io.restassured.builder.RequestSpecBuilder;
import static io.restassured.config.SSLConfig.sslConfig;
import io.restassured.filter.log.LogDetail;
import io.restassured.path.json.JsonPath;
import java.util.Map;
import static stepdefs.BaseClass.section;

/**
 *
 * @author sergey
 */
public class InitialState extends BaseClass {


  private Map<String, ?> cookies;
  private String accessToken;

  public void setup() {
   
 
    setSection(section);
    String port = System.getProperty("server.port");
    if (port == null) {
      int index = baseHost.indexOf("https:");
      RestAssured.port = (index == -1) ? 80 : 443;
    } else {
      RestAssured.port = Integer.valueOf(port);
    }

    requestSpecification = new RequestSpecBuilder().
            setConfig(RestAssured.config().sslConfig(sslConfig().relaxedHTTPSValidation())).
            setBaseUri(baseHost).
            build();

    authenticateUser();

    requestSpecification = new RequestSpecBuilder()
            .addFormParam("access_token", accessToken)
            .setConfig(RestAssured.config().sslConfig(sslConfig().relaxedHTTPSValidation()))
            .setBaseUri(baseHost)
            .addCookies(cookies)
            .log(LogDetail.ALL)
            .build();
    setRequestSpec(requestSpecification);  
  }

  public void authenticateUser() {

    request = given(requestSpecification)
                  .param("username", loginForm.getUsername())
            .param("password", loginForm.getPassword());

    response = request.when().get("?option=com_sted_mobile&controller=login&task=login");

    cookies = response.getCookies();

    response.then()
            .log()
            .all()
            .extract()
            .asString();

    JsonPath jsonPath = new JsonPath(response.asString());
    idAdmin = Integer.parseInt(jsonPath.getString("result.aid"));
    accessToken = jsonPath.getString("result.access_token");
    setIdAdmin(idAdmin);

  }
}
