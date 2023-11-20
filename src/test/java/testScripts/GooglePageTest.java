package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		WebElement srcbox = driver.findElement(By.id("APjFqb"));
		srcbox.sendKeys("Java Tutorial");
		srcbox.sendKeys(Keys.ENTER);
		System.out.println("Page Title...."+driver.getTitle());
		System.out.println("Page URL....."+driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();	
		

	}

}
