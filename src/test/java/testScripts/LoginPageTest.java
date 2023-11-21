package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		Launching Website and Login into it
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
		
//		User Logged in and Page Title printed.
		System.out.println("Page Title...."+driver.getTitle());
		
//		User Clicking on Logout Button
		driver.findElement(By.xpath("//a[@class='button secondary radius']")).click();
		
//		Example of LinkText and PartialLinkText Locator Strategy
//		driver.findElement(By.linkText("Elemental Selenium")).click();
//		driver.findElement(By.partialLinkText("Elemental")).click();
		
//		Launching another Website
		driver.get("https://accounts.lambdatest.com/register");
//		Entering Wrong Email Address
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ABC");
		
//		By CSS Selector
		driver.findElement(By.cssSelector(".radius")).click();
		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Printing Incorrect Email Address Error
		System.out.println("Wrong Email Id Error Message..."+driver.findElement(By.xpath("//p[@data-testid='errors-email']")).getText());
		
//		Launching Website Again
		driver.get("https://www.lambdatest.com/");
		
//		Navigating through Header Menu(Drop-downs) using XPath Indexing and printing menu item name

//		Header Menu(Drop-down)-1
		WebElement menu1 = driver.findElement(By.xpath("//div[@class='w-7/12 desktop:w-full header__menu__items']//div[@class='inline-block dropdown desktop:block resource-dropdown'][1]"));
        System.out.println("Drop-Down Menu-1..."+menu1.getText());
				
//		Header Menu(Drop-down)-2
		WebElement menu2 = driver.findElement(By.xpath("//div[@class='w-7/12 desktop:w-full header__menu__items']//div[@class='inline-block dropdown desktop:block resource-dropdown'][2]"));
		System.out.println("Drop-Down Menu-2..."+menu2.getText());
		
				
//		Header Menu(Drop-down)-3
		WebElement menu3 = driver.findElement(By.xpath("//div[@class='w-7/12 desktop:w-full header__menu__items']//div[@class='inline-block dropdown desktop:block resource-dropdown'][3]"));
		System.out.println("Drop-Down Menu-3..."+menu3.getText());

		
//		Header Menu(Drop-down)-4
		WebElement menu4 = driver.findElement(By.xpath("//div[@class='w-7/12 desktop:w-full header__menu__items']//div[@class='inline-block dropdown desktop:block resource-dropdown'][4]"));
		System.out.println("Drop-Down Menu-4..."+menu4.getText());
		
//		Using X-PATh (starts-with) Locator Strategy
//		Printing Different Vertical Menu Options
		String vmenu1 = driver.findElement(By.xpath("//div[@class='w-4/12 px-15 smtablet:w-full']//div[starts-with(@class, 'py-2')][1]")).getText();
		System.out.println("Vertical Menu Option-1..."+vmenu1);
		
		String vmenu2 = driver.findElement(By.xpath("//div[@class='w-4/12 px-15 smtablet:w-full']//div[starts-with(@class, 'py-2')][2]")).getText();
		System.out.println("Vertical Menu Option-2..."+vmenu2);
		
		String vmenu3 = driver.findElement(By.xpath("//div[@class='w-4/12 px-15 smtablet:w-full']//div[starts-with(@class, 'py-2')][3]")).getText();
		System.out.println("Vertical Menu Option-3..."+vmenu3);
		
		String vmenu4 = driver.findElement(By.xpath("//div[@class='w-4/12 px-15 smtablet:w-full']//div[starts-with(@class, 'py-2')][4]")).getText();
		System.out.println("Vertical Menu Option-4..."+vmenu4);
		
		String vmenu5 = driver.findElement(By.xpath("//div[@class='w-4/12 px-15 smtablet:w-full']//div[starts-with(@class, 'py-2')][5]")).getText();
		System.out.println("Vertical Menu Option-5..."+vmenu5);
		
		String vmenu6 = driver.findElement(By.xpath("//div[@class='w-4/12 px-15 smtablet:w-full']//div[starts-with(@class, 'py-2')][6]")).getText();
		System.out.println("Vertical Menu Option-6..."+vmenu6);
		
		String vmenu7 = driver.findElement(By.xpath("//div[@class='w-4/12 px-15 smtablet:w-full']//div[starts-with(@class, 'py-2')][7]")).getText();
		System.out.println("Vertical Menu Option-7..."+vmenu7);

	}

}
