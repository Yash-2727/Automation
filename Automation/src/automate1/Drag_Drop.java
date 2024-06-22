package automate1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base_class1.Base_class1;

public class Drag_Drop extends Base_class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Launch("chrome");
    launch_url("https://jqueryui.com/droppable/");
   WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
    driver.switchTo().frame(frame);
 WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
 
 WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
 Actions act1= new Actions(driver);
 act1.dragAndDrop(drag, drop).build().perform(); 

	}

}
