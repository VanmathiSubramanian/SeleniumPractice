import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SucessfulLogin {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("inputUsername")).sendKeys("Vanmathi");
		driver.findElement(By.name("inputPassword")).sendKeys("Vanmathi");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Vanmathi");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("vanmathivs20@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("94437289121");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); //Xpath
		Thread.sleep(4000);  
		driver.findElement(By.id("inputUsername")).sendKeys("Vanmathi");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//label[@for='chkboxOne']")).click();
		driver.findElement(By.cssSelector("label[for='chkboxOne']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit signInBtn')]")).click();
		Thread.sleep(4000);  
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/p")).getText());
		//driver.findElement(By.tagName("p")).getText();
		driver.findElement(By.cssSelector("button.logout-btn")).click();
		//driver.quit();
	}

}
