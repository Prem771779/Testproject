package javaPackage1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {
		
		// specify the location of property fila
		File src = new File("C:\\software\\Data\\software\\javaPackage1\\Repository\\Object_repo.properties");
		
		//Create file input stream class object to load the file
		FileInputStream fis = new FileInputStream(src);
		
		// Create property class object to read the file
		Properties pro = new Properties();
		pro.load(fis);
		
		System.setProperty("webDriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// opening facebook
		driver.get(pro.getProperty("URL"));
		driver.manage().window().maximize(); // Maximize windows
		driver.findElement(By.id(pro.getProperty("Email"))).sendKeys(pro.getProperty("TestData1"));
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("TestData2"));
		
		driver.findElement(By.xpath("//*[@name='login']")).click();
		
	}

}
