package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		WebElement msg = driver.findElement(By.tagName("p"));
		System.out.println(msg.getText());

	}
}
