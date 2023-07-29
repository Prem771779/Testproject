package javaPackage1;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RRR {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webDriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		String gettitle = driver.getTitle();
		System.out.println(gettitle);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-csa-c-content-id='nav_cs_electronics']")).click();
		
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		System.out.println(driver.getTitle());
		
		
		
	}

}
