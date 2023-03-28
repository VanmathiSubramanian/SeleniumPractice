import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssCustomisedSyntax {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);//(element intersects) when we are moving from one view to another view we are giving the wait time in ms
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Vanmathi");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vanmathivs20@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("94437289121");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//System.out.println(driver.findElement(By.cssSelector("p[class='infoMsg']")).getText());
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());// using css selector
		//  we see the application Forgot your password?is clicked the slide is transfered as the seleinium is
		// fast it has to wait for the slide to transfer completely for that we are using THREAD.SLEEP(millisecond)
	}
}
