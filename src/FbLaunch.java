import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\April12Locator1Clss\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement textUsername = driver.findElement(By.id("email"));
		textUsername.sendKeys("shana");
		WebElement textPassword = driver.findElement(By.id("pass"));
		textPassword.sendKeys("12345");
		WebElement buttonLogin = driver.findElement(By.name("login"));
		buttonLogin.click();
		driver.close();
		

	}

}
