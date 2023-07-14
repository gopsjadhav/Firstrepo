package selenium;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.Strings;

public class Windowhandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Windowhandle obj = new Windowhandle();
		obj.openwebpage(driver);
		obj.opennewwindow(driver);

	}
	void openwebpage(WebDriver driver) {
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
	}
	void opennewwindow(WebDriver driver) {
		//it provide main window handle 		
		String mainwindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		//then open window by click
		WebElement opennewwindow = driver.findElement(By.xpath("//*[@id='tabButton']"));
		opennewwindow.click();
		//multiple open window stored into set 
		Set<String> windowhandles = driver.getWindowHandles();
		//by using iterator ,iterate 1 by 1 window
		java.util.Iterator<String> itr = windowhandles.iterator();
		
		while(itr.hasNext()) {
			
		 String childwindow = itr.next();
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
			
		

			
		}
		
		
	  
			
		}
		
		
		
	}


