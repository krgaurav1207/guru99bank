package com.learnCucumber;

import org.openqa.selenium.WebDriver;

public class NewCustomerPage {
	static String userID ;
    public static void AddNewCustomerDetails(WebDriver driver) {
    	
    	NewCustomerPageObjects NewCustomerPageObjects = new NewCustomerPageObjects(driver);
    	
		NewCustomerPageObjects.AddNewCustomer();
		NewCustomerPageObjects.EnterCustomerName();
		NewCustomerPageObjects.SelectCustomerGender();
		NewCustomerPageObjects.SelectCustomerDateOfBirth();
		NewCustomerPageObjects.EnterCustomerAddress();
		NewCustomerPageObjects.EnterCustomerCity();
		NewCustomerPageObjects.EnterCustomerState();
		NewCustomerPageObjects.EnterCustomerPinCode();
		NewCustomerPageObjects.EnterCustomerMobileNumber();
		NewCustomerPageObjects.EnterCustomerEmailId();
		NewCustomerPageObjects.EnterCustomerPassword();
		NewCustomerPageObjects.ClickSubmitButton();
		// NewCustomerPageObjects.ClickResetButton();
		NewCustomerPageObjects.VerifyUserCreation();
		NewCustomerPageObjects.getCustomerID();

	}

	

}
