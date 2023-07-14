package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomatoxpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/91899/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		zomatoxpath obj = new zomatoxpath();
		obj.openwebpage(driver);
		//obj.basicxpath(driver);
		//obj.containsxpath(driver);
		obj.startswith(driver);
		//obj.andorxpath(driver);

	}

	void openwebpage(WebDriver driver) {
		driver.get("https://www.zomato.com/");
	}

	void basicxpath(WebDriver driver) {
		// using simple x path //tagname[@attribute='value'];
		WebElement textbox = driver
				.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
		textbox.sendKeys("biryani");
	}

	void containsxpath(WebDriver driver) {
		// using contains path //tagname[contains(@attribute,'value')]
		WebElement textbox1 = driver
				.findElement(By.xpath("//input[contains(@placeholder,'Search for restaurant, cuisine or a dish']"));
		textbox1.sendKeys("biryani");

	}

	void startswith(WebDriver driver) {
		// tagname[starts-with(@attribute,'value')]
		WebElement textbox1 = driver
				.findElement(By.xpath("//input[Starts-with(@placeholder,'Search for restaurant, cuisine or a dish']"));
		textbox1.sendKeys("biryani");
	}
	void andorxpath(WebDriver driver) {
		// tagname[@attribute,'value' and @attribute,'value')]
		// tagname[@attribute,'value' or @attribute,'value')]
		WebElement textbox4 = driver
				.findElement(By.xpath("//*[@placeholder='sc-keVrkP cDYFJl' and @class='sc-keVrkP cDYFJl']"));
		textbox4.sendKeys("chicken");

}}
