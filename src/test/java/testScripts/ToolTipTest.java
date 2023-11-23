package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		
//		First locating frame and switching into it from Main Page
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("age")).sendKeys(Keys.PAGE_DOWN); // to scroll down
		
//		Locating Element
		WebElement textbox = driver.findElement(By.xpath("//input[@id='age']"));
		Actions act = new Actions(driver);
		act.moveToElement(textbox).perform();
		String strTxt = driver.findElement(By.className("ui-tooltip-content")).getText();
		System.out.println("ToolTip Text is..."+strTxt);
		
		WebElement age = driver.findElement(By.id("age"));
		textbox.sendKeys("20");
		
		
		
		
		

	}

}
