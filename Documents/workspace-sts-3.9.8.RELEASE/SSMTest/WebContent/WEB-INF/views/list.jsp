<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.js"></script>
</head>
<body>
<center>
	<table>
		<td>
			<tr>编号</tr>
			<tr>姓名</tr>
			<tr>性别</tr>
			<tr>部门</tr>
			<tr><a href="">更新</a></tr>
			<tr><a href="">删除</a></tr>
		</td>
<c:forEach items="${empList }" var="emp">
		<td>
			<tr>${emp.employId }</tr>
			<tr>${emp.employName }</tr>
			<tr>${emp.employGender }</tr>
			<tr>${emp.dept.deptName}</tr>
			<tr><a href="">更新</a></tr>
			<tr><a href="">删除</a></tr>
		</td>
</c:forEach>
	</table>
</center>
</body>
</html>