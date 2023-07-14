package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class windowhandleclasstopic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (1)/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		windowhandleclasstopic obj = new windowhandleclasstopic();
		obj.openwebpage(driver);
		obj.opennewwindow(driver);
		
		
	} void openwebpage(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
	}
	void opennewwindow(WebDriver driver) {
		String mainwindow = driver.getWindowHandle();
		//System.out.println(driver.getTitle());
		
		WebElement newwindow = driver.findElement(By.xpath("//*[@id='openwindow']"));
		newwindow.click();
		
        // Set<String> windowhandles	=	driver.getWindowHandles();
		java.util.Set<String> windowhandles = driver.getWindowHandles();
		//by using iterator ,iterate 1 by 1 window
		java.util.Iterator<String> itr = windowhandles.iterator();
		
		while(itr.hasNext()) {
			String childwindow = itr.next();
			driver.switchTo().window(childwindow);
			System.out.println(driver.getTitle());
			
			
		}
		
	
	 
	 
	 
		
		
	}

}
