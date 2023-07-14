package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait {

	public static void main(String[] args) {
		//new path chromedriver
		System.setProperty("webdriver.chrome.driver", "C:/Users/91899/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//apply implicit wait 
		//it always wait wait 10 sec before throwing error
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		implicitwait obj = new implicitwait();
		obj.openwebpage(driver);
		obj.search(driver);
		obj.selectautosuggestivedpdwn(driver);
		driver.close();

	}

	void openwebpage(WebDriver driver) {

		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();

	}

	void search(WebDriver driver) {
		WebElement text1 = driver.findElement(By.xpath("//*[@placeholder='Search for restaurant, cuisine or a dish']"));
		text1.sendKeys("bir");

	}

	void selectautosuggestivedpdwn(WebDriver driver) {
		// store the list in list webelement
		List<WebElement> menulist = driver.findElements(By.xpath("//p[@class='sc-1hez2tp-0 sc-lcpuFF hscTuO']"));
		// now print the list
		// for that we have to iterate it one by one
		// so we use for each loop
		for (WebElement menu : menulist) {
			// print the list but result come in the form of x path 
			System.out.println(menu.getText());
			//to get list in the form text we have to use gettext method
			//System.out.println((menu.getText()));
		}

	}

}
