package javaPackage1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandle {

	public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		System.out.println(allwin.size());
		
		Iterator<String> abc = allwin.iterator();
		String win1 = abc.next();
		String win2 = abc.next();
		
		driver.switchTo().window(win2);
		System.out.println(win2);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
		
	}

}
