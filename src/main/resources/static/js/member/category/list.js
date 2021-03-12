
window.addEventListener("load", function(){
	var section = document.querySelector(".category-content");
	var categoryList = section.querySelector(".category-list");
	var addButton = section.querySelector(".add-button");
	
	
	addButton.onclick = function(e){
		e.preventDefault();
		
		var li = `<li class="edit new">
			<span class="title">
				<input type="text" name="" value="" style="width:100%;">
			</span>
			<span class="tool">
				<a class="c-btn c-btn-inline reg-button" href="">등록</a>
				<a class="c-btn c-btn-gray cancel-button" href="">취소</a>
			</span>
		</li>`;

		categoryList.insertAdjacentHTML("afterbegin", li);
		
				
		setTimeout(() => {
		categoryList.firstElementChild.classList.remove("new");	
		
		}, 100);
	};
	
	section.onclick = function(e){
	
		if(e.target.classList.contains("cancel-button")){
			var li = e.target.parentElement.parentElement;
			li.remove();
		}
		else if(e.target.classList.contains("reg-button")){
			e.preventDefault();
			var li = e.target.parentElement.parentElement;
			var title = li.querySelector(".title input").value;
			
			var xhr = new XMLHttpRequest();
			
			xhr.open("POST", "reg", true);			
			xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
			xhr.onload = function(){
				
				var cate = JSON.parse(xhr.responseText);
				console.log(cate);
												
				li.remove();
				
				categoryList.insertAdjacentHTML("afterbegin", 
						`<li>
							<span class="title">${cate.title}</span>
							
							<span class="tool">
								<a class="c-btn c-btn-inline" href="">수정</a>
								<a class="c-btn c-btn-inline" href="del?id=${cate.id}">삭제</a>
							</span>
						</li>`);
				
			};
			xhr.send(`title=${title}`);		
		}
	};
	
	
});