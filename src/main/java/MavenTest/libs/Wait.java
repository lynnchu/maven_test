package MavenTest.libs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public WebDriver driver;
	
	public Wait(WebDriver dr){
		this.driver= dr;
	}
	
	public void waitForElementPresent(String locator){
		WebDriverWait waiter = new WebDriverWait(driver, 10);
		waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
	}
	
	public void waitForElementClickable(String locator){
		WebDriverWait waiter = new WebDriverWait(driver, 10);
		waiter.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));	
	}
	public void waitFortime(long timeout){
		WebDriverWait waiter = new WebDriverWait(driver, 10);
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
