package MavenTest.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import MavenTest.libs.Browser;
import MavenTest.libs.BrowserType;
import MavenTest.libs.ParaseProperties;
import MavenTest.libs.find;

public class TestCase_Loginbaidu {
	
	private WebDriver driver;
	private Browser browser;
	private ParaseProperties pros;
	
  @Test
  public void TestLoginBaidu() {
	  driver.get(pros.getKey("baiduUrl"));
  }
  @BeforeClass
  public void beforeClass() {
	  browser = new Browser(BrowserType.chrome);
	  driver = browser.webdriver;

	  pros = new ParaseProperties(System.getProperty("user.dir")+"\\Tools\\dataInput.properties");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
