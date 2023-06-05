package com.actitime.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.actitime.generics.BaseTest1;
import com.actitime.pages.ActitimeCreateNewCustomerPage;
import com.actitime.pages.ActitimeHomePage;
import com.actitime.pages.ActitimeLoginPage;
import com.actitime.pages.ActitimeTasksPage;

public class TC2_CreateCustomerLogout extends BaseTest1
{
	@Test
	public void createCustomer() throws InterruptedException, IOException
	{		
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
		
		ActitimeHomePage homePage=new ActitimeHomePage(driver);
		homePage.tasksMethod();
		
		ActitimeTasksPage tasksPage=new ActitimeTasksPage(driver);
		tasksPage.addnewMethod();
		tasksPage.newcustomerMethod();
		
		ActitimeCreateNewCustomerPage customerPage=new ActitimeCreateNewCustomerPage(driver);
		customerPage.createcustomerMethod();
		
		homePage.logoutMethod();
		
	}
}