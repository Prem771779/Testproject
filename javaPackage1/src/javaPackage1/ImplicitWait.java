package javaPackage1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webDiver.chrome.driver", "C:\\software.chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("naukri");
		
		//Handling Autosuggesstions/

		List<WebElement> Allsugesstions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("All Sug= " + Allsugesstions.size());
		String expRes = "naukri jobs hyderabad";

		for (int i = 0; i < Allsugesstions.size(); i++) {
			if (Allsugesstions.get(i).getText().equalsIgnoreCase(expRes)) {
				Allsugesstions.get(i).click();
				break;
			}

		}

	}

}
