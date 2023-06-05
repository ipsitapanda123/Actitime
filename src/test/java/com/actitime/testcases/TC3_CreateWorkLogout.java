package com.actitime.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.actitime.generics.BaseTest1;
import com.actitime.pages.ActitimeCreateNewTypeOfWorkPage;
import com.actitime.pages.ActitimeHomePage;
import com.actitime.pages.ActitimeLoginPage;
import com.actitime.pages.ActitimeSettingsPage;
import com.actitime.pages.ActitimeTypesOfWorkPage;

public class TC3_CreateWorkLogout extends BaseTest1
{
	@Test
	public void creatework() throws InterruptedException, IOException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
		
		ActitimeHomePage homePage=new ActitimeHomePage(driver);
		homePage.settingsMethod();
		
		ActitimeSettingsPage settingsPage=new ActitimeSettingsPage(driver);
		settingsPage.typesofworkMethod();
		
		ActitimeTypesOfWorkPage workPage=new ActitimeTypesOfWorkPage(driver);
		workPage.createtypeofworkMethod();
		
		ActitimeCreateNewTypeOfWorkPage createWork=new ActitimeCreateNewTypeOfWorkPage(driver);
		createWork.createworkMethod();
		
		homePage.logoutMethod();
	}
}