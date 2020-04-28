package com.learnCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPageObjects {

	public static String userID ;
	
	 static WebDriver driver;
	public NewCustomerPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}

	public  void VerifyUserCreation() {
		String ExpectedText = driver.findElement(By.xpath("//p[@class='heading3']")).getText();
		System.out.println("actual Text" + ExpectedText);
		if (ExpectedText.equalsIgnoreCase("Customer Registered Successfully!!!")) {
						
		} else {
			System.out.println("User Not Regitered");
		}

	}
	public static String getCustomerID() {
		 userID = driver.findElement(By.xpath("//td[contains(text(),'Customer ID')]/following-sibling::td[1]")).getText();
		System.out.println("User id "+userID);
		return userID;
	}

	public  void ClickResetButton() {
		driver.findElement(By.xpath("//input[@value='Reset']"));

	}

	public void ClickSubmitButton() {
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

	}

	public void EnterCustomerPassword() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qwerty123");

	}

	public  void EnterCustomerEmailId() {
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("y@ydddfbc.com");

	}

	public  void EnterCustomerMobileNumber() {
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("9584249412");

	}

	public  void EnterCustomerPinCode() {
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("452016");

	}

	public  void EnterCustomerState() {
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Madhya Pradesh");

	}

	public  void EnterCustomerCity() {
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Indore");

	}

	public  void EnterCustomerAddress() {
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Shehnai Residency 2");

	}

	public void SelectCustomerDateOfBirth() {
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("2020-04-23");

	}

	public void SelectCustomerGender() {
		driver.findElement(By.xpath("//input[@name='rad1']")).sendKeys("m");

	}

	public void EnterCustomerName() {
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("dgfgfgdy kain");

	}

	public void AddNewCustomer() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("New Customer")).click();

	}

}
