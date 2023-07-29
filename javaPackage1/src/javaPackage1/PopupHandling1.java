package javaPackage1;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webDriver.chrome.driver", "c:\\software.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='windowButton']")).click();
		
		// Print how many windows are opened
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		System.out.println(allwin.size());
		
		Iterator<String> abc = allwin.iterator();
		String window1 = abc.next();
		String window2 = abc.next();
		
		
		// Print title of parent window
		driver.switchTo().window(window1);
		System.out.println(window1); // alphanumeric type
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		// Print title of child window
		driver.switchTo().window(window2);
		System.out.println(window2); // alphanumeric type
		System.out.println(driver.getTitle());
		
		
	
		
	}

}
