package selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switchstatement {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		System.out.println("Entered your choice: ");
		int choice = scn.nextInt();
		
		switch(choice) {
		
		case 1:{
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/91899/Downloads/chromedriver_win32 (1)/chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//*[@id='login-button']")).click();
			
			break;
			
		}
		case 2:{
			System.setProperty("webdriver.edge.driver",
					"C:/Users/91899/Downloads/edgedriver_win64 (1)/msedgedriver.exe");

			WebDriver driver = new EdgeDriver ();
			
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//*[@id='login-button']")).click();
			break;
			
		
		}
		case 3:{
			System.setProperty("webdriver.gecko.driver",
					"C:/Users/91899/Downloads/geckodriver-v0.31.0-win64/geckodriver.exe");

			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//*[@id='login-button']")).click();
		}}}}
		
	
	
		

