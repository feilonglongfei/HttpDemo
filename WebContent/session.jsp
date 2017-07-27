<%@page import="java.io.FileOutputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>session jsp</title>
<script type="text/javascript">
	//alert(document.cookie);
</script>
<%
	//session.setAttribute("user", "userNameChanged");
%>
</head>
<body>

	<!-- <button id="sessionAlert" onclick="sessionAlert()"> alert session info </button><br> -->
	localAddr:  <input id="location" value=<%=request.getLocalAddr() %> style="width: 500px;"><br>
	userName:   <input id="username" value=<%=request.getParameter("name") %> style="width: 500px;"><br>
	selectedID: <input id="selectedID" value=<%=request.getParameter("selectedID") %> style="width: 500px;"><br>
	hidden1:    <input id="hidden1" value=${param.hidden1 } style="width: 500px;"><br>
	attr1:      <input id="attr1" value=${requestScope.attr1} style="width: 500px;"><br>
	attr2:      <input id="attr2" value=<%=request.getAttribute("attr2") %> style="width: 500px;"><br>
	getCookies: <input id="getCookies" value=<%=request.getCookies()[0].getValue() %> style="width: 500px;"><br>
	request.getMethod: <input id="getCookies" value=<%=request.getMethod() %> style="width: 500px;"><br>
	response.getStatus: <input id="getCookies" value=<%=response.getStatus() %> style="width: 500px;"><br>
	session.getAttribute("user"): <input id="getCookies" value=<%=session.getAttribute("user") %> style="width: 500px;"><br>
</body>
</html>