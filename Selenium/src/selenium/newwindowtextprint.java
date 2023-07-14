package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newwindowtextprint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (1)/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		newwindowtextprint obj = new newwindowtextprint();
		obj.openwebpage(driver);
	}void openwebpage (WebDriver driver){
		
	driver.get("https://demoqa.com/frames");
	driver.manage().window().maximize();
	//find out the frame from domcode and switch control on that point 
	WebElement frame = driver.findElement(By.xpath("//*[@id='frame1']"));
	driver.switchTo().frame(frame);
	
	
	WebElement ele = driver.findElement(By.xpath("//*[@id='sampleHeading']"));
	System.out.println(ele.getText());
	//we use below method to shift control back from iframe
	driver.switchTo().defaultContent();
	//for printing text above the frame we have to use text method 
	//for sample text value we have use contains text 
	WebElement text = driver.findElement(By.xpath("//*[contains(text(),'Sample Iframe')]"));
	System.out.println(text.getText());
	
	}

}
