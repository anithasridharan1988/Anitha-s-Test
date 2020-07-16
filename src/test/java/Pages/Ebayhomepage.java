package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Framework.commonclass;
import util.property;

public class Ebayhomepage {
	
	@FindBy(xpath="//input[@id='gh-ac']")
	WebElement searchtext;
	@FindBy(xpath="//input[@id='gh-btn']")
	WebElement searchbutton;
	@FindBy(xpath= "((//div[@id='srp-river-results']//following-sibling::li)[15]//child::a)[2]")
	WebElement firstproduct;
	@FindBy(xpath="//h1[@id='itemTitle']")
	WebElement productTitle;
	@FindBy(xpath="//span[@id='prcIsum']")
	WebElement price;
	
    WebDriver driver;
    public WebDriverWait wait;
	property p = new property();
	String obj_rep = "C:\\Users\\Dinesh Sekar\\eclipse-workspace\\eBayTest\\Property\\objectrepository.properties";
	public String product = p.propertyfile(obj_rep).getProperty("productname");
	
	public Ebayhomepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void search()
	{
		
		searchtext.sendKeys(product);
		searchbutton.click();
	}
	
	public void firstproduct() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(firstproduct));
		firstproduct.click();			
		Thread.sleep(3000);
		String itemname=productTitle.getText();
		String amount = price.getText();
		System.out.println("Product Title : "+itemname);
		System.out.println("Price : "+amount);
	
	}

}
