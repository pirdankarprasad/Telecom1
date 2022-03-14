package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testclass.Configuration;

public class TC02 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", Configuration.Chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement uid = driver.findElement(By.xpath("//input[@name='email']"));
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(uid));
	}
}
