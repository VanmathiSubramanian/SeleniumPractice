//1

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TraverseUsingSibiling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// from sibling to sibling
		String Var = driver.findElement(By.xpath("//header/div/a[1]/following-sibling::button[2]")).getText();
		System.out.println(Var);
		// from sibling to parent
		String Var1 = driver.findElement(By.xpath("//header/div/a[1]/parent::div")).getText();
		System.out.println(Var1);
		// from sibling to parent(child) to parent
		driver.findElement(By.xpath("//header/div/a[1]/parent::div/parent::header/a[2]")).click();
		Thread.sleep(3000);
		driver.navigate().back();// navigate back to the url
	
	}

}
