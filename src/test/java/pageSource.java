import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pageSource {
	@Test
	public void setup() {
		WebDriver driver= new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		String PageScource = driver.getPageSource();
		System.out.println(PageScource);
		driver.quit();	
	}
}





