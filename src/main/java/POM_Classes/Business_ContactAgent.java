package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Business_ContactAgent {
	
	@FindBy (xpath="//a[@href='/businessins/']//span[@class='glyphicon glyphicon-triangle-right']")
	private WebElement Business;
	
	
	@FindBy (xpath="//h2[text()='Types of Coverage ']")
	private WebElement TypesOfCoverage;
	
	@FindBy (xpath="//div[text()='Commercial Property Insurance']")
	private WebElement CommercialPropertyInsurance;

	@FindBy (xpath="//input[@id='bh-sl-address']")
	private WebElement bZIP;

	@FindBy (xpath="//button[@id='bh-sl-submit']")
	private WebElement SerchButton;
	
	@FindBy (xpath="//a[text()='pfisher@rudolfinsurance.com']")
	private WebElement RudolfAgentEmail;
	
	

	
	public Business_ContactAgent(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	

	public void ReachContactPage()
	{
		Business.click();
		TypesOfCoverage.click();
		CommercialPropertyInsurance.click();
		bZIP.sendKeys("50047");
		SerchButton.click();
		RudolfAgentEmail.click();		
	}










}
