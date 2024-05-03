
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class resizeBrowser {

	@Test(priority=1)
	public void resizeBrowserWindow() {
		WebDriver driver = new ChromeDriver();
		int width = 800;
		int height = 600;
		
		Dimension dimension = new Dimension(width, height);
		driver.manage().window().setSize(dimension);
		driver.get("https://www.tutorialsninja.com/demo");
	}
	
}
