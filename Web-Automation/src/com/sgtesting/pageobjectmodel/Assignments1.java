package com.sgtesting.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments1 {
	public static WebDriver oBrowser=null;
	public static  ActiTimePage1 oPage=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyWindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();
		
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "H:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new  ActiTimePage1(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:81/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void login()
	{
		try
		{
          oPage.getUserName().sendKeys("admin");
          oPage.getPassword().sendKeys("manager");
          oPage.getLogin().click();
          Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyWindow()
	{
		try
		{
			oPage.gettingStartedShortcutsPanelId().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createUser()
	{
		try
		{
			oPage.getUsers().click();
			Thread.sleep(2000);
			oPage.getAddUser().click();
			Thread.sleep(2000);
			oPage.getFname().sendKeys("Demo");
			Thread.sleep(2000);
			oPage.getlname().sendKeys("User1");
			Thread.sleep(2000);
			oPage.getEmail().sendKeys("demo@gmail.com");
			Thread.sleep(2000);
			oPage.getUserName1().sendKeys("DemoUser1");
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("1234");
			Thread.sleep(2000);
			oPage.getRetypePassword().sendKeys("1234");
			Thread.sleep(2000);
			oPage.getCommit().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deleteUser()
	{
		try
		{
			oPage.getselect().click();
			Thread.sleep(2000);
			oPage.getdelete().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
}
