import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) {
		
		        // Invoke Browser
				WebDriver Driver = new ChromeDriver();
				// Step 2.2: Asking selinium to wait for some time using this
				Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				// Step 2:Maximize the window 
				Driver.manage().window().maximize();
				// step 3: Access to the Url.				
				Driver.get("https://rahulshettyacademy.com/locatorspractice/");
				//step 4: To write value in user name
				Driver.findElement(By.id("inputUsername")).sendKeys("Vanmathi");
				//step 5: To write Password in the test box.
				Driver.findElement(By.name("inputPassword")).sendKeys("Vanmathi");
				//step 6: click action 
				Driver.findElement(By.className("signInBtn")).click();
				//step 7:To get the output from UI that displaced 
				System.out.println(Driver.findElement(By.cssSelector("p.error")).getText());
				//Step 7: Quit()
				Driver.quit();
		
	}	
}
