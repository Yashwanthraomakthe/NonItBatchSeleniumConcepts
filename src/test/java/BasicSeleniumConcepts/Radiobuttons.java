package BasicSeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");

		Thread.sleep(2000);

		driver.manage().window().maximize();

		// driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();

		WebElement impressivebutton = driver.findElement(By.className("custom-control-label"));
		impressivebutton.click();

		System.out.println(impressivebutton.isEnabled());

		driver.close();

	}

}
