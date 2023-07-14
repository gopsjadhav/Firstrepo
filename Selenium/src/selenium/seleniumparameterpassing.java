package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumparameterpassing {
	
	void openwebpage (WebDriver driver) {
		
		driver.get("https://demoqa.com/automation-practice-form");
	}
	void gopal(WebDriver driver) {
		
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("GOPAL");
		
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("JADHAV");
		
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("gopsdj95@gmail.com");
		
		WebElement click= driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
		click.click();
		
		
		
	
		
	}

	public static void main(String[] args) {
		
		//we will connect selenium and remote driver
		System.setProperty("webdriver.chrome.driver","C:/Users/91899/Downloads/chromedriver_win32/chromedriver.exe");
		//connect with chromedriver 
		WebDriver driver = new ChromeDriver();
		
		seleniumparameterpassing obj = new seleniumparameterpassing();
		
		obj.openwebpage(driver);
		obj.gopal(driver);
		
		
		
		
		
	
	}

}
