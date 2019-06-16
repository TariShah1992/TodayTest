package driversSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverSetup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chrome74/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		WebElement enterUserName = driver.findElement(By.xpath("//input[@placeholder='E-mail address']"));
		enterUserName.sendKeys("tarishah1992@gmail.com");
		WebElement enterPassword= driver.findElement(By.xpath("//input[@placeholder='Password']"));
		enterPassword.sendKeys("Tarishah1713");
		WebElement clickLogin = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		clickLogin.click();
		

	}

}
