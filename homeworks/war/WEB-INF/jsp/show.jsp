<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Show page</title>
</head>
<body>

	<b>Task3.2</b><br>
	<c:if test="${x1 ne null}">
		<c:if test="${x2 ne null}">
			<b>Корни квадратного уравнения:</b><br>
			X1 = ${x1},<br>
			X2 = ${x2}.<br>
		</c:if>
	</c:if>
	<c:if test="${norootsmessage ne null}">
		<b>${norootsmessage}!</b><br>
	</c:if>
	
	<br>
	
	<b>Task3.3</b><br>
	<table>
		<c:forEach items="${arr}" var="arri" varStatus="varStatus">
			<tr>
			<c:forEach items="${arri}" var="elem" varStatus="varStatus1">
				<td>${elem}<span style="color:#bbb">[${varStatus.index}][${varStatus1.index}]</span></td>
			</c:forEach>
			</tr>
		</c:forEach>
	</table>
	
	<br>
	
	<b>Task3.4</b><br>
	<table>
		<c:forEach items="${arr2}" var="arr2i" varStatus="varStatus2">
			<tr>
			<c:forEach items="${arr2i}" var="elem2" varStatus="varStatus3">
				<td>${elem2}<span style="color:#bbb">[${varStatus2.index}][${varStatus3.index}]</span></td>
			</c:forEach>
			</tr>
		</c:forEach>
	</table>
	<b>Максимальное число во втором массиве: ${max}</b>


</body>
</html>