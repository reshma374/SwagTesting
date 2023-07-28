package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class loginPage {

	WebDriver driver = null;

	By textbox_UserName=By.id("user-name");
	By textbox_password=By.id("password");
	By button_login=By.id("login-button");
	By add_to_Cart=By.id("add-to-cart-sauce-labs-backpack");

	public loginPage(WebDriver driver) {

		this.driver=driver;

	}

	public void setTextInUserName(String username)
	{
		driver.findElement(textbox_UserName).sendKeys(username);
	}

	public void setTextInPassword(String password)
	{
		driver.findElement(textbox_password).sendKeys(password);
	}

	public void clickLogin()
	{
		driver.findElement(button_login).click();
		
	}

	public void check_shoppingcart_link()
	{
		driver.findElement(add_to_Cart).click();
		
	}
	public void loginValidUser(String username,String password)
	{
		driver.findElement(textbox_UserName).sendKeys(username);
		driver.findElement(textbox_password).sendKeys(password);
		driver.findElement(button_login).click();
		
	}
}

