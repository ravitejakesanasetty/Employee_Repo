package com.employee.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.employee.bean.EmployeeBean;
import com.employee.dao.EmployeeDao;

public class EmployeeDaoImpl implements  EmployeeDao {
 
	private static final String INSERT_QUERY="INSERT INTO EMPLOYEES VALUES(?,?,?,?)";
	private static final String DELETE_QUERY="delete from employees where eid=?";
	 Connection con=null;
	 Statement st=null;
     PreparedStatement ps=null;
     int i=0;
     ResultSet rs=null;
     String res=null;
    
	 public int insert(EmployeeBean bean) {	 
		  int Eid = bean.getEid();
	      String Ename=bean.getEname();
	      int Age=bean.getAge();
	      int PhoneNumber=bean.getPhoneNumber();
	     
	      try {
	    	  con=DBConnection.createConnection();
	    	  ps=con.prepareStatement(INSERT_QUERY);
	    	  ps.setInt(1,Eid);
	    	  ps.setString(2,Ename);
	    	  ps.setInt(3,Age);
	    	  ps.setInt(4,PhoneNumber);
	        
	    	  i=ps.executeUpdate();
	      }catch(SQLException e) {
	    	  e.printStackTrace();
	      }
	  		return i;
	  	 
	 }
	public int delete(EmployeeBean bean) {
		 int eid = bean.getEid();
	      String ename=bean.getEname();
	      int age=bean.getAge();
	      int phoneNumber=bean.getPhoneNumber();
	     
	        try {
	        	con=DBConnection.createConnection();
	        	
	        	 ps=con.prepareStatement(DELETE_QUERY);
	        	 ps.setInt(1,eid);
		    	
		    	  i=ps.executeUpdate();
		  
	        }catch(SQLException se) {
	        	se.printStackTrace();
	        }
	      System.out.println(rs);
	      
		return i;
	}
}
