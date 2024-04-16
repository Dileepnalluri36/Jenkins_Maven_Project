package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(tagName="h1")
	WebElement heading;
	
	@FindBy(xpath="//select[@name='fromPort']")
	WebElement departure_city;
	
	@FindBy(xpath = "//select[@name='toPort']")
	WebElement destination_city;
	
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;
	
	public HomePage() {
		
		this.driver = WebDriver_class.getDriverInstance();
		PageFactory.initElements(driver, this);
	}
	
	public void heading_check() {
		String page_title = heading.getText();
		Assert.assertEquals(page_title, "Welcome to the Simple Travel Agency!");
	}
	
	
	public void select_dropdowns(String departureCity ,String destinationCity) {
		Select select = new Select(departure_city);
		select.selectByValue(departureCity.trim());
		
		Select select_dest = new Select(destination_city);
		select_dest.selectByValue(destinationCity.trim());
		
		submit.click();
	}

}
