package helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	static WebDriver driver;
	static String url = "http://sampleapp.tricentis.com/101/app.php";
	
private DriverFactory() {}
	
	public static WebDriver getDriver(){
		if(driver == null) {
			switch (Propriedades.browser) {
				case FIREFOX: 
					System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
					driver = new FirefoxDriver();
					break;
				case CHROME: 
					System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
					driver = new ChromeDriver(); 
					break;
			}
			
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		return driver;
	}

	public static void killDriver(){
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
	
}