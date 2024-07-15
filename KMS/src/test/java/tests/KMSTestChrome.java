package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;


//import Pages.BlazeHomePage;
import Pages.KMS;


public class KMSTestChrome {
	WebDriver driver;
	

	@BeforeTest
	public void setup() {
		WebDriverManager.chromiumdriver().setup();
		EdgeOptions options = new EdgeOptions();
		
	}


	@Test(priority = 0)

	public void testKMS() {
	//	Chrome version 114    that version can work
	    driver = new ChromeDriver();
	    
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://kmslh.com/");
		KMS objLogin = new KMS(driver);
		
        objLogin.clickBurgerMuenu();
		objLogin.checkLogoMobile();
		objLogin.checkRequestDemo();
		objLogin.checkAccessibiltyButton();
		objLogin.checkContactUSButton();
		objLogin.return_drv();
		

	}
	@Test(priority = 1)

	public void test_Productions() {
		driver = new ChromeDriver();
	    driver.get("https://kmslh.com/");
		KMS objLogin = new KMS(driver);
		
		objLogin.clickBurgerMuenu();
		objLogin.clickProducts();
		objLogin.checkLogo();
		objLogin.checkRequestDemo();
		objLogin.checkAccessibiltyButton();
		objLogin.checkContactUSButton();
		objLogin.return_drv();
		

	}
	@Test(priority = 2)

	public void test_Industries() {
	
		driver = new ChromeDriver();
	
	    driver.get("https://kmslh.com/");
		KMS objLogin = new KMS(driver);
		
        
		objLogin.clickBurgerMuenu();
		objLogin.clickIndustries();
		objLogin.checkLogo();
		objLogin.checkRequestDemo();
		objLogin.checkAccessibiltyButton();
		objLogin.checkContactUSButton();
		objLogin.return_drv();
		

	}
	
	@Test(priority = 3)

	public void test_CaseStudies() {
		driver = new ChromeDriver();
	
	    driver.get("https://kmslh.com/");
		KMS objLogin = new KMS(driver);
		
        
		objLogin.clickBurgerMuenu();
		objLogin.clickCaseStudies();
		objLogin.checkLogo();
		objLogin.checkRequestDemo();
		objLogin.checkAccessibiltyButton();
		objLogin.checkContactUSButton();
		objLogin.return_drv();
		

	}
	
	@Test(priority = 4)

	public void test_Resources() {
	//	WebDriverManager.edgedriver().setup();
		driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://kmslh.com/");
		KMS objLogin = new KMS(driver);
		
        
		objLogin.clickBurgerMuenu();
		objLogin.clickResources();
		objLogin.checkLogo();
		objLogin.checkRequestDemo();
		objLogin.checkAccessibiltyButton();
		objLogin.checkContactUSButton();
		objLogin.return_drv();
		

	}
	
	@Test(priority = 5)

	public void test_About() {
		driver = new ChromeDriver();
	
	    driver.get("https://kmslh.com/");
		KMS objLogin = new KMS(driver);
		
	
		objLogin.clickBurgerMuenu();
		objLogin.clickAbout();
		objLogin.checkLogo();
		objLogin.checkRequestDemo();
		objLogin.checkAccessibiltyButton();
		objLogin.checkContactUSButton();
		objLogin.return_drv();
		

	}

	

	@AfterMethod
	public void afterTest() {

		// close and quit the browser
		 driver.quit();
	}
}

