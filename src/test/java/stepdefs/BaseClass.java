/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepdefs;

import babysdays.api.models.login.LoginForm;
import babysdays.api.models.predefined_room.RoomList;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import java.io.StringWriter;
import java.util.List;
import utilities.DefaultParams;
import static com.google.common.truth.Truth.assertThat;

/**
 *
 * @author sergey
 */
public class BaseClass {

  public static StringWriter writerReqest = new StringWriter();

  public static StringWriter writerResponse = new StringWriter();

  DefaultParams params = new DefaultParams();

  public static String displeyRequest;

  public static String baseHost;

  public static String section = "default";

  public static LoginForm loginForm;

  public static RequestSpecification requestSpec;

  public static Integer idAdmin;

  public static Integer idParent;

  public static Integer idChild;

  public static Response response;

  public static ValidatableResponse json;

  public static RequestSpecification request;

  public static List<RoomList> roomObject;
  /**
   * Date format 2015-09-07
   */
  public static final String RegexDateFormaUTF = "^\\d{4}-\\d{2}-\\d{2}$";
  /**
   * Date format 07.09.2007
   */
  public static final String RegexdateFormaOld = "^\\d{2}\\.\\d{2}\\.\\d{4}$";

  public static final String RegexIsInteger = "^(-?[1-9]+\\d*)$|^0$";

  /**
   * Get the value of RegexIsInteger
   *
   * @return the value of RegexIsInteger
   */
  public static String getRegexIsInteger() {
    return RegexIsInteger;
  }

  public static List<RoomList> getRoomObject() {
    return roomObject;
  }

  /**
   * Get the value of RegexdateFormaOld dd.mm.YYYY
   *
   * @return the value of RegexdateFormaOld
   */
  public String getRegexdateFormaOld() {
    return RegexdateFormaOld;
  }

  public BaseClass() {
    displeyRequest = params.displeyRequest;

  }

  public static void setRoomObject(List<RoomList> roomObject) {
    BaseClass.roomObject = roomObject;
  }

  public static RequestSpecification getRequestSpec() {
    return requestSpec;
  }

  public static void setRequestSpec(RequestSpecification requestSpec) {
    BaseClass.requestSpec = requestSpec;
  }

  public Response getResponse() {
    return response;
  }

  public void setResponse(Response response) {
    BaseClass.response = response;
  }

  public ValidatableResponse getJson() {
    return json;
  }

  public void setJson(ValidatableResponse json) {
    BaseClass.json = json;
  }

  public RequestSpecification getRequest() {
    return request;
  }

  public void setRequest(RequestSpecification request) {
    BaseClass.request = request;
  }

  public static Integer getIdAdmin() {
    return idAdmin;
  }

  public static void setIdAdmin(Integer idAdmin) {
    BaseClass.idAdmin = idAdmin;
  }

  public static String getBaseHost() {
    return baseHost;
  }

  public static void setBaseHost(String baseHost) {
    BaseClass.baseHost = baseHost;
  }

  public static String getSection() {
    return section;
  }

  public static void setSection(String section) {
    BaseClass.section = section;
  }

  public static LoginForm getLoginForm() {
    return loginForm;
  }

  public static void setLoginForm(LoginForm loginForm) {
    BaseClass.loginForm = loginForm;
  }

}
