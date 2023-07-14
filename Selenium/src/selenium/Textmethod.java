package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textmethod {
	
	void openwebpage(WebDriver driver) {
		
		driver.get("https://demoqa.com/text-box");
		
	}
	void textmethod(WebDriver driver) {
		
		WebElement fullname = driver.findElement(By.id("userName"));
		fullname.sendKeys("Gopal Sunil Jadhav");
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("gopsdj95@gmail.com");
		WebElement add = driver.findElement(By.id("currentAddress"));
		add.sendKeys("jalgaon");
		
	} 
	
	
	
	
	
	public static void main(String[] args) {
		// we will connect java selenium and remote driver
		System.setProperty("webdriver.chrome.driver", "C:/Users/91899/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		Textmethod obj = new Textmethod();
		
		obj.openwebpage(driver);
		obj.textmethod(driver);
		
		
		

		

	}

}
