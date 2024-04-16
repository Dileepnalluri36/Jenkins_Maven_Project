package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightBooking {

	@FindBy(xpath = "//table//tr/td[6]")
	List<WebElement> price_elements;

	@FindBy(xpath = "//table//tr/td[1]")
	List<WebElement> flight_book_button_list;

	WebDriver driver;

	public FlightBooking() {

		this.driver = WebDriver_class.getDriverInstance();
		PageFactory.initElements(driver, this);
	}

	public void book_flight() {
//	List<WebElement> price_elements = driver.findElements(By.xpath("//table//tr/td[6]"));
		double cheapest_flight = Double.parseDouble(price_elements.get(0).getText().substring(1));
		int cheapest = 0;
		for (int i = 0; i < price_elements.size(); i++) {
			double each_price = Double.parseDouble(price_elements.get(i).getText().substring(1));
			if (each_price < cheapest_flight) {
				cheapest = i;
				cheapest_flight = each_price;
			}
		}
		System.out.println(cheapest_flight);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(flight_book_button_list.get(cheapest)));

		flight_book_button_list.get(cheapest).click();

	}

}
