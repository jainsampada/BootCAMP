package com.OrangeHRM.Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
	public static String path;
	public TestBase()
	{
		try {
			FileInputStream ip=new FileInputStream("E:\\Sampada\\Bootcamp\\com.OrangeHRM.POM\\src\\test\\java\\com\\OrangeHRM\\configuration\\config.properties");
			prop=new Properties();
			prop.load(ip);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		public static void initialization()
		{
			WebDriverManager.chromedriver().setup();
			//path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
			//System.setProperty("webdriver.chrome.driver","E:\\Sampada\\Bootcamp\\com.OrangeHRM.POM\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			driver.get(prop.getProperty("url"));
			
		}
}
