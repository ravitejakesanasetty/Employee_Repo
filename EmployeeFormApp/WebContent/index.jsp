<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
import="java.io.File,java.util.*,java.sql.*"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EmployeeFrom</title>
<style>
  body{
            font-family: "Comic Sans MS",sans-serif;
           
            background-color:lightblue;
        }
        h1{
            font-family: "Old English Text MT",sans-serif;
            text-align: center;
           
        }
          table{
          margin:auto;
          }
        td{
     
            font-size: 18px;
            padding: 5px;
        }
      
      
</style>
</head>
<body>
<form action="Resource1" method="post">
<h1>Employee Form </h1>
<table >
   <tr>
       <td>EmployeeID::</td>
        <td><input type="text" name="eid"></td>
   </tr>
   <tr>
      <td>EmployeeName::</td>
      <td><input type="text" name="ename"></td>
   </tr>
   <tr>
       <td>Age::</td>
       <td><input type="text" name="eage"></td>
   </tr>
   <tr> 
        <td>PhoneNumber::</td>
        <td><input type="text" name="ephoneno"></td>
   </tr>
   <tr>
       <td  align="center">
       <input type="submit" name="action"  value="register" class="button"> </td>
        <td>  <input type="submit" name="action"  value="delete" class="button"> </td>
  </tr>
</table>

<h1>List of All Records</h1>

<%
   Class.forName("oracle.jdbc.driver.OracleDriver");
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
  PreparedStatement ps=con.prepareStatement("SELECT * FROM EMPLOYEES");
 ResultSet	rs=ps.executeQuery();
%> 
<table border='1' id="tab">
<tr><th>EmployeeID</th><th>EmployeeName</th><th>Age</th><th>Phone Number</th></tr>
	        <% 	while(rs.next()) {%>
	        		<tr>
	        		<td><%=rs.getInt(1)%></td>
	        		<td><%=rs.getString(2)%></td>
	        		<td><%=rs.getInt(3)%></td>
	        		<td><%=rs.getInt(4)%></td>
	        		</tr>
	       
	        <% }%>	
	       
</table>

</form>
</body>
</html>