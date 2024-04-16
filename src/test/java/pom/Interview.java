package pom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class Interview {
	
	WebDriver driver;
	
	@Test
	public void EndToEnd() throws IOException {
		
//		driver = new ChromeDriver();
//		driver.get("https://blazedemo.com/index.php");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriver_class.getDriverInstance();
		WebDriver_class.loginDetails();
		
		HomePage homePage = new HomePage();
		VacationPage vacationPage = new VacationPage();
		FlightBooking flightBooking = new FlightBooking();
		ConfirmationPage confirmPage = new ConfirmationPage();
//		1.Check if the title is displayed as ` Welcome to the Simple Travel Agency!`. This is the Home Page of
//		application
		
		
//		String page_title = driver.findElement(By.tagName("h1")).getText();
//		Assert.assertEquals(page_title, "Welcome to the Simple Travel Agency!");
		
		homePage.heading_check();
		
//		2. Click on ` destination of the week! The Beach!` hyperlink and see if a new tab opens in your
//		browser &amp; the url has string `vacation`. Navigate back to home page tab.
		vacationPage.title_check();
//		driver.findElement(By.xpath("//a[@href='vacation.html']")).click();
//		String vacation_page_title = driver.getTitle();
//		Assert.assertTrue(vacation_page_title.contains("vacation"));
//		driver.navigate().back();
		
//		3. Purchase a ticket:
//			a. Select `Mexico City` in departure city &amp; `London` in destination city.
		
//		WebElement departure_city = driver.findElement(By.xpath("//select[@name='fromPort']"));
//		Select select = new Select(departure_city);
//		select.selectByValue("Mexico City");
//		
//		WebElement destination_city = driver.findElement(By.xpath("//select[@name='toPort']"));
//		Select select_dest = new Select(destination_city);
//		select_dest.selectByValue("London");
		
//		b. Click ‘Find Flights’. Select the flight with lowest price by clicking `Choose the flight` &amp; see if
//		we are navigated to purchase page (This should be dynamically handled and can work for
//		any inputs in Step 3.a)
		
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		homePage.select_dropdowns("Mexico City","London");
		
//		List<WebElement> price_elements = driver.findElements(By.xpath("//table//tr/td[6]"));
//		double cheapest_flight = Double.parseDouble(price_elements.get(0).getText().substring(1));
//		int cheapest = 0;
//		System.out.println(cheapest_flight);
//		for(int i=0; i<price_elements.size();i++) {
//			double each_price =Double.parseDouble(price_elements.get(i).getText().substring(1));
//			if(each_price<cheapest_flight) {
//				cheapest = i;
//				cheapest_flight = each_price;
//			}
//		}
//		System.out.println(cheapest);
//		driver.findElements(By.xpath("//table//tr/td[1]")).get(cheapest).click();
		flightBooking.book_flight();
		
		confirmPage.confirmFlight();
//		String total_cost = driver.findElement(By.tagName("em")).getText().trim();
		
//		c.Check if a field named ‘Total Cost’ is available with price available in xxx.xx format. Click on
//		‘Purchase flight’ button
//		Assert.assertTrue(total_cost.matches("^\\d{3}+\\.+\\d{2}$"));
//	
//		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
//		
//		d. Check if the user is navigated to Purchase Confirmation page &amp; store the `Id’ in the console
//		or test report for future reference.
		
//		String purchase_id = driver.findElement(By.xpath("(//tbody//tr/td[2])[1]")).getText();
//		
//		System.out.println("The Purchase ID is: "+ purchase_id);
	
		WebDriver_class.quitDriverInstance();
	}

}
