package xpathpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class xoathdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		Actions act = new Actions(driver);
		
		WebElement fashion = driver.findElement(By.xpath("//*[@class='xtXmba'][text()='Electronics']"));
		
		act.moveToElement(fashion).build().perform();
		
		List<WebElement> text = driver.findElements(By.className("ZEl_b_ _3joddx _2ogGYG _23xUYh _3pAV4E"));
		for(WebElement e : text) {
			System.out.println(e.getText());
			
		}
		
		
	}

}
