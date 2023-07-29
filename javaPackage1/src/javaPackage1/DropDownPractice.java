package javaPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {

	public static void main(String[] args) throws Exception {
		System.setProperty("webDriver.chrome.driver", "C:\\software.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select yyy = new Select(year);
		yyy.selectByValue("1987");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select mont = new Select(month);
		mont.selectByVisibleText("Aug");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select dob = new Select(day);
		dob.selectByIndex(12);
		
	}

}
