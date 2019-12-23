package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo1 
{
	WebDriver driver;
	
	@Given("The user is on testme app homepage")
	public void the_user_is_on_testme_app_homepage() {
		
		System.setProperty("webdriver.chrome.driver","C:\\harsh\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.findElement(By.linkText("SignIn")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("the user gives valid login and valid password")
	public void the_user_gives_valid_login_and_valid_password() {
		
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Login Successful");
		
	    //throw new cucumber.api.PendingException();
	}
	
	

}
