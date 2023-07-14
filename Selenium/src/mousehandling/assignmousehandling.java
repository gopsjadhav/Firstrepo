

package mousehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignmousehandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		assignmousehandling obj = new assignmousehandling();
		obj.openwebpage(driver);
		obj.Dragbox(driver);
		
		
	}

	void openwebpage(WebDriver driver) {
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();

	}

	void Dragbox(WebDriver driver) throws Exception {
		
		WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(frame);

		Actions actnobj = new Actions(driver);
		
		WebElement firstbox = driver.findElement(By.xpath("//*[contains(text(),'Item 1')]"));
		//does not select last item so use scoll bcs it is out of webpage
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", firstbox);
		
		WebElement lastbox = driver.findElement(By.xpath("//*[contains(text(),'Item 7')]"));
		
		
		
		
		
		actnobj.dragAndDrop(firstbox, lastbox).build().perform();
		Thread.sleep(5000);
		driver.close();

	}
}
