package com.OangeHRM.Testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.OrangeHRM.Pages.LoginPage;
import com.OrangeHRM.Testbase.TestBase;



public class LoginTest extends TestBase {
	LoginPage loginn;
	String title;
public LoginTest()
{
	super();
}
@BeforeSuite
public void Launch()
{
	initialization();
	loginn=new LoginPage();
}
@Test
public void Checktitle()
{
	title=loginn.Verifytitle();
	Assert.assertEquals(title, "OrangeHRM");
}
@Test
public void logindetails()
{
	loginn.login();
}
@Test
public void forgetpassword()
{
	loginn.forgetpass();
}
}

