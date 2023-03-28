//Dynamic drop down ->The value in the drop down can be changes based on selecting other values
// Reason for this program - in this application there are same values how can we specify tell the selinium to select to select the particular one. 
// that is done in the program by specifying the them with index value.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value ='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value ='CJB'])[2]")).click();
//(//a[@value ='CJB'])[2]
	}

}
