package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		WebElement srcbox = driver.findElement(By.id("APjFqb"));
		srcbox.sendKeys("Java Tutorial");
		Thread.sleep(2000);
//		srcbox.sendKeys(Keys.ENTER);
//		srcbox.submit(); ---- For Submitting the Search Form
//		System.out.println("Page Title...."+driver.getTitle());
//		System.out.println("Page URL....."+driver.getCurrentUrl());
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();	
		
//		System.out.println("Modified in Phase2");
		
//		Capturing Auto-suggestion for Java Tutorial in Google Search Results Page
		
		List<WebElement> list = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]//li//descendant::div[@class='wM6W7d']"));
		
		System.out.println("Number of Search Results Suggestions for Java Tutorial = "+list.size());
		
		System.out.println("Java Tutorial Search Results Suggestions List....");
		
//		For Loop to print the List of Suggestion
		for(WebElement item : list) {
			
			System.out.println(item.getText());
			
		}
		
//		For Loop to search for Java tutorial pdf in search result suggestion and click on it
		
//		Using conventional For-Loop
		
//		for(int i = 0;i<list.size();i++) {
//			
//			if(list.get(i).getText().equalsIgnoreCase("java tutorial pdf")) {
//				list.get(i).click();
//				break;
//			}
//			
			
//		Using Enhanced For-Loop
		
		for(WebElement item1 : list) {
			
		if(item1.getText().equalsIgnoreCase("java tutorial pdf")) {
			
			item1.click();
			break;
			
		}
			
		}
		

	}

}
