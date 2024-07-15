package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Pages.KMS;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;

public class Extendreports {
	WebDriver driver;
	// BlazeHomePage objHomePage;
	ExtentReports extent;
	@BeforeTest
	
	public void config() {
		//ExtentReports
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("KMS Automation Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA", "Dragan");
	}
	@Test(priority = 0)

	public void testKMS() {
		WebDriverManager.edgedriver().setup();
		// WebDriverManager.edgedriver().setup();
		extent.createTest("Test KMS");
		driver = new EdgeDriver();

		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://kmslh.com/");
		KMS objLogin = new KMS(driver);

		objLogin.clickBurgerMuenu();
		objLogin.checkLogoMobile();
		objLogin.checkRequestDemo();
		objLogin.checkAccessibiltyButton();
		objLogin.checkContactUSButton();
		objLogin.return_drv();
		extent.flush();

	}
	@Test(priority = 0)

	public void testKMSOne() {
		WebDriverManager.edgedriver().setup();
		// WebDriverManager.edgedriver().setup();
		extent.createTest("Test KMSOne");
		driver = new EdgeDriver();

		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://kmslh.com/");
		KMS objLogin = new KMS(driver);

		objLogin.clickBurgerMuenu();
		objLogin.checkLogoMobile();
		objLogin.checkRequestDemo();
		objLogin.checkAccessibiltyButton();
		objLogin.checkContactUSButton();
		objLogin.return_drv();
		extent.flush();

	}
	@AfterMethod
	public void afterTest() {

		// close and quit the browser
		driver.quit();
	}

}
