package SDETPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyhomepageisdisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		String ActURL = "https://www.saucedemo.com/inventory.html";
		String ExpUrl = driver.getCurrentUrl();
		if ( ExpUrl.equals(ActURL)) {
			System.out.println("Home Page is Dispalayed");
		}else {
			System.out.println("Home Page is not Displayed");
		}
		

	}

}
