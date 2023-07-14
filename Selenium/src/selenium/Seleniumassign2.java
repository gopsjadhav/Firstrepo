package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumassign2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/91899/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		
        username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		
		password.sendKeys("secret_sauce");
		
		WebElement txtbox2 = driver.findElement(By.xpath("//input[@id='login-button']"));
		
		txtbox2.click();
		
		
				
		
	}
}


