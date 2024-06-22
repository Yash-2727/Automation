package base_class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
public class Base_class1 {
    	public static	WebDriver driver;
       public static  String Path=System.getProperty("user.dir");
    	public static void Launch(String browser){
    		
    		if(browser.equalsIgnoreCase("chrome")) {
    			driver= new ChromeDriver();
    			driver.manage().window().maximize();
    			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    			
    		}
    		else if(browser.equalsIgnoreCase("edge")) {
    			driver= new EdgeDriver();    		}
    		
    		driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
    		
    	}
    	
    	
    	
	public static void launch_url (String Url){
    driver.get(Url);		
		}
    public static void Screenshot(String ScreenName) throws Exception {
    	TakesScreenshot ts = (TakesScreenshot) driver;
   File file = ts.getScreenshotAs(OutputType.FILE);
    	File source_file = new File(Path +"\\Screenshot1\\"+ScreenName+".png");
    	FileHandler.copy(file, source_file);
    }
}
