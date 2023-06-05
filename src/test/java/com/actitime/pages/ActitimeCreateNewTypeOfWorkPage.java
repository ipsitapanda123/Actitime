package com.actitime.pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;

public class ActitimeCreateNewTypeOfWorkPage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(name = "name")
	private WebElement nameTextfield;
	
	@FindBy(xpath = "//select[@name='active']")
	private WebElement statusDropdownlist;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement createtypeofworkButton;
	
	public ActitimeCreateNewTypeOfWorkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createworkMethod() throws InterruptedException, IOException
	{
		visibilityofElement(driver, nameTextfield);
		javascriptHighlight(driver, nameTextfield);
		nameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name_work, 1, 0));
		
		selectByText(statusDropdownlist, "archived");
		
		visibilityofElement(driver, createtypeofworkButton);
		javascriptHighlight(driver, createtypeofworkButton);
		javascriptClick(driver, createtypeofworkButton);		
	}
}