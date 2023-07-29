package javaPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlOpen {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com/"); //Launching browser
		driver.manage().window().maximize(); // Maximize browser
		driver.manage().deleteAllCookies();//Delete cookies
		Thread.sleep(2000); //Launching using Navigating URL
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.navigate().refresh(); //Page refresh
		Thread.sleep(2000);
		driver.navigate().back(); // Page back
		Thread.sleep(2000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl); // Print currentURL
		System.out.println(driver.getTitle()); // Get title of page
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
