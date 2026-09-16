package TestRunner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Appium.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


      @SuppressWarnings("deprecation")
	@CucumberOptions(features = "src/test/java/FeatureFile",
      dryRun = false, 
      //tags="@test",
      glue = "StepDefenition", 
      plugin = {"pretty", "html:target/html/report.html" })
 @RunWith(Cucumber.class)
public class TestRunner extends BaseClass {
	@BeforeClass
	public static void start() throws IOException {
		BaseClass.BrowserLaunch();
	}

	@AfterClass
	public static void end() {
		//closeApp();

	}


}
