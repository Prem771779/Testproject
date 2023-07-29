package javaPackage1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksWebPage {

	public static void main(String[] args) {

		System.setProperty("webDriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linkscount = links.size();
		System.out.println("Total Links= " + linkscount);

		for (int i = 0; i < linkscount; i++) {
			System.out.println(driver.findElements(By.tagName("a")).get(i).getText());
		}
	}

}
