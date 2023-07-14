package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (1)/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		popup obj = new popup();
		obj.openwebpage(driver);
		//obj.alert(driver);
		//obj.alert2(driver);
		//obj.alert3(driver);
		//obj.alert31(driver);
		obj.alert4(driver);

	}
	void openwebpage(WebDriver driver) {
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
	}
	void alert(WebDriver driver) throws Exception {
		WebElement popupbtn =driver.findElement(By.xpath("//*[@id='alertButton']"));
		
		popupbtn.click();
		//wait for 3 sec
		Thread.sleep(3000);
		// swict control to alert window and use accept for click okay
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
		
		
	}
	void alert2(WebDriver driver) throws Exception {
		
		WebElement popupbtn2 =driver.findElement(By.xpath("//*[@id='timerAlertButton']"));
		popupbtn2.click();
		Thread.sleep(7000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.close();
	}
	void alert3(WebDriver driver) throws Exception {
		WebElement popupbtn3 =driver.findElement(By.xpath("//*[@id='confirmButton']"));
		popupbtn3.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}
	void alert31(WebDriver driver) throws Exception {
		WebElement popupbtn3 =driver.findElement(By.xpath("//*[@id='confirmButton']"));
		popupbtn3.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
	}
	 
	void alert4(WebDriver driver) throws Exception {
		
		WebElement popupbtn4 =driver.findElement(By.xpath("//*[@id='promtButton']"));
		// scroll bar 
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", popupbtn4);
		
		Thread.sleep(2000);
		popupbtn4.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
	
	
		
		
		
		
		
	}

}
