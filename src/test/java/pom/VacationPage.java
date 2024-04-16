package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VacationPage {

	WebDriver driver;
	
	
	@FindBy(xpath="//a[@href='vacation.html']")
	WebElement heading;

	public VacationPage() {

		this.driver = WebDriver_class.getDriverInstance();
		PageFactory.initElements(driver, this);
	}

	public void title_check() {
		heading.click();
		String vacation_page_title = driver.getTitle();
		Assert.assertTrue(vacation_page_title.contains("vacation"));
		driver.navigate().back();
	}

}
