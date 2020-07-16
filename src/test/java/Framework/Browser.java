package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
	
public WebDriver driver ;
	
	public void launchbrowser()
	{
		String chromepath = "C:\\Users\\Anitha\\chromedriver.exe" ;
		System.setProperty("WebDriver.chrome.driver",chromepath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		//options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		driver =new ChromeDriver(options);

	}

}
