package com.demoblaze.utils;

import org.openqa.selenium.support.PageFactory;

import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.LoginPage;
import com.demoblaze.pages.SignupPage;

public class Demoblazewrappers extends Sewrappers{
	
	public void signupDemoblaze(String username,String password)
	
	{
		SignupPage signupPage = PageFactory.initElements(driver, SignupPage.class);
		signupPage.clickSignup();
		signupPage.setUserName(username);
		signupPage.setPassword(password);
		signupPage.clickSignupButton();
	}
	
	public void loginDemoblaze(String username,String password)
	{
		LoginPage loginPage =PageFactory.initElements(driver, LoginPage.class);
		HomePage homepage= PageFactory.initElements(driver, HomePage.class);
		
		loginPage.clickLogin();
		loginPage.setUserName(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		
		homepage.waitForStore();
		
	}

}
