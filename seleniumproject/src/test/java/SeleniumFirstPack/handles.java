package SeleniumFirstPack;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.service.DriverService;
import org.testng.annotations.Test;

public class handles {
 

@Test

	
	    public void f() throws InterruptedException {
	        
	        WebDriver dr = 
	        
	        dr.get("https://myaccount.google.com/");
	        
	        String parent_win_handle = dr.getWindowHandle();
	        
	        System.out.println("the window handle id is "+parent_win_handle);
	        
	        dr.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
	        
	        Set<String> handles = dr.getWindowHandles();
	        
	        for(String win : handles) {
	            System.out.println("window handle"+win);
	            dr.switchTo().window(parent_win_handle);
	            
	            
	        }
	      
	        dr.get("http://demowebshop.tricentis.com");
	        
  }
}
