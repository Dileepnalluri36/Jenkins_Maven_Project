package runners;

import org.testng.annotations.*;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import pom.WebDriver_class;

@CucumberOptions(
		
		features="src/test/resources/features",
		glue="stepDefs",
		tags="@EndToEndScenario",
		monochrome = true
		
		)


public class TestRunner extends AbstractTestNGCucumberTests {

	
	@BeforeMethod
	public void before_method(){
		
		WebDriver_class.getDriverInstance();
		WebDriver_class.loginDetails();
	}
	
	@AfterMethod
	public void after_method() {
		WebDriver_class.quitDriverInstance();
	}
	
}
