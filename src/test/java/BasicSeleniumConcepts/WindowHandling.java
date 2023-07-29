package BasicSeleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/browser-windows");

		driver.findElement(By.id("windowButton")).click();

		Set<String> allwindowhandles = driver.getWindowHandles();

		Iterator<String> itr = allwindowhandles.iterator();

		String homepage = itr.next();

		String childwindow = itr.next();
		

		driver.switchTo().window(childwindow);
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		Thread.sleep(2000);
		//driver.close();
		driver.quit();

	}

}
