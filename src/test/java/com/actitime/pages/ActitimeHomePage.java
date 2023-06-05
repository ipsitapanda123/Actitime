package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generics.BasePage;

public class ActitimeHomePage extends BasePage
{
	public WebDriver driver;
	
	@FindBy(id = "container_tasks")
	private WebElement tasksLink;
	
	@FindBy(id = "container_users")
	private WebElement usersLink;
	
	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;
	
	@FindBy(id = "logoutLink")
	private WebElement logoutLink;
	
	public ActitimeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void tasksMethod() throws InterruptedException
	{
		visibilityofElement(driver, tasksLink);
		javascriptHighlight(driver, tasksLink);
		javascriptClick(driver, tasksLink);
	}
	
	public void usersMethod() throws InterruptedException
	{
		visibilityofElement(driver, usersLink);
		javascriptHighlight(driver, usersLink);
		javascriptClick(driver, usersLink);
	}
	
	public void settingsMethod() throws InterruptedException
	{
		visibilityofElement(driver, settingsLink);
		javascriptHighlight(driver, settingsLink);
		javascriptClick(driver, settingsLink);
	}
	
	public void logoutMethod() throws InterruptedException
	{
		visibilityofElement(driver, logoutLink);
		javascriptHighlight(driver, logoutLink);
		javascriptClick(driver, logoutLink);
	}	
	
	public void titlevalidate()
	{
		titleis(driver, "actiTIME - Login");
		validateTitleAfterLogout(driver, "actiTIME - Login");
	}
}