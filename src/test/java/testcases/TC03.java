package testcases;

import java.util.concurrent.TimeUnit;

import javax.security.auth.login.Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TC03 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", Configuration.Chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
	}

}
