package com.pawana.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.bean.EmployeeBean;
import com.employee.dao.EmployeeDao;
import com.employee.daoimpl.DBConnection;
import com.employee.daoimpl.EmployeeDaoImpl;

public class Resource2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Resource2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            System.out.println("in resource 2");
            
      /*  	 String SELECT_QUERY="SELECT * FROM EMPLOYEES";
        	 Connection con=null;
             PreparedStatement ps=null;
             int i=0;
             ResultSet rs=null;
             String res=null;
            
            PrintWriter pw=response.getWriter();
            response.setContentType("text/html");
            
       try {
	        	con=DBConnection.createConnection();
	        	ps=con.prepareStatement(SELECT_QUERY);
	        	rs=ps.executeQuery();
	        	  pw.println("<table border='1'><tr><th>EmployeeID</th><th>EmployeeName</th><th>Age</th><th>Phone Number</th></tr>");
	        	while(rs.next()) {
	        		 pw.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td><td>"+rs.getInt(4)+"</td></tr>");
	       
	        	}qq
	        	
            }catch(SQLException e) {
            	e.printStackTrace();
            }*/
}
}