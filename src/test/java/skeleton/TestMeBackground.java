package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestMeBackground {
	WebDriver driver;
	@Given("Harsh launched chrome browser")
	public void harsh_launched_chrome_browser() {
	
	System.setProperty("webdriver.chrome.driver","C:\\harsh\\chromedriver_win32\\chromedriver.exe");	
	driver=new ChromeDriver();
	
	}

	@Given("opens testMe app link")
	public void opens_testMe_app_link() {
		driver.get("http://10.232.237.143:443/TestMeApp");
		
	   
	}

	@When("he clicks on SignIn")
	public void he_clicks_on_SignIn() {
		
		
		driver.findElement(By.name("Login")).click();
		   
	   
	}

	@Then("he shall be able to provide credentials")
	public void he_shall_be_able_to_provide_credentials() {
	    
	}

	@When("he clicks on SignUp")
	public void he_clicks_on_SignUp() {
		driver.findElement(By.linkText("SignIn")).click();

	    
	}

	@Then("he shall be able to provide registeration details")
	public void he_shall_be_able_to_provide_registeration_details() {
	    
	}

}
