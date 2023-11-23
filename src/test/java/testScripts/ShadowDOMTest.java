package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://watir.com/examples/shadow_dom.html");
		
//		We can locate Shadow DOM Content in Browser; Can only be located through Code
//		Printing Outer Shadow DOM Content
		WebElement shadowHost = driver.findElement(By.cssSelector("div#shadow_host"));
		SearchContext context = shadowHost.getShadowRoot();
		WebElement shadowContent = context.findElement(By.cssSelector("span#shadow_content"));
		
//		We cannot use driver.findElement here in this case of Shadow DOM, else we will get NO Such Element Exception
//		WebElement shadowContent = driver.findElement(By.cssSelector("span#shadow_content"));
		
		System.out.println("Shadow DOM Content : "+ shadowContent.getText());
		
//		Printing Inner Shadow DOM Content
		WebElement innerShadow = context.findElement(By.cssSelector("div#nested_shadow_host"));
		SearchContext innerContext = innerShadow.getShadowRoot();
		WebElement innerContent = innerContext.findElement(By.cssSelector("div#nested_shadow_content"));
		
		System.out.println("Inner Shadow DOM Content : "+ innerContent.getText());
		
		
		

	}

}
