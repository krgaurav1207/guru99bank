package com.learnCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoClass {
static	WebDriver driver;
	public static void main(String[] args) {
		driver = utilities.DriverFactory.launchDriver("chrome");
		CoreMethod.launchURL(driver);
		LoginPage.loginMethod(driver);
//		NewCustomerPage.AddNewCustomerDetails(driver);
//		NewAccountPage.newAccountCreationMethod(driver);
		
	}

}
