<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <c:set var="css" scope="page"><tiles:getAsString name="css" /></c:set>
<c:set var="js" scope="page"><tiles:getAsString name="js" /></c:set> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/css/inc/root-layout.css">
<%-- <c:if test="${not empty css}">
	<link rel="stylesheet" href="/css/${css}">
</c:if> --%>
<title>list page</title>
<script type="module" src="/js/inc/root-layout.js"></script>
<%-- <c:if test="${not empty js}">
	<script type="module" src="/js/${js}"></script>
</c:if> --%>
</head>
<body>
	<!-- --- header --------------------------------------------- -->
	<tiles:insertAttribute name="header" />
	<!-- --- body --------------------------------------------- -->
	<div class="body">
		<div class = "container">
			
	<!-- --- aside ---------------------------------------------------------------- -->
		<tiles:insertAttribute name="aside" />		
			
	<!-- --- main ---------------------------------------------------------------- -->
		<tiles:insertAttribute name="main" />
		</div>
	</div>
	<!-- --- footer -------------------------------------------------------- -->
	<tiles:insertAttribute name="footer" />
</body>
</html>