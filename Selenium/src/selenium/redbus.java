package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		redbus obj = new redbus();
		obj.openwebpage(driver);
		obj.search(driver);
		obj.listofcity(driver);

	}

	void openwebpage(WebDriver driver) {

		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();

	}

	void search(WebDriver driver) {
		WebElement city = driver.findElement(By.xpath("//*[contains(@data-message,'Please enter a source city')]"));
		city.sendKeys("pune");
		city.click();
	}

	void listofcity(WebDriver driver) {
		List<WebElement> citylist = driver.findElements(By.xpath("//*[contains(@class,'sub-city')]"));

		for (WebElement city1 : citylist) {

			System.out.println(city1.getText());
			if (city1.getText().equalsIgnoreCase("Kharadi, Pune")){
				//driver.navigate().refresh();
			city1.click();
			
			
		}

	}}

	}
