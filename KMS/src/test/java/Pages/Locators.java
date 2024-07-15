package Pages;
import org.openqa.selenium.By;
public class Locators {
	
	  By logoMobile = By.id("logo-mobile");
	  
	  By logo = By.id("logo");
	  By logo_image = By.xpath("/html/body/div[1]/div/div/div[1]");
	  
	  By request_a_Demo = By.partialLinkText("Book a demo");
	    
	  By accessibility_button = By.id("acwp-toolbar-btn");
	  
	  By contact_us = By.partialLinkText("Contact");
	 
	  //By burger_menu = By.id("man-nav-toggler-mobile");
	  //*[@id="menu-toggle-584"]
	  By burger_menu = By.id("menu-toggle-584");
	  
	  By products = By.partialLinkText("Products");
	  
	  By industries = By.partialLinkText("Industries");
	  
	  By caseStudies = By.partialLinkText("Case Studies");
	  
	  By resources = By.partialLinkText("Resources");
	  
	  By about = By.partialLinkText("About");
	  
	  By call_center = By.id("dropdown-industries-selected");
	  By get_started = By.xpath("//*[@id=\"section_products\"]/div/div[1]/div[2]/button");
	  By main_menu = By.id("mainmenu");
	
	}
