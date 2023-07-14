package Seleniumpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolsqawindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();

		String mainwindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());

		WebElement newwindow = driver.findElement(By.xpath("//*[@id=\"windowButton\"]"));
		newwindow.click();

		Set<String> windowhandle = driver.getWindowHandles();

		Iterator<String> itr = windowhandle.iterator();

		while (itr.hasNext()) {
			String childwindow = itr.next();
			driver.switchTo().window(childwindow);
			System.out.println(driver.getTitle());

		}

	}

}
