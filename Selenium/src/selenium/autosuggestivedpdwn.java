package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestivedpdwn {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		autosuggestivedpdwn obj = new autosuggestivedpdwn();
		obj.openwebpage(driver);
		obj.search(driver);
		obj.listofmenu(driver);
		
		
		
	// connection reset exception occured when window close before element fetching

	}

	void openwebpage(WebDriver driver) {
		driver.navigate().to("https://www.zomato.com/");
		// maximaize webpage
		driver.manage().window().maximize();
		//use refresh method for stale element exception
		//driver.navigate().refresh();
		
	}

	void search(WebDriver driver) {
		WebElement text1 = driver.findElement(By.xpath("//*[@placeholder='Search for restaurant, cuisine or a dish']"));
		text1.sendKeys("bi");
		text1.click();
	}

	void listofmenu(WebDriver driver) throws Exception {
			
			List<WebElement> menulist =driver.findElements(By.xpath("//*[@class='sc-1hez2tp-0 sc-lcpuFF hscTuO']"));
			
			for (WebElement menu : menulist) {
				
				System.out.println(menu.getText());
				
				if (menu.getText().equalsIgnoreCase("Dum Biryani - Delivery")){
					menu.click();
					
				}
				
				
			
			}
		}
}
