package com.learnCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountPage {

	public static void newAccountCreationMethod(WebDriver driver) {

		NewAccountPageObjects NewAccountPageObj = new NewAccountPageObjects(driver);
		NewAccountPageObj.AddNewAccount();
		NewAccountPageObj.enterCustomerID();
		NewAccountPageObj.accountType();
		NewAccountPageObj.enterInitialDeposit();
		NewAccountPageObj.clickSubmit();
		
		

	}
}

	
