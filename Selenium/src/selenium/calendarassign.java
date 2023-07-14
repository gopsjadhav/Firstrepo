package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarassign {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (1)/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		
		calendarassign obj = new calendarassign();
		obj.selectbirthdate(driver);

	}void selectbirthdate(WebDriver driver) throws Exception{
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		
	WebElement textbox = driver.findElement(By.xpath("//*[@id='dateOfBirthInput']"));
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView()", textbox);
	textbox.click();
	//WebElement nextbtn = driver.findElement(By.xpath("//button[contains(text(),'Next Month')]"));
	//nextbtn.click();
	//WebElement month = driver.findElement(By.xpath("//div[contains(text(),'December 2022')]"));
	//month.getText();
	//System.out.println(month.getText());
	
	while(!driver.findElement(By.xpath("//div[contains(text(),'November 2022')]")).getText().equalsIgnoreCase("April 2023"))
	{
		WebElement nextbtn = driver.findElement(By.xpath("//button[contains(text(),'Next Month')]"));
		Thread.sleep(3000);
		nextbtn.click();
		Thread.sleep(3000);
	}
	
	
	
		
	}
	

}
