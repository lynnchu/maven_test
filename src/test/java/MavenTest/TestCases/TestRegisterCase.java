package MavenTest.TestCases;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import MavenTest.libs.Browser;
import MavenTest.libs.BrowserType;
import MavenTest.pageobject.RegisterPage;

public class TestRegisterCase {
	private WebDriver driver;
	private RegisterPage Rp;
	String Url;
@BeforeClass
  public void intial() {
		  Browser bw = new Browser(BrowserType.chrome);
		  this.driver = bw.webdriver;
		  Rp = new RegisterPage(driver);
		  Url = "https://reg.jd.com/reg/person";
  }

	
  @Test
  public void TestRegister() {
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	  Calendar cl = Calendar.getInstance();
	  String accountName = sdf.format(cl.getTime()); 
	  
	  Rp.Goto(Url);
	  Rp.setAccountname("test"+accountName).setPasswords("test111111").submit();
	 // System.out.println(Rp.RegisterSuccess("test"+accountName).isDisplayed());
	  Assert.assertEquals(Rp.RegisterSuccess("test"+accountName).isDisplayed(), true);
  }



  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
