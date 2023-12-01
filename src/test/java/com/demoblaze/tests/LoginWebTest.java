package com.demoblaze.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoblaze.utils.Demoblazewrappers;
import com.demoblaze.utils.Reports;
import com.demoblaze.utils.Sewrappers;

public class LoginWebTest extends Sewrappers{
	
	Demoblazewrappers demoblaze= new Demoblazewrappers();
	Reports report = new Reports();
	
	@Test
	public void loginWithValidCredentials()
	{
		try
		{
			report.setTCDesc("Validating login in demoblaze with valid credentials");
			launchBrowser("https://www.demoblaze.com/");
			demoblaze.loginDemoblaze("Guviassessment94@gmail.com","Vethanyathiru@1" );
			
		
			String expectedTitle = "STORE";
			Assert.assertEquals(driver.getTitle(),expectedTitle);
			System.out.println(driver.getTitle());
			System.out.println("Assertion passed");

			
			
		}
		catch(Exception ex)
		{
			System.out.println("Problem while login with valid credentials");
			ex.printStackTrace();
		}
	}
}
