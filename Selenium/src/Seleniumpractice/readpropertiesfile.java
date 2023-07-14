package Seleniumpractice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readpropertiesfile {
	public static void main(String[] args) throws IOException {
		

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/91899/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//filerader class n pass file location
		FileReader file = new FileReader("C:\\Users\\91899\\eclipse-workspace\\27 june evn\\Propertiesfiles\\Saucedata.properties");
		//properties class and load file to read 
		Properties prop = new Properties();
		prop.load(file);
		//by using get property method get value from file 
		String url =prop.getProperty("url");
		String Uname =prop.getProperty("Uname");
		String pass =prop.getProperty("pass");
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys(Uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click();
		
		
		
		
		
	}


}
