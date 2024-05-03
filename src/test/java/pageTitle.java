import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;










public class pageTitle {
	@Test
	public void setup() {
		WebDriver driver= new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page -> " + pageTitle);
		driver.quit();	
	}
}




