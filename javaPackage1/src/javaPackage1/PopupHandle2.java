package javaPackage1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PopupHandle2 {

	private static byte[] expected;
	private static byte[] actual;

	public static void main(String[] args) {

		System.setProperty("webDriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
		
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		System.out.println(allwin.size());
		
		Iterator<String> abc = allwin.iterator();
		String w1 = abc.next();
		String w2 = abc.next();
		
		driver.switchTo().window(w2);
		System.out.println(w2);
		System.out.println(driver.getTitle());
		
		String expRes = "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.";
		Assert.assertEquals(actual, expected);
		System.out.println("alert verified");
		
	}

}
