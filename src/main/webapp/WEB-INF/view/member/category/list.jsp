<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<main class="main">
		<section>
			<header class="d-none">
				<h1 class="d-none">카테고리 관리</h1>
			</header>
			
			<section class="category-content admin content-section first">
				<header>
					<h1 class="c-symbol c-symbol-book">내 카테고리</h1>
					<a href="" class="c-button c-write-button add-button">추가</a>
				</header>
				<div class="category-list content">
					<ul>
					<c:forEach var="c" items="${list}">	
						<li>
							<span class="title">${c.title}</span>
							
							<span class="tool">
								<a class="c-btn c-btn-inline" href="">수정</a>
								<a class="c-btn c-btn-inline" href="del?id=${c.id}">삭제</a>
							</span>
						</li>
					</c:forEach>	
						
					</ul>
				</div>
				<!-- <div class="text-align-right content">
					<a href="" class="c-btn c-btn-default">변경사항 저장</a>
				</div> -->
			</section>
		</section>
	</main>
	<script src="../../js/member/category/list.js"></script>
  