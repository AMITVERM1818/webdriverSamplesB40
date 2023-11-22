package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
//		To locate the suggested List of Elements in Browser
//		Go to CDP -> Event Listeners -> blur -> Remove all JS Objects
//		Now, from browser we should be able to locate
		
//		driver.findElements(By.xpath("//div[contains(@class, '_2VHNef')]"));
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(7000);
		
		List<WebElement> items = driver.findElements(By.xpath("//div[contains(@class, '_2VHNef')]"));
		
		System.out.println(items.size());
		for(WebElement item : items) {
			
			System.out.println(item.getText());
		}
		
				
		
		

	}

}
