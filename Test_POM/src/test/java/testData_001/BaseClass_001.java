package testData_001;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseClass_001 {
	public WebDriver driver; 
	String path = System.getProperty("user.dir");
	public   void Setup1() {
	 driver = new ChromeDriver();
	 driver.get("https://demo.guru99.com/V4/");
	 driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 
	}
	public void Screenshot() throws Exception {
		TakesScreenshot Ts = (TakesScreenshot) driver;
		File t1=Ts.getScreenshotAs(OutputType.FILE);
		File T1 = new File(path+"\\Screenshot\\login.png"); 
		FileHandler.copy(t1, T1);
	}
	
	
}
