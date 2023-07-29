package javaPackage1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webDriver.chrome.driver", "c:\\software.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/index.html");
		driver.findElement(By.xpath("//a[normalize-space()='Gainers / Losers']")).click();

		// Create list - All co's
		List<WebElement> allcos = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total companys:- " + allcos.size());

		// Create Current price
		List<WebElement> cp = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total curremt Price list:- " + cp.size());

		String expRes = "Refex Industries";
		for (int i = 0; i < allcos.size(); i++) {
			if (allcos.get(i).getText().equalsIgnoreCase(expRes)) {
			System.out.println(allcos.get(i).getText() + "====="+ cp.get(i).getText());
			allcos.get(i).getText();
			break;
		}

	}

	}
}
