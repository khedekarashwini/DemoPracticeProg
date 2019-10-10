package com.demo.practice;
import java.sql.*;
public class DemoInsertJdbc {
	static final String jdbc_Driver="com.mysql.jdbc.Driver";
	static final String url="jdbc:mysql//localhost/emp";
	static final String user="root";
	static final String pass="root";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection conn=null;
Statement stmt=null;
try { 
	Class.forName("com.sql.jdbc.Driver");
	conn=DriverManager.getConnection(url,user,pass);
	stmt=conn.createStatement();
	String sql="INSERT INTO EMPLOYEE" + "VALUES(104,'SNEHAL',34,60000.0)";
	stmt.executeUpdate(sql);
	sql="INSERT INTO EMPLOYEE" + "VALUES(105,'SHEETAL',24,50000.0)";
	stmt.executeUpdate(sql);
	
} catch (SQLException se) {
se.printStackTrace();
}catch(Exception e)
{
	e.printStackTrace();
}finally
{
   try {
	  if(stmt!=null)
		  conn.close();
   }catch(SQLException se)
   {}
   try {
	   if(conn!=null)
		   conn.close();
   }catch(SQLException se)
   {}
}
	System.out.println("bye");
	}

}
