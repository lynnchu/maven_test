package autoItTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import MavenTest.libs.Browser;
import MavenTest.libs.BrowserType;
import MavenTest.libs.Switch;
import MavenTest.libs.Wait;
import MavenTest.libs.find;

public class AlipayTest {
	private find fd;
	private Wait waiter;
	private Switch sw;
	private WebDriver driver;
	private Browser bw ;
	
  @BeforeClass
	public void intial() {
	    bw = new Browser(BrowserType.firefox);
	    driver = bw.webdriver;
	    fd = new find(driver);
	    waiter = new Wait(driver);
		sw = new Switch(driver);
	  }
  @Test
  public void TestAlipay() {
	  String password = "test111111";
	  int Flag;
	  driver.get("https://www.alipay.com/");
	  driver.switchTo().frame("loginIframe");
	  fd.what("//input[@id='J-input-user']").sendKeys("zwg19821216@163.com");
	 
	  Flag = this.runexe(password);
	  if(Flag==1)
	  fd.what("//input[@id='J-login-btn']").click();
	  waiter.waitFortime(5000);
  }
  
  public int runexe(String password){
	  int flag = 0;
	  try{
		  Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\Tools\\password.exe"+" " +password);
		  flag =1;
	  }
	  catch(IOException e){
		  e.printStackTrace();
	  }
	  
	  return flag;
  }
  


  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
