package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/91899/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		implicit obj = new implicit();
		obj.openwebpage(driver);
		obj.searchbox(driver);
		obj.selectfromautosuggestivedropdown(driver);
		
		
		
	}
	void openwebpage(WebDriver driver) {
		
		driver.navigate().to("https://www.zomato.com/");
	
		driver.manage().window().maximize();
	}
	void searchbox(WebDriver driver) {
		
		WebElement searchbox = driver.findElement(By.xpath("//*[contains(@placeholder,'Search for restaurant')]"));
		searchbox.sendKeys("bi");
		searchbox.click();
	}
	void selectfromautosuggestivedropdown(WebDriver driver) {
		
		List<WebElement> listofmenu = (List<WebElement>) driver.findElement(By.xpath("//*[contains(@class,'sc-1hez2tp-0 sc-lcpuFF hscTuO')]"));
		
		for (WebElement menu : listofmenu) {
			
			System.out.println(menu.getText());
			
		} 
	}
	

}
