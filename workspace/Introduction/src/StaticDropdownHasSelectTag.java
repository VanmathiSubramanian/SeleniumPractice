
//2
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownHasSelectTag {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// have to select the drop down which is static and has select Html tag
		// to access the method of select we need to create as object for that
		 WebElement element =  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 Select obj = new Select(element);
		 obj.selectByIndex(0);
		 // how to print the value which is selected?
		 System.out.println( obj.getFirstSelectedOption().getText()); //The method getFirstSelectedOption() returns the selected option in the dropdown. 
		 obj.selectByIndex(2);
		 System.out.println( obj.getFirstSelectedOption().getText());
		 obj.selectByVisibleText("INR");// will select by given text 
		 System.out.println( obj.getFirstSelectedOption().getText());
		 obj.selectByValue("AED");// will select by given value 
		 System.out.println( obj.getFirstSelectedOption().getText());
	}

}
