package MavenTest.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import MavenTest.libs.Browser;
import MavenTest.libs.BrowserType;
import MavenTest.libs.ParaseProperties;
import MavenTest.libs.Wait;
import MavenTest.libs.elementLoc;
import MavenTest.libs.find;

public class TestCase_Login163 {
	private WebDriver driver;
	private Browser browser;
	private ParaseProperties pros;
	private find fd;
	private Wait wait;
	
@BeforeClass
public void intial() {
	  	browser = new Browser(BrowserType.chrome);
		 this.driver = browser.webdriver;
		  pros = new ParaseProperties(System.getProperty("user.dir")+"\\Tools\\dataInput.properties");
		  fd = new find(driver);
		  wait = new Wait(driver);
}

  @Test
  public void testLogin163() {
	  driver.get(pros.getKey("url"));
	  fd.what(elementLoc.usernamePath).sendKeys(pros.getKey("username"));
	  fd.what(elementLoc.passwordPath).sendKeys(pros.getKey("password"));
	  fd.what(elementLoc.submitButtonpath).click();
	  
	  wait.waitForElementPresent(elementLoc.exitPath);
	  fd.what(elementLoc.exitPath).click();
	  
	  
  }


  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
