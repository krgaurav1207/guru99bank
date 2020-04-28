package com.learnCucumber;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPageObjects {
	 WebDriver driver;

	 public LoginPageObjects(WebDriver driver) {
		 this.driver =driver;
	 }
	 
	public  void getLoginPageTitle() {
		try {
			String ActualLoginPageTitle=driver.getTitle();
			if (ActualLoginPageTitle.equalsIgnoreCase("Guru99 Bank Home Page")) {
				System.out.println("Success : Login Page Title Verified");
			} else {
				System.out.println("Failed : Lpgin Page is not verified");
			}
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
	}
	
	public void getHomePageTitle() {
		try {
			String ActualHomePageTitle= driver.getTitle();
			if (ActualHomePageTitle.equalsIgnoreCase("Guru99 Bank Manager HomePage")) {
				System.out.println("Success : Home Page Title Verified");
			} else {
				System.out.println("Failed : Home Page is not verified");
			}
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
		
	}

	public  void enterUserName() {
		try {
			driver.findElement(By.name("uid")).sendKeys("mngr256556");
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
	}

	public  void enterPassword() {
		try {
			driver.findElement(By.name("password")).sendKeys("hEzUhYz");
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
	}

	public  void Login() {
		try {
			driver.findElement(By.name("btnLogin")).click();
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
	}

}
