package Seleniumpractice;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capturescreenshot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File fl =ts.getScreenshotAs(OutputType.FILE);
		File trgt = new File(".//Screenshot//homepage.png");
		FileHandler.copy(fl, trgt);
		
		Thread.sleep(5000);
		
		driver.close();
	
		
	

		

	}

}
