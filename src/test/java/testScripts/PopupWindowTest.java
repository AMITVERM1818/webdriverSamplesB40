package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent Window Handle : "+parentWin);
		
		WebElement newTabBtn = driver.findElement(By.xpath("//button[contains(text(),'Click to open new Tab')]"));
		newTabBtn.click(); // new child window openend
//		Parent Window Page title displayed
		System.out.println("Page Title : "+driver.getTitle());
		Set<String> tabs = driver.getWindowHandles();
		
//		Printing number of window tabs opened
		System.out.println("No. of Windows...."+tabs.size());
		for(String child : tabs) {
			
			System.out.println("Windows..."+child);
//			Comparing Window Handles with the Parent Window Handle -> and then switching to Child window  
			if(!child.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(child);
				System.out.println("Child Window Title : "+driver.getTitle());// getting title of child window
				driver.findElement(By.xpath("(//span[contains(text(), 'Java')])[1]")).click();
							
			}
		}
		
//		As the focus is on Child Window, by giving the following command child window closes here
		driver.close();
				
//		Now we have to bring focus back to Parent Window to perform further action on Parent Window
		driver.switchTo().window(parentWin);
		System.out.println("Parent Page Title : "+driver.getTitle());
		driver.findElement(By.xpath("//button[contains(text(), 'Click to open new Window' )]")).click();
				
		Set<String> tab1 = driver.getWindowHandles();
//		Printing number of window tabs opened
		System.out.println("No. of Windows...."+tab1.size());
		for(String child : tab1) {
			
			System.out.println("Windows..."+child);
//			Comparing Window Handles with the Parent Window Handle -> and then switching to Child window  
			if(!child.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(child);
				System.out.println("Child Window Title : "+driver.getTitle());// getting title of child window
											
			}
		}
		
//		Opening a New Window(or a New Tab) and launching a new website page
		
		driver.close();
		
		driver.switchTo().window(parentWin);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://watir.com/examples/shadow_dom.html");
		
		
		
//		driver.quit();
		
	}

}

