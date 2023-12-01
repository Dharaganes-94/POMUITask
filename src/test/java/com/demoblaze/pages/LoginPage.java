package com.demoblaze.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demoblaze.utils.Sewrappers;

public class LoginPage extends Sewrappers {
	
	@FindBy(xpath="//a[text()='Log in']")
	public WebElement login;
	
	@FindBy(id="loginusername")
	public WebElement username;
	
	@FindBy(id="loginpassword")
	public WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	public WebElement loginButton;
	
	public void clickLogin()
	{
		WaitForElement(login,20);
		clickElement(login);
	}
	
	public void setUserName(String user)
	{
		WaitForElement(username,20);
		typeText(username,user);
		
	}
	
	public void setPassword(String pwd)
	{
		WaitForElement(password,20);
		typeText(password,pwd);
		
	}
	
	public void clickLoginButton()
	{
		WaitForElement(loginButton,20);
		clickElement(loginButton);
	}
	
	

}
