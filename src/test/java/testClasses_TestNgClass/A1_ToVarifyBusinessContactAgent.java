package testClasses_TestNgClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Classes.Business_ContactAgent;

public class A1_ToVarifyBusinessContactAgent {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Velocity Class\\Automation\\appication and software instalation\\instalation\\chromedriver.exe");
				
		        WebDriver driver = new ChromeDriver();
		        
		        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		        driver.get("https://www.emcins.com/");
		        
		        driver.manage().window().maximize();
		        
		        Business_ContactAgent business_ContactAgent=new Business_ContactAgent(driver);
		        
		        business_ContactAgent.ReachContactPage();
		        
			}

}
