<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<style>
		.member.aside.show{
			left:0px;
		}
	</style>
	<header id="header">
		<ul>
			<li id="ham-button"><a href="" class="icon hamburger-icon">펼치기</a></li>
		</ul>
		<h1 class=""><a href="/index"><img src="/images/logo/logo-ldpi.png" alt="notepubs" /></a></h1>
		
		<nav id="main-menu">
			<h1>메인메뉴</h1>
			<ul>
			
				<li><a href="/user/logout">로그아웃</a></li>
			
						
			<!-- <li><a href="/member/join1" class="icon elipsis-icon">회원가입</a></li> -->
			</ul>
		</nav>
        <%-- <h1 class="logo"><a href="/index"><img src="/images/logo/logo-ldpi.png" alt="notepubs" ></a></h1>
        
        <section class="d-inline-block header-notice">
            <h1 class="d-none">공지사항</h1>
            <div>
                <a class="c-symbol c-speaker-symbol" href="">[공지]서비스를 업데이트 할 예정입니다.</a>
            </div>
        </section>
        <nav class="d-inline-block quick-menu">
            <h1 class="d-none">간편메뉴</h1>
            <ul class="d-flex">
                <li><a class="c-button c-write-button" href="/member/note/reg">글쓰기</a></li>
                <li><a class="icon icon-alarm" href="">알림</a></li>
                <li><a class="img profile-sm-img" href="">숨김</a></li>
            </ul>
        </nav> --%>
    </header>
	<script>
		var CSS = {};
		CSS.set = function(element, attrs){
			for(var key in attrs)
				element.style[key] = attrs[key];
		}
		
		window.addEventListener("load", function(event){
			
			// hamburger 버튼을 누를 때의 행위
			var hamButton = document.querySelector("#ham-button");
			
			var aside = document.querySelector(".member.aside");
			
			hamButton.onclick = function(e){
				e.preventDefault();
				
				// aside 창을 펼치는 행위
				if(aside.classList.contains("show")){
					aside.nextElementSibling.remove();
					aside.classList.remove("show");
				}
				else{
					var screen = document.createElement("div")
					CSS.set(screen, {
						position: "fixed",
						width: "100%",
						height: "100%",
						background: "#000",
						opacity: "0.5",
						zIndex: "500"
					});
					
					screen.onclick = function(e){
						aside.classList.remove("show");
						e.target.remove();
					};
					
					aside.insertAdjacentElement('afterend', screen);
				
					aside.classList.add("show");
				}
			};
			
		});
	</script>