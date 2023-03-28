import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SignIn {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("inputUsername")).sendKeys("Vanmathi");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//label[@for='chkboxOne']")).isSelected();
		driver.findElement(By.cssSelector("label[for='chkboxOne']")).isSelected();
		driver.findElement(By.xpath("//button[contains(@class,'submit signInBtn')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/p")).getText());
	}

}
