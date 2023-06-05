package com.actitime.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.actitime.generics.BaseTest1;
import com.actitime.pages.ActitimeHomePage;
import com.actitime.pages.ActitimeLoginPage;

public class TC1_ActitimeLoginLogout extends BaseTest1
{
	@Test
	public void loginlogout() throws IOException, InterruptedException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
		loginPage.titlevalidate();
		
		ActitimeHomePage homePage=new ActitimeHomePage(driver);
		homePage.logoutMethod();
		homePage.titlevalidate();
	}
}