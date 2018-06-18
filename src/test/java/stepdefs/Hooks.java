/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepdefs;

/**
 *
 * @author sergey
 */
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;
import org.eclipse.jetty.io.WriterOutputStream;
import static stepdefs.BaseClass.writerReqest;

public class Hooks extends BaseClass {

  @Before("@API")
  public void writerStartData() {
    writerReqest = new StringWriter();
    final PrintStream requestVar = new PrintStream(new WriterOutputStream(writerReqest), true);
    final PrintStream responseVar = new PrintStream(new WriterOutputStream(writerReqest), true);

    RestAssured.filters(new ResponseLoggingFilter(responseVar), new RequestLoggingFilter(requestVar));

  }

  @Before("@LoginNew")
  public void prepareData() {

    InitialState initialState = new InitialState();
    initialState.setup();
  }

  @After("@API")
  public void writerDownData(Scenario scenario) throws IOException {
    if ("true".equals(params.logRequest)) {
      scenario.write(writerReqest.toString());
    }

  }

  @After()
  public void printData() {
    if ("true".equals(params.displeyRequest)) {
      System.out.println("request: " + response.prettyPrint());
    }
  }
}
