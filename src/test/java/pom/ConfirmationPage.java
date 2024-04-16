package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ConfirmationPage {

	@FindBy(tagName="em")
	WebElement final_amount;
	
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement purchase_button;
	
	@FindBy(xpath="(//tbody//tr/td[2])[1]")
	WebElement purchase_id_ele;
	
	
	
	WebDriver driver;
	
	public ConfirmationPage() {
			
			this.driver = WebDriver_class.getDriverInstance();
			PageFactory.initElements(driver, this);
		}
	
	
	
	public void confirmFlight() {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(final_amount));
		String total_cost = final_amount.getText().trim();
		Assert.assertTrue(total_cost.matches("^\\d{3}+\\.+\\d{2}$"));
		
		purchase_button.click();
		
String purchase_id = purchase_id_ele.getText();
		
		System.out.println("The Purchase ID is: "+ purchase_id);
	}
}
