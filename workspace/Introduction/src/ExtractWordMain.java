// Refer to the video 44 parse the string.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExtractWordMain {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		// creating the object for that class
		ExtractWord word = new ExtractWord();
		// As we return the string there. we need to store that string so creating one variable for that.
		String pass = word.GetPassword(driver);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("inputUsername")).sendKeys("Vanmathi");
		driver.findElement(By.name("inputPassword")).sendKeys(pass);// using that password here
		driver.findElement(By.xpath("//label[@for='chkboxOne']")).click();
		driver.findElement(By.cssSelector("label[for='chkboxOne']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit signInBtn')]")).click();	
	}
	

}
