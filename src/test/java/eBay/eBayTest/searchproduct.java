package eBay.eBayTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import Framework.Browser;
import Pages.Ebayhomepage;
import util.property;

public class searchproduct extends launch {
	
	
	@Test(priority=0)
	public void search() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Ebayhomepage eb = new Ebayhomepage(driver);
		eb.search();
		eb.firstproduct();	
	}
	
	@AfterSuite
	public void closebrowser()
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.close();
	}

}
