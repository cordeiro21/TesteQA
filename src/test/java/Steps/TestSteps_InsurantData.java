package Steps;

import io.cucumber.java.en.*;
import pages.TestPage;

public class TestSteps_InsurantData {
	
	TestPage test;

	
	@When ("Preencho os dados")
	public void user_enters(String firstname, String lastname, String birthdate, String streetaddress, String country, String zipcode, String occupation) throws InterruptedException  {
		
		
		
		test.enterFirstName(firstname);
		test.enterLastName(lastname);
		test.enterBirthdate(birthdate);
		test.enterStreetAddress(streetaddress);
		test.enterCountry(country);
		test.enterZipCode(zipcode);
		test.enterOccupation(occupation);
		
		
		
		Thread.sleep(2000);
		
	}	
		
	@Then("Avanco para o proximo formulario Product Data")
	public void next_step() {
		
		test.clickNext();
	}

}
