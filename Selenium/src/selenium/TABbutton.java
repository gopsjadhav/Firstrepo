package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TABbutton {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (1)/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		TABbutton obj = new TABbutton();
		obj.keyboardhandling(driver);
		
		driver.close();
	}
	void keyboardhandling(WebDriver driver) throws Exception {
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		WebElement textbox1 = driver.findElement(By.xpath("//*[@id='userName']"));
		WebElement textbox2 = driver.findElement(By.xpath("//*[@id='userEmail']"));
		
		textbox1.sendKeys("My Name is Gopal");
		
		Actions actnobj = new Actions(driver);
		
		textbox1.sendKeys(Keys.TAB);
		
		actnobj.keyDown(Keys.SHIFT).sendKeys("test").perform();
		
		Thread.sleep(3000);
		
	}
	

}
