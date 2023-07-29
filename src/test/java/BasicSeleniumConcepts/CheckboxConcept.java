package BasicSeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement checkbox = driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
		
		checkbox.click();
		
		System.out.println(checkbox.isSelected());
		
		

	}

}
