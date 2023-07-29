package BasicSeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		
		
		WebElement dropdown = driver.findElement(By.name("country"));
		
		Select s = new Select(dropdown);
		
		s.selectByVisibleText("ALGERIA");
		Thread.sleep(2000);
		s.selectByIndex(4);
		
		

	} 

}
