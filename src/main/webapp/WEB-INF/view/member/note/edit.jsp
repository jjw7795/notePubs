<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width,initial-scale=1, viewport-fit=cover" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<title>${note.title}</title>
<link href="/css/member/note/reg.css" type="text/css"
	rel="stylesheet">
<script src="/js/member/note/reg.js"></script>
</head>
<body class="editor">

	<header class="header">
		
		<div>
			<h1 class="logo">
				<a href="/index"><img src="/images/logo/logo-ldpi.png"
					alt="notepubs"></a>
			</h1>
		
			<nav class="d-inline-block user-menu">
				<h1 class="d-none">간편메뉴</h1>
				<ul class="d-flex">
					<!-- <li><a class="c-button c-write-button" href="/member/index">MyHome</a></li> -->
					<li><input form="frm1" class="c-button c-write-button" style="border:none;background:#99c243;" type="submit" value="저장"></li>
					<li><a class="c-button c-write-button" style="border:none;" href="javascript:history.back();">취소</a></li>
				</ul>
			</nav>
		</div>
		
		<div class="toolbar">
			<span class="panel"> <input type="button" value="bold"
				class="btn btn-text btn-bold"> <input type="button"
				value="underline" class="btn btn-underline"> <input
				type="button" value="italic" class="btn btn-italic">
			</span> <span class="panel"> <input type="button" value="left"
				class="btn btn-left"> <input type="button" value="center"
				class="btn btn-center"> <input type="button" value="right"
				class="btn btn-right">
			</span> <span class="panel"> <input type="button" value="font-size"
				class="btn btn-font-size"> <input type="button"
				value="font-color" class="btn btn-font-color"> <!-- <input type="button" value="font-family" class="btn btn-font-family"/> -->
			</span> <span class="panel"> 
			<input type="button" value="image"
				class="btn btn-image"> <!-- <span class="btn btn-text btn-link">link</span> -->
				<!-- <input type="button" value="html" class="btn btn-html" /> -->
			</span> <span> <input type="file" class="file-button"
				style="display: none;">
			</span>
		</div>
	</header>
	<script type="text/javascript">
		
		window.addEventListener("load", function(e){				
			header = document.querySelector(".header");
			toolbar = document.querySelector(".toolbar");
			editBody = document.querySelector(".body");
			htmlArea = document.querySelector(".html-area");
			
			var viewportHeaderOffset = header.getBoundingClientRect();
			var viewportToolbarOffset = toolbar.getBoundingClientRect();

			htmlArea.addEventListener("focus", function(e){
				window.scrollTo(0, -500);
				console.log("2");
			});n

			window.addEventListener("scroll", function(e){
				
				// these are relative to the viewport, i.e. the window
				var headerTop = viewportHeaderOffset.top;
				var toolbarTop = viewportToolbarOffset.top;
				console.log(headerTop);
				if(headerTop < -66){
					toolbar.style.position = "fixed";
					toolbar.style.top = "0px";
				}
				else if(headerTop >= -66){
					toolbar.style.position = "static";
					//toolbar.style.top = "0px";
				}
			});			
		});
		
		
	</script>
	

	<div class="body">
	<form id="frm1" class="note-reg-form" action="edit" method="post">
		<!-- <section>
			<h1>카테고리</h1>
			<div>
				<label>My카테고리</label>
				<select>
					<option>수업노트</option>
					<option>자바노트</option>
					<option>오류해결</option>
				</select>
			</div>
		</section> -->
		<section class="note-section" style="height: calc(100% - 70px);padding-bottom: 70px;">
			<h1><input type="text" name="title" autocomplete="off" value="${note.title}"></h1>
			<div class="html-area" contenteditable="true">${note.content}</div>
			<textarea rows="40" cols="80" name="content" class="text-area d-none">${note.content}</textarea>
			<input type="hidden" name="id" value="${note.id}" >
		</section>
		<!-- <section style="padding-bottom: 20px;
					    width: 100%;
					    border-top: 1px solid #00000070;
					    background: #fff;">
			<h1 class="d-none">관리도구</h1>
			<div style="padding-top: 20px;text-align: center;">
				<input class="c-button c-write-button" style="border:none;background:#99c243;" type="submit" value="저장">
				<a class="c-button c-write-button" style="border:none;" href="javascript:history.back();">취소</a>
			</div>
		</section> -->
	</form>
	</div>
	<script type="text/javascript">
					
		window.addEventListener("contextmenu", function(e){
			e.preventDefault();
			e.stopPropagation();
			
		    return false;
		});

		/* 
		var scrollTop =  
            window.pageYOffset || document.documentElement.scrollTop; 
      	var scrollLeft =  
            window.pageXOffset || document.documentElement.scrollLeft;
            
		window.addEventListener("scroll", function(e){			
	                          
            window.scrollTo(scrollLeft, scrollTop); 
            
		}); */
	</script>
	
</body>
</html>