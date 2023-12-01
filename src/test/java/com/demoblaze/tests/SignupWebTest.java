package com.demoblaze.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.demoblaze.utils.Demoblazewrappers;
import com.demoblaze.utils.Reports;
import com.demoblaze.utils.Sewrappers;

public class SignupWebTest extends Sewrappers {
	
     Demoblazewrappers demoblaze= new Demoblazewrappers();
     Reports report = new Reports();
     
     @Test
     public void SignupWithValidCredentials()
     {
    	 try
    	 {
    		report.setTCDesc("validating the sign up demoblaze with valid credentials");
    		launchBrowser("https://www.demoblaze.com/");
    		demoblaze.signupDemoblaze("Guviassessment94@gmail.com","Vethanyathiru@1");
    		System.out.println("The webpage was successfully signned in");
    	 }
    	 catch(Exception ex)
    	 {
    		 System.out.println("Problem while Signingup with valid credentials");
    		 ex.printStackTrace();
    	 }
     }
}
