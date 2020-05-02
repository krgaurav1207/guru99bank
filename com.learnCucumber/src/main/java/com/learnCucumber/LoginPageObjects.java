package com.learnCucumber;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPageObjects {
	 WebDriver driver;
	 
	 public LoginPageObjects(WebDriver driver) {
		 this.driver =driver;
	 }
	 WebElement userid;
	 WebElement password;
	 WebElement loginButton;
	 public  void getLoginPageTitle() {
			try {
				String ActualLoginPageTitle=driver.getTitle();
				if (ActualLoginPageTitle.equalsIgnoreCase("Guru99 Bank Home Page")) {
					System.out.println("Success : Login Page Title Verified");
					userid=driver.findElement(By.name("uid"));
					password=driver.findElement(By.name("password"));
					loginButton=driver.findElement(By.name("btnLogin"));
					 
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
			userid.sendKeys("mngr256556");
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
	}

	public  void enterPassword() {
		try {
			password.sendKeys("hEzUhYz");
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
	}

	public  void Login() {
		try {
			loginButton.click();
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
	}
	
	public void ErrorWindow() {
		Alert simpleAlert=driver.switchTo().alert();
		simpleAlert.accept();
//		try {
////			String MainWindow=driver.getWindowHandle();
////			// To handle all new opened window.				
////            Set<String> s1=driver.getWindowHandles();		
////            Iterator<String> i1=s1.iterator();		
////        		
////        while(i1.hasNext())			
////        {		
////            String ChildWindow=i1.next();		
////            		
////            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
////            {    		
////                 
////                    // Switching to Child window
////                    driver.switchTo().window(ChildWindow);	                                                                                                           
////                    driver.findElement(By.name("emailid"))
////                    .sendKeys("gaurav.3n@gmail.com	");                			
////                    
////                    driver.findElement(By.name("btnLogin")).click();			
////                                 
////			// Closing the Child Window.
////                        driver.close();		
////            }		
////        }		
////        // Switching to Parent window i.e Main Window.
////            driver.switchTo().window(MainWindow);
//			
//			
////			String originalHandle=driver.getWindowHandle();
////			for(String handle1: driver.getWindowHandles()) {
////				driver.switchTo().window(handle1);
////				Alert simpleAlert=driver.switchTo().alert();
////				simpleAlert.accept();
////			}
//			
//		}
//		catch(Exception e) {
//			e.printStackTrace(System.out);
//		}
	}
	
	public  void invalidUserName() {
		try {
			userid.sendKeys("Invalid");
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
	}

	public  void invalidPassword() {
		try {
			password.sendKeys("Invalid");
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
		}
		
	}

}
