package MavenTest.libs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class DBOCon {
	public String tablename;
	public Statement stmt;
	public ResultSet rs;
	public Connection con ;
	
	public DBOCon(String tablename){
		this.tablename = tablename;
	}
	
	public void con(){
	try{
		Class.forName("org.sqlite.JDBC");
		con = DriverManager.getConnection("jdbc:sqlite:"+System.getProperty("user.dir")+"\\Tools\\mylocator.sqlite");
		stmt = con.createStatement();
	}
	catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	catch(SQLException e){
		e.printStackTrace();
	}		
	}
	
	public String getXpathValue(String locatorname){
		String XPath = null;
		try{
		rs = stmt.executeQuery("select * from "+tablename+" where WebElementName= '"+locatorname+"';");
		if(rs.next()){
			XPath = rs.getString("Xpath");
		}
		rs.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return XPath;

	}



	public String getCSSvalue(String locatorname){
		String Css = null;
		try{
			rs = stmt.executeQuery("select * from "+tablename+" where WebElementName= '"+locatorname+"';");
			if(rs.next()){
				Css = rs.getString("Css");
			}
			rs.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return Css;

	}
	
	public void conquit(){
		try{
			if(con!=null){
			con.close();
			}
			if(stmt!=null){
			stmt.close();
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
}
	
	