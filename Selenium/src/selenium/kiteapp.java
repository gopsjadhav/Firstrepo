package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteapp {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (1)/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		kiteapp obj = new kiteapp();
		obj.openwebpage(driver);
////button[contains(text(),'Login')]
	}
	void openwebpage(WebDriver driver) throws Exception{
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		WebElement userid = driver.findElement(By.id("userid"));
		userid.sendKeys("TM3398");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("899972");
		Thread.sleep(3000);
		WebElement lgn = driver.findElement(By.id("//*[contains(text(),'Login')]"));
		Thread.sleep(3000);
		lgn.click();
		
		
	}

}
