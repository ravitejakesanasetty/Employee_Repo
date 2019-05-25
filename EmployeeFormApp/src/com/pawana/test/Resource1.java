package com.pawana.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.bean.EmployeeBean;
import com.employee.dao.EmployeeDao;
import com.employee.daoimpl.EmployeeDaoImpl;

public class Resource1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Resource1() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in resource1");
		 PrintWriter pw=response.getWriter();
         response.setContentType("text/html");
        
		
		int Eid=Integer.parseInt(request.getParameter("eid"));
		String Ename=request.getParameter("ename");
		int  age=Integer.parseInt(request.getParameter("eage"));
		int phoneNumber=Integer.parseInt(request.getParameter("ephoneno"));
		EmployeeBean bean = new EmployeeBean();
		bean.setEid(Eid);
		bean.setEname(Ename);
		bean.setAge(age);
		bean.setPhoneNumber(phoneNumber);
		String operation=request.getParameter("action");
		EmployeeDao employeeDao= new EmployeeDaoImpl();
		
		
		
		if(operation.equals("register"))
		{	
		if(employeeDao.insert(bean) != 0) {
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.include(request, response);
	   }
		else {
			RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
	  }
		else {
		    if(employeeDao.delete(bean)!=0) {
		    	RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
				rd.include(request, response);
			   }
				else {
					RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
					rd.forward(request, response);
				}
	     }
		}
}
