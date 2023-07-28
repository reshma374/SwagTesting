package StepDefinitions;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginPage;


public class LoginSteps {
	WebDriver driver=null;
	loginPage login;
	
	

	

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("i am on the page");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		////driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	   
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		//System.out.println("abc");
		driver.navigate().to("https://www.saucedemo.com/");
		login = new loginPage(driver);
		//login.setTextInUserName("standard_user");
		//login.setTextInPassword("secret_sauce");
		
	  
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) throws InterruptedException {
		System.out.println(username);


		login = new loginPage(driver);
		login.setTextInUserName(username);
		login.setTextInPassword(password);
		Thread.sleep(2000);

	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		login.clickLogin();
		//login.sendKeys(Keys.ENTER);
		//driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
	    
	}

	@Then("user is navigated to the inventory page")
	public void user_is_navigated_to_the_inventory_page() throws InterruptedException {
		login.check_shoppingcart_link();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}



}
