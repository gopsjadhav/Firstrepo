package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathassignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/91899/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
		
		Username.sendKeys("tomsmith");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		
		Password.sendKeys("SuperSecretPassword!");
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		loginbtn.click();
		
		
		//a[@class='button secondary radius']
		
        WebElement logout = driver.findElement(By.xpath("//a[@class='button secondary radius']"));
		
		logout.click();
		
		
		
		

	}

}
