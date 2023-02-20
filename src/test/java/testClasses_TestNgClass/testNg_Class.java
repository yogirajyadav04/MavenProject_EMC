package testClasses_TestNgClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_Classes.Business_ContactAgent;
import POM_Classes.ContactAgent_fillPersonalInformationPage;

public class testNg_Class {

	private WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Velocity Class\\Automation\\appication and software instalation\\instalation\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("disable-notifications"); //disable disable-notifications
		 driver = new ChromeDriver(options);

       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.manage().window().maximize();
       driver.get("https://www.emcins.com/");
	
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
		Business_ContactAgent business_ContactAgent=new Business_ContactAgent(driver);
        
        business_ContactAgent.ReachContactPage();
	}
	@Test
	public void test2() {
	//ContactAgent_fillPersonalInformationPage contactAgent_fillPersonalInformationPage=new ContactAgent_fillPersonalInformationPage(driver);
	ContactAgent_fillPersonalInformationPage contactAgent_fillPersonalInformationPage2 = new ContactAgent_fillPersonalInformationPage(
			driver);
	contactAgent_fillPersonalInformationPage2.FormSubmission();
	}
	@AfterMethod
	
    public void afterMethod() {
		System.out.println("aftermethod");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
		//driver.quit();
	}
	
	
	
	
	
	
}
