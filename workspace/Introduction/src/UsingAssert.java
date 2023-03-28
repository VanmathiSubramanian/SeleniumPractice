import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class UsingAssert {

	public static void main(String[] args) throws InterruptedException {
		String name = "Vanmathi";
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//label[@for='chkboxOne']")).click();
		driver.findElement(By.cssSelector("label[for='chkboxOne']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit signInBtn')]")).click();
		Thread.sleep(3000);
		String hello = driver.findElement(By.cssSelector("div[class = 'login-container'] h2")).getText();
		String welcome = driver.findElement(By.cssSelector("div[class = 'login-container'] h1")).getText();
		String login = driver.findElement(By.xpath("//div[@class='login-container']/p")).getText();
		Assert.assertEquals(hello, "Hello"+" "+name+",");
		Assert.assertEquals(welcome, "Welcome to Rahul Shetty Academy");
		Assert.assertEquals(login, "You are successfully logged in.", "Are equal");
		System.out.println(hello + " "+ welcome + " " + login );
		driver.findElement(By.xpath("//button[text() = 'Log Out']")).click();
		//driver.findElement(By.xpath("*[text() = 'Log Out']")).click();
		driver.close();
		
	}

}
