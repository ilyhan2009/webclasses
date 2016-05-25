<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="/favicon.png">

<title>Задания №3.2-3.4. Квадратное уравнение. Массивы</title>

<!-- Bootstrap core CSS -->
<link href="/css/bootstrap.min.css" rel="stylesheet">

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="../../assets/css/ie10-viewport-bug-workaround.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/css/sticky-footer-navbar.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="../../assets/js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<link rel="stylesheet" href="/css/myownstyle.css" type="text/css">
<link rel="stylesheet" href="/scrollup/scrollup.css" type="text/css">

<script src="/js/jquery-2.1.0.min.js"></script>
</head>

<body>


<!-- Fixed navbar -->
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/">Илья Пехов</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li><a href="/">Главная</a></li>
					<li><a href="/task0.html">Зад. 0</a></li>
					<li><a href="/task2.html">Зад. 2</a></li>
					<li><a href="/task3.html">Зад. 3.1</a></li>
					<li class="active"><a href="/task32.html">Зад. 3.2-3.4</a></li>
					<li><a href="/task6.html">Зад. 6</a></li>
					<li><a href="/task7servlet">Зад. 7</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- Begin page content -->
	<div class="container">
		
		<div class="page-header">
			<h1>Задания №3.2-3.4. Квадратное уравнение. Массивы</h1>
			<p class="lead">C помощью post-запроса на сервлет решаем уравнение. Работаем с массивами. Вывод на jsp</p>
		</div>
				
		
		<b>Задание №3.2</b><br>
		<c:if test="${x1 ne null}">
			<c:if test="${x2 ne null}">
				<b>Корни квадратного уравнения:</b><br>
				<div class="alert alert-success" role="alert">X1 = ${x1},	X2 = ${x2}</div>
			</c:if>
		</c:if>
		<c:if test="${norootsmessage ne null}">
			<div class="alert alert-danger" role="alert">${norootsmessage}</div>
		</c:if>
	
		<br>
	
		<b>Задание №3.3</b><br>
		<table class="table table-condensed">
			<c:forEach items="${arr}" var="arri" varStatus="varStatus">
				<tr>
				<c:forEach items="${arri}" var="elem" varStatus="varStatus1">
					<td>${elem}<span style="color:#bbb">[${varStatus.index}][${varStatus1.index}]</span></td>
				</c:forEach>
				</tr>
			</c:forEach>
		</table>
		
		<br>
		
		<b>Задание №3.4</b><br>
		<table class="table table-condensed">
			<c:forEach items="${arr2}" var="arr2i" varStatus="varStatus2">
				<tr>
				<c:forEach items="${arr2i}" var="elem2" varStatus="varStatus3">
					<td>${elem2}<span style="color:#bbb">[${varStatus2.index}][${varStatus3.index}]</span></td>
				</c:forEach>
				</tr>
			</c:forEach>
		</table>
		<div class="alert alert-info" role="alert">Максимальное число во втором массиве: ${max}</div>
	
	
		
		
		<p id="back-top">
			<a href=""><span></span>Наверх</a>
		</p>
	</div>
	<!-- content ends -->

	<footer class="footer">
		<div class="container">
			<p class="text-muted">Илья Пехов © 2016</p>
		</div>
	</footer>


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script type="text/javascript" src="/js/jquery-1.4.4.js"></script>
	<script type="text/javascript" src="/qb/js/qb.js"></script>
	<script type="text/javascript" src="/scrollup/scrollup.js"></script>
	<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	
	<script>
		window.jQuery
				|| document
						.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')
	</script>
	<script src="../js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>