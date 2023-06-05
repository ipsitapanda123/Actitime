package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generics.BasePage;

public class ActitimeTasksPage extends BasePage
{
	public WebDriver driver;
		
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnewButton;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement newcustomerLink;
	
	@FindBy(xpath = "//div[@class='item createNewProject']")
	private WebElement newprojectLink;
	
	public ActitimeTasksPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addnewMethod() throws InterruptedException
	{
		visibilityofElement(driver, addnewButton);
		javascriptHighlight(driver, addnewButton);
		javascriptClick(driver, addnewButton);
	}
	
	public void newcustomerMethod() throws InterruptedException
	{
		visibilityofElement(driver, newcustomerLink);
		javascriptHighlight(driver, newcustomerLink);
		javascriptClick(driver, newcustomerLink);
	}
	
	public void newprojectMethod() throws InterruptedException
	{
		visibilityofElement(driver, newprojectLink);
		javascriptHighlight(driver, newprojectLink);
		javascriptClick(driver, newprojectLink);
	}
}