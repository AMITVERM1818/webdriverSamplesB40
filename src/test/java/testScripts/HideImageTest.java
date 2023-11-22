package testScripts;

import java.lang.StackWalker.Option;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HideImageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
//		This will disable Image loading in Webpage ---- Method-1
		options.addArguments("--blink-settings=imagesEnabled=fasle");

//		or alternatively we can set up direct preference ----- Method-2
//		Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("profile.managed_default_content_settings.images", 2);
//		options.setExperimentalOption("prefs", prefs);
		
//		Launching browser and hit website to see the Page load without Images
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.opencart.com/");
		
		
		}

}
