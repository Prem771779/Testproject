package javaPackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Exception {

		System.setProperty("webDriver.chrome.driver", "c:\\software.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");

		// Type casting of 2 interfaces
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Locate WebElement using JavascriptExecutor
		jse.executeScript("document.getElementById('email').value = 'kaila.premchand@gmail.com'");
		jse.executeScript("document.getElementById('pass').value = 'Kaila@891'");
		
		// scroll down
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)");
		
		//Scroll up
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)");
		
		driver.findElement(By.xpath("//*[@name='login']")).click();

	}

}
