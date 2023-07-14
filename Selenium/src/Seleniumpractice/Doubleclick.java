package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement link =driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		
		act.doubleClick(link).perform();
		
		Thread.sleep(4000);
		WebElement rightbtn =driver.findElement(By.xpath("//*[@id='rightClickBtn']"));
		act.contextClick(rightbtn).perform();
		
		
		
		
		
	}
}
