package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseAction {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		Creating Object for Actions Class
		Actions actions = new Actions(driver);
		
//		Performing Right Click or Context Click
//		driver.get("https://demo.opencart.com/");
//		WebElement srcBox = driver.findElement(By.name("search"));
//		actions.contextClick(srcBox).perform();
		
//		Move to Element and Hover.. so that sub-menu opens up
//		WebElement menu = driver.findElement(By.cssSelector("ul.nav.navbar-nav > li:nth-child(3)"));
//		actions.moveToElement(menu).perform();
		
//		Locating the Menu Item and clicking on it
//		WebElement menuitem = driver.findElement(By.xpath("//ul[@class='list-unstyled']//a[contains(text(),'Monitors (2)')]"));
//		actions.click(menuitem).perform();
		
//		Performing last two steps in single go -- as performing two operations, so we use build() method in this case
		
//		actions.moveToElement(menu).click(menuitem).build().perform();
		
//		Performing Double Click
		
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		Thread.sleep(1000);
		
		WebElement btn = driver.findElement(By.xpath("//button[contains(text(),'Click Me / Double Click Me!')]"));
		actions.doubleClick(btn).perform();
		Thread.sleep(1000);
		
		actions.doubleClick(btn).doubleClick(btn).build().perform();
		
//		Taking Screenshot of Complete Page in focus
		
		driver.get("https://demo.opencart.com/");
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + ".png";
		FileUtils.copyFile(src, new File(path));
		
		Thread.sleep(3000);
		
		WebElement image = driver.findElement(By.cssSelector("div.product-thumb"));
		
//		Performing Scroll Action
		
//		actions.scrollToElement(image).perform();
		actions.scrollByAmount(10, 400).perform();
		
//		Taking screenshot of a particular WebElement image
		
//        WebElement image = driver.findElement(By.cssSelector("div.product-thumb"));
	
		File src1 = image.getScreenshotAs(OutputType.FILE);
		String path1 = System.getProperty("user.dir") + "/screenshots/ImageScreenImg.png";
		FileUtils.copyFile(src1, new File(path1));
			

	}

}
