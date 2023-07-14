package SDETPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyunameandpassfield {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		WebElement Uname = driver.findElement(By.id("user-name"));
		Uname.sendKeys("standard_user");
		int UnameLocationX = Uname.getLocation().getX();
		int UnameLocationY = Uname.getLocation().getY();
		int UnameWidth = Uname.getSize().getWidth();
		int Unameheight = Uname.getSize().getHeight();
		System.out.println(UnameLocationX);
		System.out.println(UnameLocationY);
		System.out.println(UnameWidth);
		System.out.println(Unameheight);

		WebElement Pass = driver.findElement(By.id("password"));
		Pass.sendKeys("secret_sauce");
		int PassLocationX = Uname.getLocation().getX();
		int PassLocationY = Uname.getLocation().getY();
		int PassWidth = Uname.getSize().getWidth();
		int Passheight = Uname.getSize().getHeight();

		if (UnameLocationX == PassLocationX && UnameLocationY == PassLocationY && UnameWidth == PassWidth
				&& Unameheight == Passheight) {
			System.out.println("Uname and Pass textbox are aligned");	
		} else {
			System.out.println("Uname and Pass textbox are not aligned");
		}

	}

}
