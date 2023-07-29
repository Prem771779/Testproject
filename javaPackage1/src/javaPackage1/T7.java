package javaPackage1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class T7 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setEnv() {
		
		System.setProperty("webDriver.chrome.driver", "C:\\software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
	
	@DataProvider
	public Object[][] dataSet() throws Exception {
		
		File src = new File("C:\\software\\Data\\software\\javaPackage1\\Repository\\Object_repo.properties");
		FileInputStream fis = new FileInputStream(src);
		
		Properties pro = new Properties();
		pro.load(fis);
		
		Object arr[][] = new Object[3][2];
		
		arr[0][0] = pro.getProperty("TestData1");
		arr[0][1] = pro.getProperty("TestData2");
		
		arr[1][0] = "Email_2";
		arr[1][1] = "Pw_2";
		
		arr[2][0] = "E3";
		arr[2][1] = "p3";
		
		return arr;
		}
	
	@Test(dataProvider = "dataSet")
	public void enterData(String UN, String PW) throws Exception {

		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(UN);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(PW);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();

	}
	
}