package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		
		Actions act = new Actions(driver);	
		
		
		WebElement from = driver.findElement(By.xpath("//*[text()='Drag me to my target']"));
		from.click();
		
		WebElement to = driver.findElement(By.xpath("//*[@id='droppable']"));
		to.click();
		act.dragAndDrop(from, to).build().perform();
		Thread.sleep(5000);
	
		
		
		
		
		
		
		

	}
}