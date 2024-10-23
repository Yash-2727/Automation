package pageObjects_001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_001 {
	
	@FindBy (xpath="//input[@name='uid']") WebElement login;
   @FindBy (xpath="//input[@name='password']") WebElement Pass;
   @FindBy (xpath= "//input[@name='btnLogin']") WebElement Button;
   @FindBy (xpath="(//a[@class='dropdown-toggle'])[2]")WebElement drop;
   @FindBy (linkText = "Bank Project V1") WebElement bank;
	public  LoginPage_001( WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void Login() {
		drop.click();
		bank.click();
		login.sendKeys("mngr595116");  
		Pass.sendKeys("EdYsYqy");
		Button.click();
		
	}
	
	
	
}
