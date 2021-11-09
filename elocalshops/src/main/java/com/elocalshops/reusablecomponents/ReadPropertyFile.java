package com.elocalshops.reusablecomponents;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ReadPropertyFile {

	public static WebDriver driver;
	public Properties p;

	public WebDriver DriverInitialisation() throws IOException {
		// TODO Auto-generated method stub
		p = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\N L Yashaswini\\git\\github-demo2\\elocalshops\\testdata\\config.properties");
		p.load(fis);	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\N L Yashaswini\\git\\github-demo2\\elocalshops\\driver\\chromedriver.exe");
		Dimension di=new Dimension(400,525);
	
		

		Map<String, String> mobileEmulation = new HashMap<String,String>();

	   mobileEmulation.put("deviceName", "Galaxy S5");

		Map<String, Object> chromeOptions= new HashMap<String,Object>(); 
		chromeOptions.put("mobileEmulation", mobileEmulation);
	

		DesiredCapabilities capabilities=DesiredCapabilities.chrome();

		capabilities.setCapability(ChromeOptions.CAPABILITY,chromeOptions);

		WebDriver driver=new ChromeDriver(capabilities);
		
		
		driver.get ("https://www.amazon.in"); 
		driver.manage().window().setSize(di);
		
		driver.findElement(By.cssSelector ("input[type='text']")).sendKeys ("Refrigerator");
		driver.findElement(By.cssSelector ("input[type='submit']")).click();
		return driver;
	}


}
