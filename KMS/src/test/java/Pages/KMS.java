package Pages;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.Keys;
import org.testng.Reporter;


import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import java.time.Duration;



public class  KMS extends Base {
	//WebDriver driver;
    Locators locatorObj = new Locators();
    
    public KMS(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	    public void checkContactUSButton(){
	    	Reporter.log("Contact us");
	    	WebDriverWait wait1= new WebDriverWait(driver, 30);
	    	
            wait1.until(ExpectedConditions.visibilityOfElementLocated(locatorObj.contact_us));
	    	
            }
	    public void clickBurgerMuenu(){
	    	Reporter.log("Burger Menu");
	    	WebDriverWait wait1= new WebDriverWait(driver, 30);
	    	
            wait1.until(ExpectedConditions.visibilityOfElementLocated(locatorObj.burger_menu)).click();
	    	
            }
	    public void clickProducts(){
	    	Reporter.log("Products");
	    	WebDriverWait wait1= new WebDriverWait(driver, 30);
	    	
            wait1.until(ExpectedConditions.visibilityOfElementLocated(locatorObj.products)).click();
            driver.manage().window().maximize();
	    	
            }
	    public void clickIndustries(){
	    	Reporter.log("Industries");
	    	WebDriverWait wait1= new WebDriverWait(driver, 20);
	    	
            wait1.until(ExpectedConditions.visibilityOfElementLocated(locatorObj.industries)).click();
            driver.manage().window().maximize();
	    	
            }
	    public void clickCaseStudies(){
	    	Reporter.log("Case Studies");
	    	WebDriverWait wait1= new WebDriverWait(driver, 20);
	    	
            wait1.until(ExpectedConditions.visibilityOfElementLocated(locatorObj.caseStudies)).click();
            driver.manage().window().maximize();
	    	
            }
	    public void clickCallCenter(){
	    	Reporter.log("Case Studies");
	    	WebDriverWait wait1= new WebDriverWait(driver, 20);
	    	
            wait1.until(ExpectedConditions.visibilityOfElementLocated(locatorObj.call_center)).click();
           
	    	
            }
	   
	    
	    public boolean clickGetStarted(){
	    	Reporter.log("Case Studies");
	    	WebDriverWait wait1= new WebDriverWait(driver, 20);
	    	try {
            wait1.until(ExpectedConditions.visibilityOfElementLocated(locatorObj.get_started)).click();
            return true;
	    	} catch (Exception e) {
	    	return false;
	    	}
	    	
            }
	    public void checkMainMenu(){
	    	Reporter.log("Case Studies");
	    	WebDriverWait wait1= new WebDriverWait(driver, 20);
	    	
            wait1.until(ExpectedConditions.visibilityOfElementLocated(locatorObj.get_started)).click();
            
	    	
            }
	    
	    
	    public void clickResources(){
	    	Reporter.log("resources");
	    	WebDriverWait wait1= new WebDriverWait(driver, 20);
	    	
            wait1.until(ExpectedConditions.visibilityOfElementLocated(locatorObj.resources)).click();
            driver.manage().window().maximize();
	    	
            }
	    
	    public void clickAbout(){
	    	Reporter.log("about");
	    	WebDriverWait wait1= new WebDriverWait(driver, 20);
	    	
            wait1.until(ExpectedConditions.visibilityOfElementLocated(locatorObj.about)).click();
            driver.manage().window().maximize();
	    	
            }
	

	    //Set password in password textbox
	    public WebDriver return_drv() {
			return driver;
		}

	    
	    
	
	         
  }
	    

	    
	


