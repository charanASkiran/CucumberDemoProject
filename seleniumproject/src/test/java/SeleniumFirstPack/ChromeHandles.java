package SeleniumFirstPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ChromeHandles {
  @Test
  public static  class Drivers {
	    
	    public static WebDriver getDriver(String browser) {
	        
	        if(browser.equals("chrome"))
	        {
	            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Charan\\Downloads\\cc\\chromedriver.exe");
	            return new ChromeDriver();
	        }
	        else if (browser.equals("ie")) {
	            System.setProperty("webdriver.ie.driver", "C:\\Users\\Charan\\Downloads\\cc\\chromedriver.exe");
	            return new InternetExplorerDriver();    
	        }
	        return null;
  }
}
}
  