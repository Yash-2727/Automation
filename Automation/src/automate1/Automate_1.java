package automate1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base_class1.Base_class1;

public class Automate_1 extends Base_class1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    Launch("chrome");
    launch_url("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=Cj0KCQjwpZWzBhC0ARIsACvjWRN-E3WVlGaqn8B60hAPCgA_QJFUWeC1Y7YbFqyVC36WjKCEhkMr484aAsTJEALw_wcB");
    //Screenshot("FLIPKART");
   // JavascriptExecutor js =  (JavascriptExecutor) driver;
 //   js.executeScript("window.scrollBy(0,400)");
     Actions act= new Actions(driver);
     WebElement Link_1 = driver.findElement(By.xpath("(//a[@id='mem_login'])[1]"));
     act.click(Link_1).build().perform();
    // js.executeScript("window.history.back()");
  //   Thread.sleep(2000);
     //right-click
//WebElement Right_clcik = driver.findElement(By.xpath("//input[@id='submit_pg1']"));
     //act.moveToElement(Right_clcik).contextClick().build().perform();
     //mouse hower
 WebElement mouse_hower = driver.findElement(By.linkText("BROWSE PROFILES BY"));
    act.moveToElement(mouse_hower).build().perform();
    
	}
}
