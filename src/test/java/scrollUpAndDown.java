import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class scrollUpAndDown {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialsninja.com/demo");
		
	}
	@Test
	public void scrollUpDown() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-1000)");
		
		
	}
}
