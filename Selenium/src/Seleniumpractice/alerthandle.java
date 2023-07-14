package Seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandle {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//WebElement popbtn =driver.findElement(By.xpath("//*[@id=\"alertButton\"]"));
	//	popbtn.click();
		
	//	driver.switchTo().alert().accept();
		
		WebElement popbtn2 =driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]"));
		popbtn2.click();
		
		Thread.sleep(6000);
		
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		

	}
}
