package autoItTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MavenTest.libs.Browser;
import MavenTest.libs.BrowserType;
import MavenTest.libs.Switch;
import MavenTest.libs.Wait;
import MavenTest.libs.find;

public class baiduMusicDownload {
	private find fd;
	private Wait waiter;
	private Switch sw;
	private WebDriver driver;
	private Browser bw ;
	
	
  @BeforeClass
  public void intial(){
	  bw = new Browser(BrowserType.firefox);
	  driver = bw.webdriver;
	  fd = new find(driver);
	  waiter = new Wait(driver);
	  sw = new Switch(driver);
	  
  }

	
  @Test
  public void BaiduMusicTest() {
	  driver.get("http://www.baidu.com");
	  fd.what("//p[@id='nv']/a[contains(@href,'music')]").click();
	  fd.what("//p[@class='clearfix']/a[contains(text(),'经典老歌')]").click();
	  fd.what("//li[@id='first_song_li']//a[@data-action='download']").click();
	  
	  
	  
  }
  
  @AfterClass
  public void quit(){
	  driver.quit();
  }
}
