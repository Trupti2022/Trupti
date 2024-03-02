<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*,java.sql.*,javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<sql:setDataSource var="db" driver="oracle.jdbc.driver.OracleDriver"
						 url="jdbc:oracle:thin:@localhost:1521:XE"
    					user="system" password="1234"/>
    					
   <sql:query dataSource="${db}" var="x">
   select * from maremps123
   </sql:query>
   
   <table border=2 width=100%>
   <tr><td>Name</td><td>Address</td><td>EMAIL</td><td>PhoneNo</td><td>DOJ</td><td>PROJECT</td>	</tr>	
   <tr>
   <c:forEach var="table" items="${x.rows}">
   <td><c:out value="${table.name }"/></td>
   <td><c:out value="${table.address }"/></td>
   <td><c:out value="${table.email }"/></td>
   <td><c:out value="${table.phoneno }"/></td>
   <td><c:out value="${table.doj }"/></td>
   <td><c:out value="${table.projname }"/></td>
   </tr>
      </c:forEach>
   </table>