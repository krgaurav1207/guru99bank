package stepDefination;

import org.openqa.selenium.WebDriver;
import com.learnCucumber.CoreMethod;

import com.learnCucumber.LoginPageObjects;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BDDLoginTest {
	WebDriver driver = utilities.DriverFactory.launchDriver("chrome");
	
	LoginPageObjects LoginPageObj;
	
	@Given("^user is on Login Page$")
	public void user_is_on_Login_Page() {
		
		CoreMethod.launchURL(driver);
		LoginPageObj = new LoginPageObjects(driver);
		LoginPageObj.getLoginPageTitle();
	}

	@When("^user enters correct userid and password$")
	public void user_enters_correct_username_and_password() {
		LoginPageObj.enterUserName();
		LoginPageObj.enterPassword();
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() {
		LoginPageObj.Login();
		LoginPageObj.getHomePageTitle();
		driver.close();
	}
	
	@When("^user enters invalid userid and password$")
	public void user_enters_invalid_username_and_password() {
		LoginPageObj.invalidUserName();
		LoginPageObj.enterPassword();
	}
	
	@When("^user enters userid and invalid password$")
	public void user_enters_username_and_invalid_password() {
		LoginPageObj.enterUserName();
		LoginPageObj.invalidPassword();
	}
	
	@When("^user enters invalid userid and invalid password$")
	public void user_enters_invalid_username_and_invalid_password() {
		LoginPageObj.invalidUserName();
		LoginPageObj.invalidPassword();
	}
	
	@Then("^Error alert should be given$")
	public void Error_alert_should_be_given() {
		LoginPageObj.Login();
		LoginPageObj.ErrorWindow();
		driver.close();
	}
}
