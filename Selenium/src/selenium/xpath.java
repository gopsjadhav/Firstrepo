package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	
	// tagname [@attribute='value' or @attribute='value']---> syntax of or xpath
	// tagname[starts-with(@attribute,'value')]
	//tagname[contains(@attribute,'value')]
	
	public static void main(String[] args) throws Exception {
	 System.setProperty("webdriver.chrome.driver", "C:/Users/91899/Downloads/chromedriver_win32/chromedriver.exe");
	 WebDriver driver =  new ChromeDriver();
	 xpath obj = new xpath();
	 obj.openwebpage(driver);
	 obj.loginwebpage(driver);
	 obj.addtocart(driver);
	 obj.info(driver);
	 
	 
	}
	    void openwebpage ( WebDriver driver) {
		driver.get("https://www.saucedemo.com/");
	}
	    void loginwebpage(WebDriver driver) {
	    	//using starts-with x path
		WebElement textbox = driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]"));
		textbox.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'password')]"));
		password.sendKeys("secret_sauce");
		WebElement loginbtn = driver.findElement(By.xpath("//input[starts-with(@id,'login-button')]"));
		loginbtn.click();
	}
	    void addtocart(WebDriver driver) {
	    	WebElement add1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	    	add1.click();
	    	WebElement add2 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
	    	add2.click();
	    	WebElement cart = driver.findElement(By.xpath("//*[contains(@id,'shopping_cart_container')]"));
	    	cart.click();
	    	WebElement check = driver.findElement(By.xpath("//*[contains(@id,'checkout')]"));
	    	check.click();
	    }
	    
	    
	    void info (WebDriver driver) throws Exception {
	    	WebElement firstname =driver.findElement(By.xpath("//input[@placeholder = 'First Name'and @id='first-name']"));
	    	firstname.sendKeys("Gopal");
	    	WebElement lastname =driver.findElement(By.xpath("//input[@placeholder = 'Last Name'and @id='last-name']"));
	    	lastname.sendKeys("Jadhav");
	    	WebElement postcode =driver.findElement(By.xpath("//input[@placeholder = 'Zip/Postal Code'and @id='postal-code']"));
	    	postcode.sendKeys("424203");
	    	WebElement click =driver.findElement(By.xpath("//input[@data-test = 'continue'and @id='continue']"));
	    	click.click();	    
	    	
	    	Thread.sleep(5000);
	    	driver.close();
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	
	

}}
