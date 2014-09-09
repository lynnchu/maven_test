package MavenTest.TestModule1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import MavenTest.libs.Browser;
import MavenTest.libs.BrowserType;

public class TestLogin {
	private WebDriver driver;
	private Browser browser;
	
	
  @Test
  public void testLoginJD() {
	  browser = new Browser(BrowserType.chrome);
	  this.driver=browser.webdriver;
	  driver.get("http://www.jd.com");
	  driver.quit();
  }
  
  @Test
  public void testLoginYX() {
	  browser = new Browser(BrowserType.chrome);
	  this.driver=browser.webdriver;
	  driver.get("http://www.51buy.com");
	  driver.quit();
  }
  
  
}
