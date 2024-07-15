package Pages;
import org.openqa.selenium.By;

import java.util.List;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
public class Base {
	
	protected WebDriver driver;
	private WebDriverWait wait;
    Locators locatorObj = new Locators();
    public Base(WebDriver driver){

    	if (driver != null) {
			this.driver = driver;
			wait = new WebDriverWait(driver, 40);
		}
       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    public void checkLogo(){
    	
       // wait.until(ExpectedConditions.visibilityOfElementLocated(locatorObj.logo));
       // logo_image
        wait.until(ExpectedConditions.visibilityOfElementLocated(locatorObj.logo_image));
    	
        }
    public void checkRequestDemo(){
    	
        wait.until(ExpectedConditions.visibilityOfElementLocated(locatorObj.request_a_Demo));
    	
        }
    public void checkAccessibiltyButton(){
    	
    	
        wait.until(ExpectedConditions.visibilityOfElementLocated(locatorObj.accessibility_button));
    	
        }
    public void checkContactUSButton(){
    	
    	
        wait.until(ExpectedConditions.visibilityOfElementLocated(locatorObj.contact_us));
    	
        }
    public void clickBurgerMuenu(){
    	
    	
        wait.until(ExpectedConditions.visibilityOfElementLocated(locatorObj.burger_menu));
        wait.until(ExpectedConditions.elementToBeClickable(locatorObj.burger_menu)).click();
    	
        }
    public void checkLogoMobile(){
    	
    	
        wait.until(ExpectedConditions.visibilityOfElementLocated(locatorObj.logoMobile));
    	
        }
   

}
