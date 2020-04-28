package com.learnCucumber;

import org.openqa.selenium.WebDriver;

public class CoreMethod {
public static void launchURL(WebDriver driver)
{
	driver.manage().window().maximize();
	driver.get("http://www.demo.guru99.com/V4/");
	}
}
