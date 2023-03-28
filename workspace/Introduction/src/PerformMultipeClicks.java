import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PerformMultipeClicks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		for(int i =1; i <5; i++) 
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		int i = 1;
		while(i < 4) 
		{
			driver.findElement(By.id("hrefIncChd")).click();
			
			i++;
		}
		for(int x =1; x < 3; x++) 
		{
			driver.findElement(By.id("hrefIncInf")).click();
		}
		//int x = 1;
		//while(x < 3) 
		//{
		//	driver.findElement(By.id("hrefIncInf")).click();// check this
		//	i++;
		//}
		  driver.findElement(By.id("btnclosepaxoption")).click();

		  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
