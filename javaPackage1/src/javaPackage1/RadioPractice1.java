package javaPackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioPractice1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webDriver.chrome.driver", "C:\\software\\pk\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value = '1']")).click();
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("No of radios = "+radios.size());
		System.out.println(radios.get(1).isEnabled());
		System.out.println(radios.get(0).isDisplayed());
		Thread.sleep(2000);
		radios.get(1).click();
		System.out.println(radios.get(2).isSelected());
		radios.get(2).click();
		System.out.println(radios.get(2).isSelected());
		
		
		List<WebElement> radio = driver.findElements(By.xpath("//*[contains(@class,'8esa')]"));
		System.out.println("No of Radio = "+radio.size());
		String expResult = "Male";
		for (int i = 0; i<radio.size();i++) {
			if(radio.get(i).getText().equalsIgnoreCase(expResult)) {
				radio.get(i).click();
				System.out.println(expResult + "Clicked");
				break;
			}
		}


	}

}