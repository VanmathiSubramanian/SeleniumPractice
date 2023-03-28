import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDropDownParentChildRelationshipInXpath {

		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new FirefoxDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.findElement(By.cssSelector("a[value ='MAA']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("(//a[@value ='CJB'])[2]")).click();
			driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value ='CJB']")).click();

	  }

}
