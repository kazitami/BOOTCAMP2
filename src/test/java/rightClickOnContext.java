import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class rightClickOnContext {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialsninja.com/demo");
		
	}
	@Test
	public void contextClick() {
		WebElement element = driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg"));
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}
}
