package javaPackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {

		System.setProperty("webDriver.chrome.driver", "C:\\software.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		
		List<WebElement> dob = driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println("Total values:- "+dob.size());
		System.out.println(dob.get(12).isEnabled());
		dob.get(12).click();
		
		List<WebElement> month = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total months:- "+month.size());
		System.out.println(month.get(8).isEnabled());
		month.get(4).click();
		
		List<WebElement> year = driver.findElements(By.xpath("//select[@id='year']/option"));
		System.out.println("No of years:- "+year.size());
		System.out.println(year.get(100).isEnabled());
		year.get(36).click();
		
		// 2nd way
		WebElement bm = driver.findElement(By.xpath("//select[@id='year']"));
		Select mont = new Select(bm);
		mont.selectByValue("1999");
		
		WebElement bm1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select mmm = new Select(bm1);
		mmm.selectByValue("4");
		mmm.selectByVisibleText("Feb");
		mmm.selectByIndex(3);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select ddd = new Select(day);
		ddd.selectByValue("28");
		
		
	
		
	}

}
