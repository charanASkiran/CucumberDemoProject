package SeleniumFirstPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class first {
  @Test
  public void launchChrome() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Charan\\Downloads\\cc\\chromedriver.exe");
	 WebDriver dr=new ChromeDriver();
	  dr.get("https://www.google.com/");
	  dr.manage().window().maximize();
	  
  }
}
