<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
	<main class="main">
		<section>
			<header class="d-none">
				<h1 class="d-none">카테고리 관리</h1>
			</header>
			
			<section class="category-content language-category-content admin content-section first">
				<header>
					<h1 class="c-symbol c-symbol-book">언어</h1>
					<a href="" class="c-button c-write-button lang-add-button">추가</a>
				</header>
				<div class="category-list content">
					<ul>
					<c:forEach var="lang" items="${langList}">
						<li>
							<span class="title">${lang.engName}</span>
							<span>${lang.type} 형식</span>
							<span class="tool">
								<a class="c-btn c-btn-inline" href="">수정</a>
								<a class="c-btn c-btn-inline" href="del?id=${lang.id}">삭제</a>
							</span>
						</li>
					</c:forEach>
						
						
					</ul>
				</div>
				<!-- <div class="text-align-right content">
					<a href="" class="c-btn c-btn-default">변경사항 저장</a>
				</div> -->
			</section>
			<section class="category-content platform-category-content admin content-section">
				<header>
					<h1 class="c-symbol c-symbol-book">플랫폼</h1>
					<a href="" class="c-button c-write-button">추가</a>					
				</header>
				<div class="category-list content">
					<ul>
						<li>
							<span class="title">MS Windows</span>
							<span>플랫폼 API</span>
							<span class="tool">
								<a class="c-btn c-btn-inline" href="">수정</a>
								<a class="c-btn c-btn-inline" href="">삭제</a>
							</span>
						</li>
						<li>
							<span class="title">서블릿/JSP</span>
							<span>플랫폼 API</span>
							<span class="tool">
								<a class="c-btn c-btn-inline" href="">수정</a>
								<a class="c-btn c-btn-inline" href="">삭제</a>
							</span>
						</li>
						<li>
							<span class="title">JAVA</span>
							<span>플랫폼 API</span>
							<span class="tool">
								<a class="c-btn c-btn-inline" href="">수정</a>
								<a class="c-btn c-btn-inline" href="">삭제</a>
							</span>
						</li>
						<li>
							<span class="title">Spring</span>
							<span>라이브러리</span>
							<span class="tool">
								<a class="c-btn c-btn-inline" href="">수정</a>
								<a class="c-btn c-btn-inline" href="">삭제</a>
							</span>
						</li>
						<li>
							<span class="title">Android</span>
							<span>플랫폼 API</span>
							<span class="tool">
								<a class="c-btn c-btn-inline" href="">수정</a>
								<a class="c-btn c-btn-inline" href="">삭제</a>
							</span>
						</li>
						<li>
							<span class="title">Daum</span>
							<span>플랫폼 API</span>
							<span class="tool">
								<a class="c-btn c-btn-inline" href="">수정</a>
								<a class="c-btn c-btn-inline" href="">삭제</a>
							</span>
						</li>
					</ul>
				</div>
				<!-- <div class="text-align-right content">
					<a href="" class="c-btn c-btn-default">변경사항 저장</a>
				</div> -->
			</section>
		</section>
	</main>
	<script src="../../js/admin/category/list.js"></script>
