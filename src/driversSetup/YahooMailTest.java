package driversSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooMailTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chrome74/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		WebElement username = driver.findElement(By.id("login-username"));
		username.sendKeys("syed728@yahoo.com");
		WebElement nextButton= driver.findElement(By.id("login-signin"));
		nextButton.click();
		driver.certified only
		
		

	}

}
