package BasicSeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDrop(source, destination).build().perform();
		Thread.sleep(2000);
		
		
		

	}

}
