package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameCherTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
//		First switch into desired Frame.. here Frame Id is "frame1"
//		Switching from Main Page to Frame 1
		driver.switchTo().frame("frame1");
		WebElement inpBox = driver.findElement(By.xpath("//input[@type='text']"));
		inpBox.sendKeys("Hello Welcome");
		
//		Switching from Frame 1 to Frame 3
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
//		Switching from Frame 3 to Frame 1(which is the parent frame).. hence using parentFrame() method
		
		driver.switchTo().parentFrame();
//		As we are coming back to parent frame from child/other frame.. so we have to again give inpBox locator
		inpBox = driver.findElement(By.xpath("//input[@type='text']"));
		inpBox.clear();
		inpBox.sendKeys("Welcome Back");
		
//		Switching from Frame 1 to Main Page
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//label//span")).getText());
		
		
//		Switching from Main Page to Frame 2 and perform simple select from dropdown
		driver.switchTo().frame("frame2");
		Select dropdown = new Select(driver.findElement(By.id("animals")));
		dropdown.selectByValue("big baby cat");
		
		
		
		
		

	}

}
