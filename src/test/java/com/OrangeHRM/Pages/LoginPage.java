package com.OrangeHRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Testbase.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(id="txtUsername")
	WebElement uname;
	
	@FindBy(id="txtPassword")
	WebElement pass;
	
	@FindBy(id="btnLogin")
	WebElement loginbutton;
	
	@FindBy(linkText="Forgot your password?")
	WebElement forgetpass;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String Verifytitle()
	{
		return driver.getTitle();
	}
	public void login()
	{
		uname.sendKeys(prop.getProperty("username"));
		pass.sendKeys(prop.getProperty("password"));
		loginbutton.click();
	}
	
	public void forgetpass()
	{
		forgetpass.click();
		driver.navigate().back();
	}
}
