package SDETPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		//tag & Id 
	//	driver.findElement(By.cssSelector("#userName")).sendKeys("Gopal jadhav");
		// tag & class 
		driver.findElement(By.cssSelector("input.col-md-9 col-sm-12")).sendKeys("Gopal jadhav");
		
		

	}

}
