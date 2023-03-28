// Refer to the video 44 parse the string.
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ExtractWord {

	public String GetPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Vanmathi");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("vanmathivs20@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("94437289121");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String password = driver.findElement(By.className("infoMsg")).getText(); // getting the 
		String[] password1 = password.split("'");
		String[] password2 = password1[1].split("'");
		String password3 = password2[0];
		return password3;
	}
		
		
		
		
	}
