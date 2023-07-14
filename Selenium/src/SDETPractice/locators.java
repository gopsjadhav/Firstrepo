package SDETPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		/*
		 * WebElement link = driver.findElement(By.linkText("Software")); link.click();
		 */
		
		//how many links present on webpage
		int alllink = driver.findElements(By.tagName("img")).size();
		System.out.println(alllink);
		driver.quit();
		
		
		
		
		
	}

}
