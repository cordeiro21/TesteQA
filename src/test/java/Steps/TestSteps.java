package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import pages.TestPage;

public class TestSteps {
	
	WebDriver driver = null;
	TestPage test;

	
	@Given("Eu como usuario abro o navegador")
	public void browser_open() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		
		System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/resources/drivers/geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	
	}
	
	@And("Acesso o portal desejado")
	public void user_is_on_page() {
		
		driver.navigate().to("http://sampleapp.tricentis.com/101/app.php");
		
	}
	
	@When("^Preencho os dados do veiculo (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
	public void user_enters(String make, String model, String cylindercapacity, String engineperformance, String dateofmanufacture, String numberofseats, String righthanddriveyes, String numberofseatsmotorcycle, String fuel, String payload, String totalweight, String listprice, String licenseplatenumber, String annualmileage) 
			
			throws InterruptedException  {
		
		test = new TestPage(driver);
		
		test.enterMake(make);
		test.enterModel(model);
		test.enterCylinderCapacity(cylindercapacity);
		test.enterEnginePerformance(engineperformance);
		test.enterDateofManufacture(dateofmanufacture);
		test.enterNumberofSeats(numberofseats);
		test.enterRighthandDriveyes(righthanddriveyes);
		test.enterNumberofSeatsMotorcycle(numberofseatsmotorcycle);
		test.enterFuel(fuel);
		test.enterPayload(payload);
		test.enterTotalWeight(totalweight);
		test.enterListprice(listprice);
		test.enterLicensePlatenumber(licenseplatenumber);
		test.enterAnnualMileage(annualmileage);
		
		
		Thread.sleep(2000);
		
	}	
		
	@Then("Avanco para o proximo formulario")
	public void next_step() {
		
		test.clickNext();
	}
	


	
}
