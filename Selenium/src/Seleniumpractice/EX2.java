package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
//C:\Users\91899\Downloads\chromedriver_win32 (2)
		WebDriver driver = new ChromeDriver();
		EX2 ob = new EX2();
		ob.openwebpage(driver);
		ob.writedata(driver);
		

}void openwebpage(WebDriver driver){
	driver.get("https://demoqa.com/text-box");
	
	
}
void writedata(WebDriver driver) {
	driver.findElement(By.id("userName")).sendKeys("Gopal Sunil Jadhav");
	driver.findElement(By.id("userEmail")).sendKeys("gopal@gmail.com");
	
}
	
	}
