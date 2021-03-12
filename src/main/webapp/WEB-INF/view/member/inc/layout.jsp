<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width,initial-scale=1, viewport-fit=cover" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<title>Insert title here</title>
<link href="/css/member/inc/layout.css" type="text/css" rel="stylesheet" >
</head>
<body>
	<tiles:insertAttribute name="header" />
	
	<div class="body">


	<tiles:insertAttribute name="aside" />
	<tiles:insertAttribute name="main" />
	
    </div>
	
	<tiles:insertAttribute name="footer" />
</body>
</html>