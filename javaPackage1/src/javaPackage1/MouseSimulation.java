package javaPackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) throws Exception {

		System.setProperty("webDriver.chrome.driver", "c\\software.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

		// Create WebElement reference
		WebElement ele = driver.findElement(By.xpath("//*[text()='Electronics']"));

		// Mouse simulation using action class
		Actions act = new Actions(driver);

		// Mouse hover to electronics web element
		Thread.sleep(2000);
		act.moveToElement(ele).build().perform();

		// Perform key events
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
				
		// press enter to home page
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement home = driver.findElement(By.xpath("//*[text()='Home']"));
		act.sendKeys(home, Keys.ENTER).build().perform();
		System.out.println("Home Clicked Successfully");
		

	}

}
