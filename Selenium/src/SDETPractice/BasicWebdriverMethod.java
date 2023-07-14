package SDETPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebdriverMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		// it will return the title of webpage
		//System.out.println(driver.getTitle());

		/*
		 * if (driver.getTitle().equals("Google")) { System.out.println("webpage open");
		 * 
		 * } else { System.out.println("Webpage is not open"); }
		 */
		//it will return webpage url
		System.out.println(driver.getCurrentUrl());
		//it will return the page source code of webpage
	    System.out.println(driver.getPageSource());
	    
	    
	    
	    

	}

}
