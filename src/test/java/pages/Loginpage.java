package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utlityclass.resuabeleclass;



public class Loginpage {
	
   WebDriver driver;
	resuabeleclass re;
	
	
    @FindBy(xpath = "//input[@name='q' and @type='text']")
    WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchbutton;

    @FindBy(css = "button._2KpZ6l._2doB4z")
    WebElement closeLoginPopup;

    public Loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    
    public void login() {
    	
    }

}
