package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoWorkshopLogin {
	WebDriver driver;
	
	@Given("Demo workshop homepage is opened")
	public void demo_workshop_homepage_is_opened() {
		
		System.setProperty("webdriver.chrome.driver","C:\\harsh\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("she clicked on Login Link")
	public void she_clicked_on_Login_Link() {
		
		driver.findElement(By.linkText("Log in")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("I send {string} and {string}")
	public void i_send_and(String Login, String Password) {
		
		driver.findElement(By.id("Email")).sendKeys(Login);
		driver.findElement(By.id("Password")).sendKeys(Password);
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("click on Login buttom")
	public void click_on_Login_buttom() {
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("the products page is obtained")
	public void the_products_page_is_obtained() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
