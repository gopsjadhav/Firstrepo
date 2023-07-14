package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pagedownassign {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (1)/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		pagedownassign obj = new pagedownassign();
		obj.pagedownbykeyboard(driver);
	}
	void pagedownbykeyboard(WebDriver driver) throws Exception {
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		Actions actobj = new Actions(driver);
		actobj.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread .sleep(3000);
		actobj.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread .sleep(3000);
		WebElement text = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/ul[1]/li[2]/a[1]"));
		text.click();
		
		
		
	}

}
