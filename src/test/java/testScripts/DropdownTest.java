package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		Demo of Simple Single Select
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
//		Creating object of Select Class to call Select Class methods
		Select singleSelect = new Select(driver.findElement(By.id("select-demo")));
		singleSelect.selectByValue("Tuesday");

//		Demo of Multiple Select
		
		Select multiSelect = new Select(driver.findElement(By.id("multi-select")));
		if(multiSelect.isMultiple()) {
			
			multiSelect.selectByIndex(0);
			multiSelect.selectByValue("Florida");
			multiSelect.selectByVisibleText("Washington");
			
		}
		
		List<WebElement> items = multiSelect.getAllSelectedOptions();
		System.out.println("Items Selected : "+items.size());
		multiSelect.deselectByValue("Florida");
		
	}

}
