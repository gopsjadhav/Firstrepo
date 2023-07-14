package Calendarhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oyohotel {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (1)/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Oyohotel obj = new Oyohotel();
		obj.Selectdate(driver);
	}
	void Selectdate(WebDriver driver) {
		
		driver.get("https://www.oyorooms.com/");
		driver.manage().window().maximize();
		
		WebElement date =driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));
		date.click();
		
		List<WebElement> number = driver.findElements(By.xpath("//*[contains(text(),'25')]"));
	    for( WebElement i : number) {
	    	if(i.getText().equalsIgnoreCase("25"));
	    	i.click();
	    	
	    	
	    }
		
	}

}
