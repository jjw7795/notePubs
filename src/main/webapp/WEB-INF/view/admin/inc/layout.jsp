<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="css"><tiles:getAsString name="css" /></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/css/admin/inc/layout.css" type="text/css" rel="stylesheet" >
<link href="/css/admin/${css}" type="text/css" rel="stylesheet" >
</head>
<body id="view">
	<tiles:insertAttribute name="header" />
	
	<div id="body">

	<tiles:insertAttribute name="aside" />
	<tiles:insertAttribute name="main" />
	
    </div>
	
	<tiles:insertAttribute name="footer" />
</body>
</html>