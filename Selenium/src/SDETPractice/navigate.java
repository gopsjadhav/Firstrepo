package SDETPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(3000);
		//it will navigate on previous page
		driver.navigate().back();
		
		Thread.sleep(2000);
		//it will navigate on next page 
		driver.navigate().forward();
		
		Thread.sleep(2000);
		//it will refresh webpage
		driver.navigate().refresh();
		
		
		driver.close();
		
		
		
		

	}

}
