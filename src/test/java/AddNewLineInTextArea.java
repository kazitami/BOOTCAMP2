import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddNewLineInTextArea {

	@Test
	public void addNewLine() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//C:\\Users\\kazit\\eclipse-workspace\\BOOTCAMP_PART_2\\src\\test\\resources\\textArea.html"
		driver.get(System.getProperty("user.dir")+"\\src\\test\\resources\\textArea.html");
		
		WebElement textAreaElement = driver.findElement(By.id("addNewLine"));
		String textWithNewLines = " Line 1\n Line 2\n Line 3";
		textAreaElement.sendKeys(textWithNewLines);
	}
	
}
