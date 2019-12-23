package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudy4UnsuccessfulCart {
	
	WebDriver driver;
	String a;
	@Given("Alex has registered in to TestMeApp")
	public void alex_has_registered_in_to_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\harsh\\chromedriver_win32\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp"); driver.findElement(By.linkText("SignIn")).click();
		 driver.findElement(By.name("userName")).sendKeys("Alex");
		 driver.findElement(By.id("password")).sendKeys("Alex123");
		 driver.findElement(By.name("Login")).click();
	    
	}

	@When("Alex search to a particular product like headphones")
	public void alex_search_to_a_particular_product_like_headphones() {
		
		driver.findElement(By.id("myInput")).sendKeys("Headphone");
		 driver.findElement(By.cssSelector("input[type='submit']")).click();
	   
	}

	@When("try to proceed to payment without adding any item in the cart")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
		
		driver.findElement(By.partialLinkText("Cart")).click();
		
		
          
		/*a=driver.findElement(By.cssSelector("a[href='displayCart.htm']")).getText();
		 System.out.println(a);
		 if(a.matches("Cart 1   "))
		 {
			 System.out.println("item is added to cart successfully");
		 }
		 else
		 {
			 System.out.println("Cart is empty");
		 }*/
	    
	}

	@Then("Test MeApp doesn't display the cart icon")
	public void test_MeApp_doesn_t_display_the_cart_icon() {
		Assert.assertEquals("Cart 1   ", driver.findElement(By.linkText("Cart 1   ")));
		System.out.println("Items added to cart successfuly");
	}
	

}
