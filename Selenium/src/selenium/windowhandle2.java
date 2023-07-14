package selenium;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class windowhandle2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (1)/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		windowhandle2 obj = new windowhandle2();
		obj.openwebpage(driver);
		obj.opennewwindow(driver);
		

	}
	void openwebpage(WebDriver driver){
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
	}
	void opennewwindow(WebDriver driver) {
		String mainwindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		WebElement newwindow = driver.findElement(By.xpath("//*[@id='windowButton']"));
		newwindow.click();
		
		java.util.Set<String> windowhandles = driver.getWindowHandles();
		java.util.Iterator<String> itr = windowhandles.iterator();
		
		while(itr.hasNext()){
			String clildwindow = itr.next();
			driver.switchTo().window(clildwindow);
			System.out.println(driver.getTitle());
			driver.close();
			
		
		
			
			
			
			
		}
		
		
	}
	
		
	

}
