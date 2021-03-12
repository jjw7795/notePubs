<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link href="/css/note/list.css" rel="stylesheet" type="text/css" />


	<main class="main">
		<section class="countable-list padding-list note-list">
				<h1>
					<span class="count"><span>노트</span><span></span></span>
					<span class="option">
					<%-- <a class="${regSelect}" href="../note/list?f=reg">최신순</a>
					<a class="${likeSelect}" href="../note/list?f=like">인기순</a>
					<a class="${hitSelect}" href="../note/list?f=hit">조회수</a> --%>
					</span>
				</h1>
				
				<ul class="">
				<c:forEach var="note" items="${list}">
				
					<li>
						<article>
							<h1 class="title"><a href="${note.id}">${note.title}</a></h1>
							
							<div class="content ">
								${note.content}
							</div>
							<footer class="footer">
								<span>${note.writerId}</span>
								<span class="regdate"><fmt:formatDate value="${note.regDate}" pattern="yyyy-MM-dd"/></span>
								<span class="count bookmark">${note.bookmarkCount}</span>
								<span class="count like">${note.likeCount}</span>
								<span class="count hit">${note.hit}</span>
							</footer>
						</article>
					</li>					
				</c:forEach>
				
				</ul>
			</section>
			<section style="margin-bottom: 30px; margin-top: 20px;">
				
				<h1 class="hidden">페이저</h1>
			</section>
	</main>



