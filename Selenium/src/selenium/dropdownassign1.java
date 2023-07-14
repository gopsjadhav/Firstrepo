package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownassign1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:/Users/91899/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		dropdownassign1 obj = new dropdownassign1();
		obj.openwebpage(driver);
		obj.dropdown(driver);
		//obj.dropdown2(driver);
		

	}

	void openwebpage(WebDriver driver) {

		driver.navigate().to("https://demoqa.com/select-menu");
		// maximise the window
		driver.manage().window().maximize();

	}

	void dropdown(WebDriver driver) {

		String optiontoselect = "ms.";
		
		driver.findElement(By.id("selectOne")).sendKeys("ms");
		
		List<WebElement> optionlist = driver.findElements(By.xpath("//*[@class='col-12 mt-4 col-md-3']"));
		
		for(WebElement ele : optionlist) {
			String currentoption = ele.getText();
			if (currentoption.contains(optiontoselect)) {
				ele.click();
				break;
				
			}
		}

	}
	void dropdown2(WebDriver driver) {

		WebElement drodwn = driver.findElement(By.xpath("//*[@id='oldSelectMenu']"));

		Select selobj = new Select(drodwn);

		selobj.selectByVisibleText("Green");
	
		
	
}}
