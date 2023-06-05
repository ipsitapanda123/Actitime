package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generics.BasePage;

public class ActitimeSettingsPage extends BasePage
{
	public WebDriver driver;
	
	@FindBy(xpath = "//a[.='Types of Work']")
	private WebElement typesofworkLink;

	@FindBy(xpath = "//a[.='Leave Types']")
	private WebElement leavetypesLink;

	public ActitimeSettingsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void typesofworkMethod() throws InterruptedException
	{
		visibilityofElement(driver, typesofworkLink);
		javascriptHighlight(driver, typesofworkLink);
		javascriptClick(driver, typesofworkLink);
	}

	public void leavetypesMethod() throws InterruptedException
	{
		visibilityofElement(driver, leavetypesLink);
		javascriptHighlight(driver, leavetypesLink);
		javascriptClick(driver, leavetypesLink);
	}
}