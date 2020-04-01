package SeleniumFirstPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class drivers {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Charan\\Downloads\\cc\\chromedriver.exe");
	  WebDriver dr = new ChromeDriver();
	  
	  dr.get("https://myaccount.google.com/");
	  Thread.sleep(3000);
	  String parent_win_handle = dr.getWindowHandle();
	  
	  System.out.println("the window handle id is:"+parent_win_handle);
	  
	  dr.findElement(arg0)
	  
	  
	  
	  
  }
}
