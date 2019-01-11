package com.mypack.SampleProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_001 extends BasePage
{

	public static void main(String[] args) throws Exception 
	{
		launch(loadData("chromebrowser"), loadData("amazonurl"));
		
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Sony");
		 driver.findElement(By.id("twotabsearchtextbox")).clear();
		 
		 driver.findElement(By.name("field-keywords")).sendKeys("lg");

		 //driver.findElement(By.className("nav-input")).clear();
		 
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		
		 driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("philips");
		 
		 //driver.findElement(By.linkText("Customer Service")).click();
		 
		 //driver.findElement(By.partialLinkText("Customer Ser")).click();
		 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
			System.out.println(links.get(i).getText());
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");
		String var = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");
		System.out.println(var);
		
		System.out.println("Hello");
		
	}

}
