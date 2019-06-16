package driversSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class FacebookRegistration {
	public static void main(String[]args) throws InterruptedException{


	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chrome74/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebElement firstname= driver.findElement(By.id("u_0_c"));
		firstname.sendKeys("Tari");
		WebElement lastname= driver.findElement(By.id("u_0_e"));
		lastname.sendKeys("Shah");
		WebElement emailAddress = driver.findElement(By.id("u_0_o"));
		emailAddress.sendKeys("humtum10148@yahoo.com");
		WebElement confirmEmailAddress =driver.findElement(By.id("u_0_v"));
		confirmEmailAddress.sendKeys("humtum10148@yahoo.com");
		
		}
	
	public static void gitHub(){
		
	}

}
