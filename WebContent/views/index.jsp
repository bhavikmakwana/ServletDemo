<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="/js/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/angular/angular.min.js"></script>
 <link rel="stylesheet" href="/css/bootstrap/bootstrap.min.css">
<title>Home</title>
</head>
<body ng-controller="myController">
<h1>This is welcome file </h1>
<form action="./welcome">
	<label>Name : </label>
	<input type="text" name="name" id="name" ng-init="Bhavik" ng-model="name">
</form>
</body>
</html>