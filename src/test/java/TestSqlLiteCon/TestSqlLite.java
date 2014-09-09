package TestSqlLiteCon;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MavenTest.libs.DBOCon;

public class TestSqlLite {
	private DBOCon dbc;
	
	@BeforeClass
	public void intial(){
		dbc = new DBOCon("Mail126Page");
		dbc.con();
	}
	
  @Test
  public void testSqlLite() {
	  
	  System.out.println(dbc.getCSSvalue("UserName"));
	  System.out.println(dbc.getXpathValue("UserName"));
  }
  
  @AfterClass
  public void quit(){
	  dbc.conquit();
  }
}
