package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytripautosuggestive {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (1)/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		makemytripautosuggestive obj = new makemytripautosuggestive();
		obj.openwebpage(driver);
		obj.selectfrom(driver);
		obj.selectcity(driver);
		
		
		

	}
	void openwebpage(WebDriver driver) {
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
       
	}
	void selectfrom(WebDriver driver) throws Exception {
		
		WebElement search =driver.findElement(By.xpath("//*[@id='fromCity']"));
        search.sendKeys("pu");
        Thread.sleep(5000);
        search.click();
        
        
        
	}
	void selectcity(WebDriver driver) {
		List<WebElement> city =driver.findElements(By.xpath("//*[contains(@class,'combobox')]"));
		
		for (WebElement city1 : city) {

			System.out.println(city1.getText());
			if (city1.getText().equalsIgnoreCase("Swargate, Pune")){
				driver.navigate().refresh();
			city1.click();
		
	}
	

}
}}