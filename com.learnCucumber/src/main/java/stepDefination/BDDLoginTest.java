package stepDefination;

import org.openqa.selenium.WebDriver;
import com.learnCucumber.CoreMethod;

import com.learnCucumber.LoginPageObjects;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BDDLoginTest {
	WebDriver driver;
	LoginPageObjects LoginPageObj = new LoginPageObjects(driver);
	
	@Given("^user is on Login Page$")
	public void user_is_on_Login_Page() {
		driver = utilities.DriverFactory.launchDriver("chrome");
		CoreMethod.launchURL(driver);
		LoginPageObj.getLoginPageTitle();
	}

	@When("^user enters correct username and password$")
	public void user_enters_correct_username_and_password() {
		LoginPageObj.enterUserName();
		LoginPageObj.enterPassword();
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() {
		LoginPageObj.Login();
		LoginPageObj.getHomePageTitle();
	}
	
}
