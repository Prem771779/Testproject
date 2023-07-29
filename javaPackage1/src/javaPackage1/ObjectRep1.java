package javaPackage1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRep1 {

	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\software\\Data\\software\\javaPackage1\\Repository\\Object_repo.properties");
		
		FileInputStream fis = new FileInputStream(src);
		
		Properties pro = new Properties();
		pro.load(fis);
		
		System.setProperty("webDriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pro.getProperty("URL"));
		driver.findElement(By.id(pro.getProperty("Email"))).sendKeys(pro.getProperty("TestData1"));
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("TestData2"));
		
	}

}
