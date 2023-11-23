package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteTest {

	public static final String expValue = "JavaScript";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
//		Important to give this Implicit Wait here, as without this, we will not get expected result.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/autocomplete/");
		
//		Since our Text-Box is in Frame; so we will first switch to Frame from Main Page
		WebElement frame1 = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame1);
		WebElement inpBox = driver.findElement(By.cssSelector(".ui-autocomplete-input"));
		inpBox.sendKeys("as");
		
//		Storing Autocomplete Options
//		List<WebElement> items = driver.findElements(By.xpath("//ul[@id='ui-id-1']//descendant::li"));
		List<WebElement> items = driver.findElements(By.cssSelector("ul#ui-id-1 > li"));
		
//		To Know the Number of Matching Items
		System.out.println("Number of Matching Items...."+items.size());
		
//		To get the text of each item
		for(WebElement item : items) {
			System.out.println(item.getText());
//		To Select Expected Value
		if(item.getText().equalsIgnoreCase(expValue)) {
			item.click();
			break;
			
		}
			
		}

	}

}
