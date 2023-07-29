package BasicSeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.maxlifeinsurance.com/cs/login?redirectURL=/dashboard");
		System.out.println("Current URL is " + driver.getCurrentUrl());
		driver.findElement(By.id("mobile")).sendKeys("11234545");
		Thread.sleep(2000);
		driver.findElement(By.id("mobile")).clear();
		System.out.println("Title: " + driver.getTitle());

		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
		System.out.println("Current URL is " + driver.getCurrentUrl());
		
		List<WebElement> noOfCheckboxss = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("No of checkboxs " + noOfCheckboxss.size());
		Thread.sleep(2000);
		System.out.println("Title: " + driver.getTitle());
		
		
		
		driver.navigate().back();		
		System.out.println("Current URL is " + driver.getCurrentUrl());
		Thread.sleep(2000);
		System.out.println("Title: " + driver.getTitle());
		
		driver.navigate().forward();		
		System.out.println("Current URL is " + driver.getCurrentUrl());
		Thread.sleep(2000);
		System.out.println("Title: " + driver.getTitle());

		driver.close();
		
		

	}

}
