package mousehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (1)/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		draganddrop obj = new draganddrop();
		obj.openwebpage(driver);
		obj.draganddrop(driver);
		
		

	}
	void openwebpage(WebDriver driver) {
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
	}
	void draganddrop(WebDriver driver) {
		//switch the control from frame
		WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		//make action class to perform action
		Actions actnobj = new Actions(driver);
		//inspect both drag and drop box element
		WebElement smallbox = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement bigbox = driver.findElement(By.xpath("//*[@id='droppable']"));
		//then perform action by using below method 
		actnobj.dragAndDrop(smallbox, bigbox).build().perform();
		
		
		
		
	}

}
