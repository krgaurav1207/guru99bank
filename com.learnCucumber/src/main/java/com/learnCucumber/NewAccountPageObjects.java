package com.learnCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPageObjects {


	WebDriver driver;


	public NewAccountPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void AddNewAccount() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("New Account")).click();

	}

	public void enterCustomerID() {
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys();
		
	}

	public void accountType() {
	WebElement accountType = driver.findElement(By.xpath("//select[@name='selaccount']"));
		Select select = new Select(accountType);
				select.selectByValue("Savings");
		
	}

	public void enterInitialDeposit() {
		driver.findElement(By.xpath("//input[@name='inideposit']")).sendKeys("100000");
		
	}

	public void clickSubmit() {
		driver.findElement(By.xpath("//[@name='button2']"));
		
	}

}
