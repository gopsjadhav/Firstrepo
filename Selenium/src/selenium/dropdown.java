package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/91899/Downloads/chromedriver_win32/chromedriver.exe");
	
		WebDriver driver =  new ChromeDriver();
		dropdown obj = new dropdown();
		obj.openwebpage(driver);
		obj.dropdownmethod(driver);
		
		
}
	void openwebpage (WebDriver driver) {
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		//maximaize webpage
		driver.manage().window().maximize();
	}
	void dropdownmethod (WebDriver driver) throws Exception {
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select selobj = new Select(dropdown);
		// by using name
		//selobj.selectByVisibleText("Option1");
		
		//by using index
		//selobj.selectByIndex(2);
		
		//by using value
		selobj.selectByValue("option3");
		
		Thread.sleep(5000);
		
		driver.close();
		
	}
	

}
