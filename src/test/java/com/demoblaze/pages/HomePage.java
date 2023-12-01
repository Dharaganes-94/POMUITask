package com.demoblaze.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demoblaze.utils.Sewrappers;

public class HomePage extends Sewrappers {
	
	@FindBy(id="nameofuser")
	public WebElement Store;
	
	public void waitForStore()
	{
		WaitForElement(Store,20);
	}

}
