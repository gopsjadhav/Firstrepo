package SDETPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltiptext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		
		WebElement radiobtn =driver.findElement(By.xpath("//[@for='yesRadio']"));
		radiobtn.click();
		
		
		String tooltiptext =radiobtn.getAttribute("name");
		
		System.out.println(tooltiptext);
		

	}

}
