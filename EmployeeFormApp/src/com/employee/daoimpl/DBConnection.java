package com.employee.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
  public static Connection createConnection() {
	  Connection con=null;
	  String url="jdbc:oracle:thin:@localhost:1521:XE";
	  String username="system";
	  String password="manager";
	  try {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  con=DriverManager.getConnection(url, username, password);
	  }catch(ClassNotFoundException e) {
		  e.printStackTrace();
	  }catch(SQLException e) {
		  e.printStackTrace();
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  
	  return con;
  }
}
