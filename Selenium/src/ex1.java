import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	WebElement search =driver.findElement(By.xpath("//*[@class='gLFyf'][@type='text']"));
	search.sendKeys("stack overflow");
	search.click();

	}

}
