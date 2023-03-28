import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeliniumIntro {

	public static void main(String[] args) 
	{
		// invoking the chrome driver
		// selinium came up wih new update that we dont want mention this path and key
		// it is present in the jar 
		// called selenium manager will on if i put this code it will note that then selenium manager will be off
		//System.setProperty("webdriver.chrome.drive","C:\\Users\\vanma_2lhixtg\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Invoking Browser
		//WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.drive","C:\\Users\\vanma_2lhixtg\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.");
		
		WebDriver driver = new FirefoxDriver();
		WebDriver driver1 = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver1.get("https://www.amazon.ca/");
		System.out.println(driver1.getCurrentUrl());
		System.out.println(driver1.getTitle());

		driver.quit();
		driver1.quit();
		
	}

}
