package MavenTest.libs;

public interface elementLoc {
	
	//------register JD--------
	String accountPath = "//input[@id='regName']";
	String PassWords = "//input[@id='pwd']|//input[@id='pwdRepeat']";
	String submitButton = "//input[@id='registsubmit']";	
	
	String regsuc = "//div[contains(text(),'%1$s ��ע��ɹ�')]";
	
	
	//----------------Login mail.163.com----
	
	String usernamePath= "//input[@id='idInput']";
	String passwordPath = "//input[@id='pwdInput']";
	String submitButtonpath= "//button[@id='loginBtn']";
	String exitPath = "//a[contains(text(),'退出')]";


}
