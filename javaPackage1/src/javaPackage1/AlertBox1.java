package javaPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertBox1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webDriver.chrome.driver", "c:\\software.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		Thread.sleep(2000);

		// Verify alert text
		System.out.println(driver.switchTo().alert().getText());
		String expRes = "Do you confirm action?";
		Assert.assertEquals(driver.switchTo().alert().getText(), expRes);
		System.out.println("Alert text Verified");

		// Accept Alert
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("Alert accepted");

		// Dismiss Alert
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		driver.switchTo().alert().dismiss();
		System.out.println("Alert Rejected");

		driver.close();
		driver.quit();

	}

}
