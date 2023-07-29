package javaPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assert1 {

	WebDriver driver;

	@Test
	public void testcase1() throws Exception {

		System.setProperty("webDriver.chrome.driver", "C:\\software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();

		Thread.sleep(1000);
		String actualMessage = driver.findElement(By.id("username-error")).getText();

		String expectedMessage = "Sorry, we don't recognize this email.";
		Assert.assertEquals(actualMessage, expectedMessage, "Actual and exception not matches");
		System.out.println("Verified");

	}

	@BeforeTest
	public void pub() {

		int a = 10;
		int b = 20;
		try {
			Assert.assertTrue(a > b, "true fail");
		} catch (AssertionError e) {
			// TODO: handle exception
		}
		System.out.println("exeption handl");
	}

}
