package MavenTest.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import MavenTest.libs.elementLoc;
import MavenTest.libs.find;


public class RegisterPage {
	
	private WebDriver driver;
	private find fd;
	
	public RegisterPage(WebDriver dr){
		this.driver = dr;
		fd = new find(driver);
	}
	
	public void Goto(String Url){
		driver.get(Url);
	}
	
	public RegisterPage setAccountname(String accountName){
		 fd.what(elementLoc.accountPath).sendKeys(accountName);
		 return this;
	}
	
 public RegisterPage setPasswords(String password){
	 for (WebElement element : fd.whats(elementLoc.PassWords)) {
		element.sendKeys(password);
	}
	 return this;
 }
	
 	public void submit(){
 		fd.what(elementLoc.submitButton).click();
 	}
	
	public WebElement RegisterSuccess(String accountname){
		return fd.what(String.format(elementLoc.regsuc,accountname));
	}
}
