package com.sgtesting.cssselector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteCSSPath();
		relativeCSSUsingTagNameAlone();
	//	relativeCSSUsingTagNameWithIDAttributeValue();
	//	relativeCSSUsingIDAttributeValue();
	//	relativeCSSUsingTagNameWithClassAttributeValue();
	//	relativeCSSUsingClassAttributeValue();
	//	relativeCSSUsingTagNameWithAttributeNameAndValue();
	//	relativeCSSUsingTagNameWithMultipleAttributeNameAndValue();
	//	relativeCSSUsingAttributeNameAndValue();
	//	relativeCSSUsingParentElement();
	//	relativeCSSUsingnthChildConcept();
	//	relativeCSSUsingnthSiblingConcept();
	//	relativeCSSUsingTagNameWithAttributeNameAlone();
	//	relativeCSSUsingTagNameWithAttributeNameAlone2();
	//	relativeCSSUsingPartialMatchingOfAttributeValue();
	//	relativeCSSUsingTagNameWithAttributeNameAlone3();
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
			oBrowser.get("file:///H:\\EXAMPLE\\sample\\Sample.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void absoluteCSSPath()
	{
		oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 1: Identify the Element based on <tagName>
	 * Syntax:
	 * <tagName>
	 */
	static void relativeCSSUsingTagNameAlone()
	{
		oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 2: Identify based on <tagName> with id attribute value
	 * Syntax:
	 * <tagName>#<id attribute value>
	 */
	static void relativeCSSUsingTagNameWithIDAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 3: Identify based on <tagName> with id attribute value
	 * Syntax:
	 * #<id attribute value>
	 */
	static void relativeCSSUsingIDAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 4: Identify based on <tagName> with class attribute value
	 * Syntax:
	 * <tagName>.<class attribute value>
	 */
	static void relativeCSSUsingTagNameWithClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 5: Identify based on class attribute value
	 * Syntax:
	 * .<class attribute value>
	 */
	static void relativeCSSUsingClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 6: Identify based on tagName with attribute name and value
	 * Syntax:
	 * <tagName>[attribute name='attribute value']
	 */
	static void relativeCSSUsingTagNameWithAttributeNameAndValue()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit']")).click();	
	}
	
	/**
	 * Case 7: Identify based on tagName with Multiple attribute name and value
	 * Syntax:
	 * <tagName>[attribute name='attribute value'][attribute name='attribute value']
	 */
	static void relativeCSSUsingTagNameWithMultipleAttributeNameAndValue()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit'][name='submit1btn1']")).click();	
	}
	
	
	/**
	 * Case 8: Identify based attribute name and value
	 * Syntax:
	 * *[attribute name='attribute value']
	 */
	static void relativeCSSUsingAttributeNameAndValue()
	{
		oBrowser.findElement(By.cssSelector("*[value='Submit']")).click();	
	}
	
	/**
	 * Case 9: Identify based on parent Element reference
	 * Syntax:
	 * <parent Element> > <child Element>
	 */
	static void relativeCSSUsingParentElement()
	{
		oBrowser.findElement(By.cssSelector("form#frm2 > input")).click();
	}
	
	/**
	 * Case 10: Identify based on nth Child reference
	 * Syntax:
	 * nth-child(element number)
	 */
	static void relativeCSSUsingnthChildConcept()
	{
		oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(5)")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 11: Identify based on sibling concept
	 * Syntax:
	 * <tagName> + <tagName> + N
	 */
	static void relativeCSSUsingnthSiblingConcept()
	{
		oBrowser.findElement(By.cssSelector("form#frm3 > input + input + input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 12: Identify based on tagName with attribute name
	 * Syntax:
	 * <tagName>[attribute name]
	 */
	static void relativeCSSUsingTagNameWithAttributeNameAlone()
	{
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		System.out.println("# of Links :"+olinks.size());
	}
	
	static void relativeCSSUsingTagNameWithAttributeNameAlone2()
	{
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String linktext=link.getText();
			if(linktext.endsWith("Tool"))
			{
				link.click();
				break;
			}
		}
		oBrowser.navigate().back();
	}
	//org.openqa.selenium.StaleElementReferenceException:
	static void relativeCSSUsingTagNameWithAttributeNameAlone3()
	{
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String linktext=link.getText();
			if(linktext.endsWith("Tool"))
			{
				link.click();
			}
		}
		
	}
	
	/**
	 * Case 13: Partial Matching of Attribute Value
	 * Syntax:
	 * ^=  starts-with
	 * $=  ends-with
	 * *=  contains
	 * <tagName>[attribute name ^= 'partial content']
	 * <tagName>[attribute name $= 'partial content']
	 * <tagName>[attribute name *= 'partial content']
	 */
     static void relativeCSSUsingPartialMatchingOfAttributeValue()
     {
    //	 oBrowser.findElement(By.cssSelector("input[id *= 'submit1']")).click();
    	 oBrowser.findElement(By.cssSelector("input[id ^= 'btn1']")).click();
     }
}
