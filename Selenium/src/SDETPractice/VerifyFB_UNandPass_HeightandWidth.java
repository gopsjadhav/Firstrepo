package SDETPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFB_UNandPass_HeightandWidth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");

		WebElement Uname = driver.findElement(By.id("email"));
		int UnameX = Uname.getLocation().getX();
		int UnameY = Uname.getLocation().getY();
		int UnameHeight = Uname.getSize().getHeight();
		int UnameWidth = Uname.getSize().getWidth();
		System.out.println(UnameX);
		System.out.println(UnameY);
		System.out.println(UnameHeight);
		System.out.println(UnameWidth);

		WebElement Pass =driver.findElement(By.id("pass"));
		int PassX = Pass.getLocation().getX();
		int PassY = Pass.getLocation().getY();
		int PassHeight = Pass.getSize().getHeight();
		int PassWidth = Pass.getSize().getWidth();
		
		System.out.println(PassX);
		System.out.println(PassY);
		System.out.println(PassHeight);
		System.out.println(PassWidth);
		
		if(UnameX ==PassX && UnameY==PassY && UnameHeight== PassHeight && UnameWidth==PassWidth ) {
			System.out.println("Uname and Pass Field are alligned");
			
		}else {
			System.out.println("Uname and Pass Field are not alligned");
			
		}
		
		
	}

}
