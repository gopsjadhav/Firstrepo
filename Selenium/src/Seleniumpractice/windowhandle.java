package Seleniumpractice;

import java.util.Iterator;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// it will give the main window handle
		String mainwindow = driver.getWindowHandle();
		// print the main window page title
		System.out.println(driver.getTitle());
		// open window by click
		WebElement newwindow = driver.findElement(By.xpath("//*[@id=\"openwindow\"]"));
		newwindow.click();

		// all open window stored into string
		Set<String> windohandles = driver.getWindowHandles();
		//iterate all 1 by 1
		Iterator<String> itr =windohandles.iterator();
		
		while(itr.hasNext()) {
			String childwindow = itr.next();
			driver.switchTo().window(childwindow);
			System.out.println(driver.getTitle());
			
		}
		

	}

}
