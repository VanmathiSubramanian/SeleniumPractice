import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("Vanmathi");
		Thread.sleep(3000);
		driver.navigate().back();// navigate back to the url
		driver.navigate().forward();// navigate to google

	}

}
