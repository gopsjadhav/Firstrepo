import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/91899/Downloads/geckodriver-v0.31.0-win64/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		//from selenium import webdriver

		//options = webdriver.FirefoxOptions()
		//options.binary_location = r"C:/location/to/Firefox/Binary/firefox.exe"
		//driver = webdriver.Firefox(executable_path=r'C:\Users\Cody\Downloads\geckodriver.exe', options=options)
		//driver.get('http://inventwithpython.com/')
	}

	private static Object options() {
		// TODO Auto-generated method stub
		return null;
	}

}
