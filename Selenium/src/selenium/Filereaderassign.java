package selenium;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filereaderassign {

	public static void main(String[] args) throws Exception {

		FileReader read = new FileReader("C:\\Users\\91899\\eclipse-workspace\\corejava\\src\\Saucedemo.properties");

		Properties prop = new Properties();
		prop.load(read);
		String url1 = prop.getProperty("url");

		String username1 = prop.getProperty("username");
		String password1 = prop.getProperty("password");

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (1)/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url1);
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys(username1);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password1);
		driver.findElement(By.xpath("//*[@id='login-button']")).click();

	}

}
