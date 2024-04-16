package stepDefs;

import io.cucumber.java.en.*;
import pom.ConfirmationPage;
import pom.FlightBooking;
import pom.HomePage;
import pom.VacationPage;

public class EndToEndStepDef {

	HomePage homePage = new HomePage();
	VacationPage vacationPage = new VacationPage();
	FlightBooking flightBooking = new FlightBooking();
	ConfirmationPage confirmPage = new ConfirmationPage();
	@When("I login to home page and get the title")
	public void home_page_heading_check() {
		homePage.heading_check();
	}
	
	@Then("I navigate to vacation page and assert the title")
	public void vacation_page_check() {
		vacationPage.title_check();
	}
	
	@Then("I navigate to home page and select the dropdowns with cities {string} and {string}")
	public void select_dropdowns(String departureCity, String destinationCity) {
		homePage.select_dropdowns(departureCity,destinationCity);
	}
	
	@Then("I will book the flight")
	public void book_flight() {
		flightBooking.book_flight();
	}
	
	@Then("I will confirm the flight")
	public void confirm_flight() {
		confirmPage.confirmFlight();
	}
}
