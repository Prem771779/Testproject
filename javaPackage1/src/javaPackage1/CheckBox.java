package javaPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBox {

	public static void main(String[] args) {


		System.setProperty("webDriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// opening facebook
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize(); // Maximize windows
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(checkbox);
		act.perform();
		
		driver.findElement(By.className("Automation")).click();
		driver.findElement(By.className("Performance")).click();
		
		driver.findElement(By.className("Automation")).getText();

		
	}

}
