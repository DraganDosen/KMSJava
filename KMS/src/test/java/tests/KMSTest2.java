package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

//import Pages.BlazeHomePage;
import Pages.KMS;

public class KMSTest2 {
	WebDriver driver;
	// BlazeHomePage objHomePage;

	@BeforeTest
	public void setup() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();

	}

	@Test(priority = 0)

	public void testKMS() {
		// WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://kmslh.com/");
		KMS obj = new KMS(driver);
		driver.manage().window().maximize();

		//objLogin.clickCallCenter();
		//objLogin.clickCallCenter();
		obj.checkLogo();
		obj.checkRequestDemo();
		//objLogin.checkAccessibiltyButton();
		obj.checkContactUSButton();
		assertEquals(obj.clickGetStarted(),true);
		obj.checkLogo();
		//objLogin.checkMainMenu();
		obj.return_drv();

	}

	@Test(priority = 1)

	public void test_Productions() {
		// WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://kmslh.com/");
		KMS obj = new KMS(driver);

		obj.clickBurgerMuenu();
		obj.clickProducts();
		obj.checkLogo();
		obj.checkRequestDemo();
		obj.checkAccessibiltyButton();
		obj.checkContactUSButton();
		obj.return_drv();

	}

	@Test(priority = 2)

	public void test_Industries() {
		// WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
		// WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
		// WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
		// WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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

