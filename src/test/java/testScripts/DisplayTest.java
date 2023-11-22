package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationbookstore.dev/");
		driver.findElement(By.id("searchBar")).sendKeys("Test");
//		Get Attribute method usage
		String strPlaceholder = driver.findElement(By.id("searchBar")).getAttribute("placeholder");
		System.out.println(strPlaceholder);
//		isDisplayed method usage and demonstration of hidden element
//		So once "Test" is entered in Search Bar -> close icon becomes visible on Webpage
		WebElement closeIcon = driver.findElement(By.cssSelector("a[title = 'Clear text']"));
		System.out.println(closeIcon.isDisplayed());
		if(closeIcon.isDisplayed()) {
			
			closeIcon.click();
			
		}
				
				

	}

}
