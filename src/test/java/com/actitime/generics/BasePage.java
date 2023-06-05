package com.actitime.generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	//WebDriver Interface
	public void validateTitleBeforeLogin(WebDriver driver , String expectedTitle)
	{
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle , "both titles not matching");
		Reporter.log("both titles are matching --- successfull login" , true);
	}
	
	public void validateTitleAfterLogout(WebDriver driver , String expectedTitle)
	{
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle , "both titles not matching");
		Reporter.log("both titles are matching --- successfull logout" , true);
	}

	//Select Class
	public void selectByText(WebElement element , String text)
	{
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void selectByValue(WebElement element , String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}
	
	public void selectByIndex(WebElement element , int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public void isMultipleOrNot(WebElement element , boolean expectedResult)
	{
		Select select=new Select(element);
		boolean actualResult=select.isMultiple();
		Assert.assertEquals(actualResult, expectedResult , "not multi selected");
	}
	
	public void getOptionsOfDropdown(WebElement element , String text)
	{
		Select select=new Select(element);
		List<WebElement> allOptions=select.getOptions();
		for(WebElement option : allOptions)
		{
			System.out.println(option.getText());
		}
	}
	
	public void getAllSelectedOptionsOfDropdown(WebElement element , String text)
	{
		Select select=new Select(element);
		List<WebElement> selectedOptions=select.getAllSelectedOptions();
		for(WebElement option : selectedOptions)
		{
			System.out.println(option.getText());
		}
	}
	
	public void getFirstSelectedOptionOfDropdown(WebElement element , String text)
	{
		Select select=new Select(element);
		WebElement firstSelectedOption=select.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());		
	}

	//Actions Class
	public void movetoElement(WebDriver driver , WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	public void clickOnElement(WebDriver driver , WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(element).click().perform();
	}
	
	public void doubleClickOnElement(WebDriver driver , WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(element).doubleClick().perform();
	}
	
	public void contextClickOnElement(WebDriver driver , WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(element).contextClick().perform();
	}
	
	public void dragDropElement(WebDriver driver , WebElement source , WebElement target)
	{
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source,target).perform();
	}
	
	//Robot Class
	public void robotEnter() throws AWTException, InterruptedException
	{
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	//WebDriverWait Class
	public void titleis(WebDriver driver , String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs(title));
	}
	
	public void titleContains(WebDriver driver , String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains(title));
	}

	public void visibilityofElement(WebDriver driver , WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void visibilityofElementLocator(WebDriver driver , WebElement element , By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	//JavascriptExecutor Interface
	public void javascriptClick(WebDriver driver , WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}

	public void javascriptEnter(WebDriver driver , String value , WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(value, element);
	}	

	public void javascriptHighlight(WebDriver driver , WebElement element) throws InterruptedException
	{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'background:yellow')", element);
		Thread.sleep(1000);
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'background:white')", element);
	}

	//Alert Interface
	public void alertAccept(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
	
	public void alertDismiss(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();
	}
}