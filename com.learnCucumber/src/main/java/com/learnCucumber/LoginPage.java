package com.learnCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void loginMethod(WebDriver driver) {

		LoginPageObjects LoginPageObj = new LoginPageObjects(driver);
		LoginPageObj.enterUserName();
		LoginPageObj.enterPassword();
		LoginPageObj.Login();
		LoginPageObj.getLoginPageTitle();
		LoginPageObj.getHomePageTitle();
	}

}
