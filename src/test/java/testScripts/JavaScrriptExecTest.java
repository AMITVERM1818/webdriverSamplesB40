package testScripts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScrriptExecTest {

	public static void main(String[] args) {

//		Using JavaScript commands in Selenium
//		Launch Website -> Print Title of Page -> Type Phone in search text box -> And Scroll down the page		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Type Casting Javascript object into string
		String strTitle = (String)js.executeScript("return document.title");
		System.out.println(strTitle);
		WebElement searchBox = (WebElement)js.executeScript(
				"return document.getElementsByName('search')[0]");
		searchBox.sendKeys("Phone");
		
		js.executeScript("window.scrollBy(10, document.body.scrollHeight)");
		
		
		
		
		
		

	}

}
