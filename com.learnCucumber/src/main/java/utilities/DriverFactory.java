package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	static WebDriver driver;

	public static WebDriver launchDriver(String BrowserType) {
		if (BrowserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
}
