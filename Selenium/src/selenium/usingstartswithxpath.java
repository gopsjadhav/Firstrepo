package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingstartswithxpath {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Users/91899/Downloads/chromedriver_win32/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 usingstartswithxpath obj = new usingstartswithxpath();
		  
		 obj.openwebpage(driver);
		 obj.radiomethod(driver);
		
	}
	
	void openwebpage(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();		
	}
	 void radiomethod (WebDriver driver) throws Exception {
		 WebElement radiobtntwo = driver.findElement(By.xpath("//input [starts-with(@value,'radio2')]"));
		 
		 radiobtntwo.click();
		 Thread.sleep(5000);
		 driver.close();
		 
		 
		 
		 
	 }


}
