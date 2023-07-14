package SDETPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboard_mouse_op {

	public static void main(String[] args) throws AWTException, Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//create object of robot class
		
		Robot r = new Robot();
		//move mouse x y direction
		//r.mouseMove(20, 100);
		//press ALT Key 
		//r.keyPress(KeyEvent.VK_ALT);
		
		//Press key F
		r.keyPress(KeyEvent.VK_F);
		//release f key
		r.keyRelease(KeyEvent.VK_F);
		Thread.sleep(2000);
		
		//driver.close();
		
		
		

	}

}
