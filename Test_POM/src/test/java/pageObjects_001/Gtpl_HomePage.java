package pageObjects_001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testData_001.BaseClass_001;

public class Gtpl_HomePage extends BaseClass_001{
	
	@FindBy (linkText = "New Customer") WebElement NewCustomer;
	@FindBy (xpath= "(//input[@type='text'])[1]") WebElement Name;
	@FindBy (xpath="(//input[@type='radio'])[1]") WebElement Gen;
	@FindBy(id = "dob") WebElement DOB;
	
	
	
	public Gtpl_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void Home_Objects() {
		NewCustomer.click();
		Name.sendKeys("Ritesh Ambi");
		Gen.click();
		DOB.click();
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.NUMPAD1).build().perform();
		act.sendKeys(Keys.NUMPAD3).build().perform();
  act.release().build().perform();
         
	}
	
	
	
	
	
}
