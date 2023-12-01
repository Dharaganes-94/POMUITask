package com.demoblaze.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demoblaze.utils.Sewrappers;

public class SignupPage extends Sewrappers{
	
	@FindBy(xpath="//a[text()='Sign up']")
	public WebElement Signup;
	
	@FindBy(xpath="//input[@id='sign-username']")
	public WebElement username;
	
	@FindBy(id="sign-password")
	public WebElement password;
	
	@FindBy(xpath="//button[text()='Sign up']")
	public WebElement SignupButton;
	
	public void clickSignup()
	{
		WaitForElement(Signup,20);
		clickElement(Signup);
	
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
	
	public void clickSignupButton()
	{
		WaitForElement(SignupButton,20);
		clickElement(SignupButton);
	}

}
