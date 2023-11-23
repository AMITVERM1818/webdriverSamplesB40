package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
//		WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		
		WebElement btn = driver.findElement(By.xpath("//button[contains(text(),'Click me!')]"));
		btn.click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("Alert Text : "+alert.getText());
		
		alert.accept();
		
		
//		Handling Confirmation Alert
		driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[2]")).click();
		Alert confirm = driver.switchTo().alert();
		System.out.println("Alert Text : "+confirm.getText());
		confirm.dismiss();
		
//		Handling Prompt Alert
		driver.findElement(By.xpath("//button[contains(text(), 'Prompt')]")).click();
		Alert prompt = driver.switchTo().alert();
		System.out.println("Alert Text : "+prompt.getText());
		prompt.sendKeys("Hello Welcome");
		prompt.accept();
		
		

	}

}
