package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_class {
	
	private static WebDriver driver;
	
	public static WebDriver getDriverInstance() {
		
		if(driver == null) {
			
			driver = new ChromeDriver();
		}
		
		return driver;
		
	}
	
	public static void loginDetails() {
		driver.get("https://blazedemo.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public static void quitDriverInstance() {
		
		if(driver!= null) {
			driver.quit();
			driver= null;
		}
	}

}
