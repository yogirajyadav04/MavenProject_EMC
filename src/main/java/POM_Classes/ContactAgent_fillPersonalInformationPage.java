package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactAgent_fillPersonalInformationPage {

	@FindBy(xpath = "//input[@id='fullName']")
	private WebElement First_LastName;

	@FindBy(xpath = "//input[@id='emailAddress']")
	private WebElement EmailAddress;

	@FindBy(xpath = "//input[@id='phoneNumber']")
	private WebElement PhoneNumber;

	@FindBy(xpath = "//input[@id='businessName']")
	private WebElement BusinessName;

	@FindBy(xpath = "//input[@id='businessZip']")
	private WebElement BusinessZIP;

	@FindBy(xpath = "//input[@id='businessCity']")
	private WebElement BusinessCity;

	@FindBy (xpath="//select[@id='businessIndustry']")
	private WebElement BusinessIndustry;////dropdowncode
	 
	@FindBy(xpath = "//input[@id='genLiability']")
	private WebElement CoverageIntreasted;

	@FindBy(xpath = "//textarea[@id='additionalInfo']")
	private WebElement AditionalInfo;

	@FindBy(xpath = "//input[@id='industryEvent']")
	private WebElement HearAboutUs;

	/*
	 * @FindBy(xpath = "//span[@id='recaptcha-anchor']") private WebElement
	 * NotRobot;
	 */
	public ContactAgent_fillPersonalInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void FormSubmission() {
		First_LastName.sendKeys("abc");
		EmailAddress.sendKeys("abc@gmail.com");
		PhoneNumber.sendKeys("+911234567890");
		BusinessName.sendKeys("abcd");
		BusinessZIP.sendKeys("50049");
		BusinessCity.sendKeys("Lucas");
	    BusinessIndustry.click();
	    Select s=new Select(BusinessIndustry);
	    s.selectByVisibleText("Telecommunications");
		CoverageIntreasted.click();
		AditionalInfo.sendKeys("softwareTestingPractice");
		HearAboutUs.click();
		//NotRobot.click();

	}

}
