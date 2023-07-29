package BasicSeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickandDoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		WebElement doubleClickElement = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions action = new Actions(driver);		
		action.doubleClick(doubleClickElement).build().perform();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();
		
		WebElement righClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		action.contextClick(righClick).build().perform();
		
		

	}

}
