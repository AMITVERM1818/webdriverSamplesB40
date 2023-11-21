package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		
		//Locating the Salary of Wagner using following sibling xpath
		String salElem = driver.findElement(By.xpath("//td[contains(text(), 'B. Wagner')]//following-sibling::td[5]")).getText();
		System.out.println("B. Wagner Salary = "+salElem);
		
		//Printing the number of elements in Following Siblings corresponding of B.Wagner 
		List<WebElement> items = driver.findElements(By.xpath("//td[contains(text(), 'B. Wagner')]//following-sibling::td"));
		
		System.out.println("Number of Items...."+items.size());
		
		for(WebElement cell: items) {
			
			System.out.println(cell.getText());
		}
		
		
		// To get Employee names who are working in San Francisco Office and Print them
		
		List<WebElement> employees = driver.findElements(By.xpath("//td[contains(text(), 'San Francisco')]//preceding-sibling::td[2]"));
		
		System.out.println("Number of Employees working in San Francisco Office = "+employees.size());
		
		for(WebElement emp : employees) {
			
			System.out.println(emp.getText());
		}
		
		
		

	}

}
