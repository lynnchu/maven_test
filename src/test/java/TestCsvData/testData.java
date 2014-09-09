package TestCsvData;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TestCsv.getCsvData;

public class testData {
	private getCsvData getcsv;
	private String filepath = System.getProperty("user.dir")+"\\src\\test\\java\\TestCsvData\\data.csv";
	private String value;
	
@BeforeClass
public void intial(){
	getcsv = new getCsvData(filepath);
}
	
  @Test
  public void testdata() {
	  value = getcsv.getTestData("username","tc2");
	  System.out.println(value);
  }
}
