package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

	WebDriver driver= new ChromeDriver();
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
	}

	@When("^User enter valid credentials$")
	public void user_enter_valid_credentials() throws Throwable {
	    
		WebElement txt_email=driver.findElement(By.xpath("//input[@placeholder='Email']"));
		
		WebElement txt_password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		
		
		
		txt_email.sendKeys("iamhasan097@gmail.com");
		
		Thread.sleep(3000);
		txt_password.sendKeys("dhvd@sf3");
		Thread.sleep(3000);
		
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    
		WebElement btn_Login=driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		
		btn_Login.click();
		Thread.sleep(3000);
	}

	@Then("^User should be able to see homepage$")
	public void user_should_be_able_to_see_homepage() throws Throwable {
	    
		WebElement icon_Home=driver.findElement(By.xpath("//i[@class='home icon']"));
		
		Assert.assertTrue(icon_Home.isDisplayed());
		Thread.sleep(2000);
	}
	
	@And("^logout from the page$")
	public void logout_from_the_page() throws Throwable {
	    
		WebElement btn_Settings=driver.findElement(By.xpath("//div[@class='ui buttons']//div[@role='listbox']"));
		WebElement btn_LogOut=driver.findElement(By.xpath("//div[@role='listbox']//div//a//span[contains(text(),'Out')]"));
	
		btn_Settings.click();
		Thread.sleep(2000);
		btn_LogOut.click();
	}
	
	
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) throws InterruptedException {

		WebElement txt_email=driver.findElement(By.xpath("//input[@placeholder='Email']"));
		
		WebElement txt_password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		
		
		
		txt_email.sendKeys(string);
		
		Thread.sleep(3000);
		txt_password.sendKeys(string2);
		Thread.sleep(3000);
		
	}
	
	@Then("User should be able to see {string}")
	public void user_should_be_able_to_see_message(String string) throws Throwable {
	    
		//WebElement icon_Home=driver.findElement(By.xpath("//i[@class='home icon']"));
		
		WebElement txt_invalidCred=driver.findElement(By.xpath("//p[normalize-space()='Invalid login']"));
		
		//Assert.assertTrue(icon_Home.isDisplayed());
				
		Assert.assertEquals(string,txt_invalidCred.getText());
		Thread.sleep(2000);
	}
	
	
	@After
	public void TearDown() throws Throwable {
		
		driver.quit();
	}
	

	 
}
