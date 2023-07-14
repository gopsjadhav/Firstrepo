package Seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.LoginPage;

public class Ex1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.xpath("//*[@class='gLFyf'][@type='text']"));
		search.sendKeys("Hello World");

		List<WebElement> thrdtext = driver.findElements(By.xpath("//*[@role='listbox'][@class='G43f7e']/li[3]"));
		

		/*
		 * Ex1 ob = new Ex1(); ob.openwebpage(driver); ob.login(driver);
		 * 
		 * 
		 * 
		 * } void openwebpage(WebDriver driver) {
		 * 
		 * driver.get("https://www.saucedemo.com/");
		 * driver.manage().window().maximize();
		 * 
		 * }void login(WebDriver driver){ LoginPage POM = new LoginPage(driver);
		 * POM.EnterUserName(); POM.EnterPass(); POM.clicklogin();
		 * 
		 * 
		 * 
		 * }
		 */

	}

}
