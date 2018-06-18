
import babysdays.api.models.login.LoginForm;
import cucumber.api.CucumberOptions;

import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.testng.CucumberFeatureWrapper;
import java.util.Properties;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.DefaultParams;
import stepdefs.BaseClass;
import static stepdefs.BaseClass.section;

@CucumberOptions(
        monochrome = true,
        features = "src/test/features",
        glue = {"stepdefs"},
        format = {
          "pretty",
          "html:target/cucumber-report/html",
          "json:target/cucumber-report/cucumber.json",
          "rerun:target/cucumber-report/rerun.txt"
        })
public class TestRunner {

  private TestNGCucumberRunner testNGCucumberRunner;
  
  public String Section = "default";
  
  public TestRunner() {
    Properties p = System.getProperties();
    String section = p.getProperty("typeSystem");
     
    if(Section != null) {
      setSection(section);
    } else {
      System.out.println("-----=================================------\n"
              + "The parameter 'typeSystem' was not specified, the default settings will be"
              + "\n(\"-----=================================------\\");
    }
    
  }

  public final void setSection(String section) {
    this.Section = section;
  }

 
  
  
  @BeforeClass(alwaysRun = true)
  public void setUpClass() throws Exception {
    
    BaseClass.setSection(section);
    BaseClass.setLoginForm(new LoginForm(section));
    BaseClass.setBaseHost(DefaultParams.loadData(section, "BseURL"));

    testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
  }

  @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
  public void feature(CucumberFeatureWrapper cucumberFeature) {
    testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
  }

  @DataProvider
  public Object[][] features() {
    return testNGCucumberRunner.provideFeatures();
  }

  @AfterClass(alwaysRun = true)
  public void tearDownClass() throws Exception {
    testNGCucumberRunner.finish();
  }
}
