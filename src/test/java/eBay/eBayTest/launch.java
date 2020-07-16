package eBay.eBayTest;

import org.testng.annotations.BeforeSuite;

import Framework.Browser;

public class launch extends Browser{
	
	@BeforeSuite
	public void launchsite()
	{
		launchbrowser();
		driver.get("https://www.ebay.com/");
	}

}
