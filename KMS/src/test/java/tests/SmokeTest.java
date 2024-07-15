package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;

//import Pages.BlazeHomePage;
import Pages.KMS;

public class SmokeTest {
	WebDriver driver;
	// BlazeHomePage objHomePage;

	@BeforeTest
	public void setup() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();

	}

	@Test(priority = 0)

	public void smoke() {
		// WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://kmslh.com/");
		driver.manage().window().maximize();
		KMS objLogin = new KMS(driver);

		objLogin.checkLogo();
		objLogin.return_drv();

	}

	@AfterMethod
	public void afterTest() {

		// close and quit the browser
		driver.quit();
	}

}
