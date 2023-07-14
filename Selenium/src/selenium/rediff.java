package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (1)/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		rediff obj = new rediff();
		obj.openwebpage(driver);
		obj.bdate(driver);
		obj.month(driver);
		obj.year(driver);
		
		

	}

	void openwebpage(WebDriver driver) {

		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}

	void bdate(WebDriver driver) {
		//List<WebElement> date =driver.findElements(By.xpath("//*[@name='DOB_Day0f881582']"));
        WebElement dropdown = driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
       // dropdown.click();
        
		Select selobj = new Select(dropdown);
	
		//Select selobj = new Select(dropdown);
		
		selobj.selectByValue("05");
	}
	void month(WebDriver driver) {
    WebElement dropdown1 = driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
   // dropdown1.click();
		
    Select selobj = new Select(dropdown1);
    selobj.selectByVisibleText("MAR");
	}
	void year(WebDriver driver) {
		
	WebElement dropdown2 =driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
	//dropdown2.click();
	
	Select selobj = new Select(dropdown2);
	 selobj.selectByValue("1995");
	
		
		
		
	



}}
