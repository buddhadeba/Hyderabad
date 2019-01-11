package com.mypack.SampleProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage 
{
	
	public static WebDriver driver;
	public static final String path="./data.properties";
	
	
	public static String loadData(String key) throws Exception
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(path);
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
	}
	
	public static void launch(String browser, String url)
	{
		if(browser.equalsIgnoreCase("CHROME"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FF")) 
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("EDGE"))
		{
			driver=new EdgeDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	
	public int randomNumber() 
	{
		Random r=new Random();
		int rNumber = r.nextInt(99999);
		return rNumber;
	}
	

}
