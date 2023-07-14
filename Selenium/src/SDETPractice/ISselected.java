package SDETPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISselected {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/checkbox");

		WebElement check1 = driver
				.findElement(By.xpath("//*[@type='button' and @class='rct-collapse rct-collapse-btn']"));
		check1.click();

		WebElement check2 = driver.findElement(By.xpath("//*[contains(@id,'tree-node-desktop')]"));
		check2.click();

		Thread.sleep(3000);

		driver.close();

	}

}
