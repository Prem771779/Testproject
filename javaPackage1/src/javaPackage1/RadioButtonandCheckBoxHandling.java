package javaPackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonandCheckBoxHandling {

	public static void main(String[] args) throws Exception {

		System.setProperty("webDriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Not good approach
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"1\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value =\"2\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"-1\"]")).click();
		
		
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		System.out.println("Total RadioButtons:-  " + radios.size());
		System.out.println(radios.get(0).isDisplayed());
		radios.get(1).click();
		
		List<WebElement> radios1 = driver.findElements(By.xpath("//label[contains(@class, 'mt')]"));
		System.out.println("Total RadioButtons1:- "+ radios1.size());
		String expResult = "Female";
		for (int i = 0; i<radios1.size(); i++) {
			if (radios1.get(i).getText().equalsIgnoreCase(expResult)) {
				radios1.get(i).click();
				System.out.println(expResult + "Clicked");
				break;
				
			}
		}
		
	}

}
