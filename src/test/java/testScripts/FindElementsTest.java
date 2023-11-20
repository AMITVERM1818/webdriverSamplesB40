package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		Launching Website
		driver.get("https://www.lambdatest.com/");
		
//		Locating all Vertical Menu Options with common Xpath(starts-with) Locator Strategy		
		List<WebElement> vMenuItems = driver.findElements(By.xpath("//div[@class='w-4/12 px-15 smtablet:w-full']//div[starts-with(@class, 'py-2')]"));

//      Printing number of menuItems by using size() method
		System.out.println("Number of Vertical Menu Items..."+vMenuItems.size());
		
//		Printing Name of Each Vertical Menu Items
		int count=1;
		for(WebElement item : vMenuItems) {
			
			System.out.println("Vertical Menu Item-"+count+"-"+item.getText());
			count++;
			
		}

	}

}
