package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithWebElementDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		withWebElement();
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "H:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void withWebElement()
	{
		WebElement oEle=null;
		try
		{
			oEle=oBrowser.findElement(By.id("username"));
			oEle.sendKeys("DemoUser1");
			Thread.sleep(2000);
			oEle.clear();
			Thread.sleep(2000);
			oEle.sendKeys("DemoUser2");
			Thread.sleep(2000);
			oEle.clear();
			Thread.sleep(2000);
			oEle.sendKeys("DemoUser3");
			Thread.sleep(2000);
			oEle.clear();
			Thread.sleep(2000);
			oEle.sendKeys("DemoUser12345");
			Thread.sleep(2000);
			String val=oEle.getAttribute("value");
			System.out.println(val);
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}
