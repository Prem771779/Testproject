package javaPackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws Exception {

		System.setProperty("webDriver.chrome.driver", "c:\\software.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(2000);

		// find no of frames on WebPage
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println(allFrames);

		// Go inside frame and check the webElement is present or not
		for (int i = 0; i < allFrames; i++) {
			driver.switchTo().frame(i);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()='Close']")).click();

		}

	}

}
