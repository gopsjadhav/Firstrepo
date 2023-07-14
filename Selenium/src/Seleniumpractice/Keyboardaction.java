package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Keyboardaction {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
	    driver.findElement(By.id("inputText1")).sendKeys("Gopal Sunil Jadhav");
	    
	    Actions act = new Actions(driver);
	    //control+a
	    act.keyDown(Keys.CONTROL);
	    act.sendKeys("a");
	    act.keyUp(Keys.CONTROL);
	    act.perform();
	    
	    Thread.sleep(3000);
	    //control+c
	    act.keyDown(Keys.CONTROL);
	    act.sendKeys("c");
	    act.keyUp(Keys.CONTROL);
	    act.perform();
	    Thread.sleep(3000);
	    //press tab
	    act.sendKeys(Keys.TAB);
	    act.perform();
	    Thread.sleep(3000);
	    //control+v
	    act.keyDown(Keys.CONTROL);
	    act.sendKeys("v");
	    act.keyUp(Keys.CONTROL);
	    act.perform();
	    
	    
		
		
		
	}
	

}
