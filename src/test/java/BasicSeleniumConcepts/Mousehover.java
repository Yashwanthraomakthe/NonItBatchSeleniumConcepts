package BasicSeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		System.out.println("Old Current URL" + driver.getCurrentUrl());
		System.out.println("Old title " +driver.getTitle());
		
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/div/a"));
		
		WebElement target=driver.findElement(By.xpath("//*[@id=\"menu-item-4629\"]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(source).build().perform();
		target.click();
		Thread.sleep(2000);
		
		System.out.println("newCurrent URL" +driver.getCurrentUrl());
		System.out.println("new title " + driver.getTitle());
		
		

	}

}
