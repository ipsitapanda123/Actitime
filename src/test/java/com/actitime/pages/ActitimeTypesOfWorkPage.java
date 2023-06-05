package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generics.BasePage;

public class ActitimeTypesOfWorkPage extends BasePage
{
	public WebDriver driver;
	
	@FindBy(xpath = "//span[.='Create Type of Work']")
	private WebElement createtypeofworkButton;
	
	@FindBy(xpath = "//a[.='qspiders']/../..//a[contains(text(),'delete')]")
	private WebElement deleteworkLink;
	
	public ActitimeTypesOfWorkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createtypeofworkMethod() throws InterruptedException
	{
		visibilityofElement(driver, createtypeofworkButton);
		javascriptHighlight(driver, createtypeofworkButton);
		javascriptClick(driver, createtypeofworkButton);		
		Thread.sleep(3000);
	}
	
	public void deleteworkMethod() throws InterruptedException
	{
		visibilityofElement(driver, deleteworkLink);
		javascriptHighlight(driver, deleteworkLink);
		javascriptClick(driver, deleteworkLink);		
		alertAccept(driver);
	}
}