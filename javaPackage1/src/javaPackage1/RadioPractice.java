package javaPackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioPractice {

	public static void main(String[] args) throws Exception {

		System.setProperty("webDriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// opening facebook
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); // Maximize windows
		
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='1']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='-1']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='2']")).click();
	
	// 2nd way
	List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
	System.out.println("No of radios:- "+radio.size());
	System.out.println(radio.get(0).isDisplayed());
	System.out.println(radio.get(1).isEnabled());
	radio.get(1).click();
	
	// 3rd Way
	List<WebElement> radios = driver.findElements(By.xpath("//*[contains(@class,'8esa')]"));
	System.out.println("No of radios:- "+radios.size());
	String expResult = "Male";
	for (int i = 0; i < radios.size();i++) {
		if(radios.get(i).getText().equalsIgnoreCase(expResult)) {
			radios.get(i).click();
			System.out.println(expResult + "Clicked");
			break;
		}
		
	}
	
	
	
	
	
	
			}

}
