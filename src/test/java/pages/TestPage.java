package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestPage {
	
	protected WebDriver driver;
	

	

	public TestPage(WebDriver driver) {	

		
		this.driver = driver;
	
	}	

	public void enterMake(String make) {
		
		driver.findElement(By.id("make")).sendKeys(make);
		
	}
	
	public void enterModel(String model) {
		
		driver.findElement(By.id("model")).sendKeys(model);
		
	}
	
	public void enterCylinderCapacity(String cylindercapacity) {
		
		driver.findElement(By.id("cylindercapacity")).sendKeys(cylindercapacity);
		
	}
	
	public void enterEnginePerformance(String engineperformance) {
		
		driver.findElement(By.id("engineperformance")).sendKeys(engineperformance);
		
	}
	
	public void enterDateofManufacture(String dateofmanufacture) {
		
		driver.findElement(By.id("dateofmanufacture")).sendKeys(dateofmanufacture);
		
	}
	
	public void enterNumberofSeats(String numberofseats) {
		
		driver.findElement(By.id("numberofseats")).sendKeys(numberofseats);
		
	}
	
	public void enterRighthandDriveyes(String righthanddriveyes) {
		
		driver.findElement(By.id("righthanddriveyes")).sendKeys(righthanddriveyes);
		
	}

	public void enterNumberofSeatsMotorcycle(String numberofseatsmotorcycle) {
	
		driver.findElement(By.id("numberofseatsmotorcycle")).sendKeys(numberofseatsmotorcycle);
	
	}
	
	public void enterFuel(String fuel) {
		
		driver.findElement(By.id("fuel")).sendKeys(fuel);
		
	}
	
	public void enterPayload(String payload) {
		
		driver.findElement(By.id("payload")).sendKeys(payload);
		
	}
	
	public void enterTotalWeight(String totalweight) {
		
		driver.findElement(By.id("totalweight")).sendKeys(totalweight);
		
	}
	
	public void enterListprice(String listprice) {
		
		driver.findElement(By.id("listprice")).sendKeys(listprice);
		
	}
	
	public void enterLicensePlatenumber(String licenseplatenumber) {
		
		driver.findElement(By.id("licenseplatenumber")).sendKeys(licenseplatenumber);
		
	}
	
	public void enterAnnualMileage(String annualmileage) {
		
		driver.findElement(By.id("annualmileage")).sendKeys(annualmileage);
		
	}
	
	public void clickNext() {
		
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}
	
	public void enterFirstName(String firstname) {
		
		driver.findElement(By.id("firstname")).sendKeys(firstname);
		
	}	
	
	public void enterLastName(String lastname) {
		
		driver.findElement(By.id("lastname")).sendKeys(lastname);
		
	}
	
	
	
	public void enterBirthdate(String birthdate) {
		
		driver.findElement(By.id("birthdate")).sendKeys(birthdate);
		
	}
	
	public void enterStreetAddress(String streetaddress) {
		
		driver.findElement(By.id("streetaddress")).sendKeys(streetaddress);
		
	}
	
	public void enterCountry(String country) {
		
		driver.findElement(By.id("country")).sendKeys(country);
		
	}
	
	public void enterZipCode(String zipcode) {
		
		driver.findElement(By.id("zipcode")).sendKeys(zipcode);
		
	}
	
	public void enterOccupation(String occupation) {
		
		driver.findElement(By.id("occupation")).sendKeys(occupation);
		
	}
	
	public void clickButton() {
		
		driver.findElement(By.id("speeding")).click();
	}
	
	
	
	

}
