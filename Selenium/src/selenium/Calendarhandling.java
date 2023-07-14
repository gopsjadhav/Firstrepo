package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendarhandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (1)/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Calendarhandling obj = new Calendarhandling();
		obj.openwebpage(driver);
		obj.selectdate(driver);
	}

	void openwebpage(WebDriver driver) {

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	}

	void selectdate(WebDriver driver) throws Exception {

		// click on date
		WebElement datebox = driver.findElement(By.id("onward_cal"));
		datebox.click();
		while (!driver.findElement(By.xpath("//*[@class='monthTitle']")).getText().equalsIgnoreCase("Mar 2023")) {
			WebElement nextbtn = driver.findElement(By.xpath("//*[@class='next']"));
			nextbtn.click();
			Thread.sleep(5000);
		}
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(@class,'day')]"));
		
		for (WebElement i : list) {
			
			if(i.getText().equalsIgnoreCase("5")){
			
			i.click();
			
		}
		

	}

}}
