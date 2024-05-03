import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class radioButton {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	}
	@Test(priority=1)
	public void clickOnRadioButootn() {
		WebElement radioButton = driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']"));
		radioButton.click();
		System.out.println();
		System.out.println("Radio button got clicked");
		System.out.println();
		driver.quit();
	}
}






