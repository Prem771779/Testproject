package javaPackage1;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4J {

	public static void main(String[] args) {
		
		// created log instance
		Logger logger = Logger.getLogger("Log4J");
		
		// configure log Properties
		PropertyConfigurator.configure("C:\\software\\Data\\software\\javaPackage1\\log4j.properties");
		
		System.setProperty("webDriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("Browser Open");
		
		// Maximize window
		driver.manage().window().maximize();
		logger.info("Maximize window");
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("Applied Implicit");
		
		//Open URL
		driver.get("https://www.facebook.com/");
		logger.info("Opened facebook");
				
	}

}
 