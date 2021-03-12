class NoteList extends React.Component{
	constructor(){
		super();
		this.state={
		myCategoryList:[{}],
		categoryList:[{}],
		languageList:[{}],
		platformList:[{}],
		list:[{"id":1,"title":"hello","content":"2021","writerId":"mk",
		"regDate":"2021-01-06T12:00:28.910+00:00","hit":13,"order":0,"pub":true,
		"mycategoryId":1,"memberId":1,"platformId":3,"languageId":1,"categoryId":1}]
		}
	}
//		map.put("myCategoryList",myCategoryList );
//		map.put("categoryList",categoryList );
//		map.put("languageList", languageList);
//		map.put("platformList",platformList );
	
	componentDidMount(){
		fetch(`/api/note/list`)
		.then((response)=>{
			return response.json();
		})
		.then(data=>{
			this.setState(data);
		});
		System.out.println("didMount");
	}

	
	searchButtonClickHandler(e){
		e.preventDefault();		
		
	}

	render(){
		System.out.println("render");
		return <main className="main">
	<section className="content-section first">
		<header>
			<h1>
				<span className="c-symbol c-symbol-note">노트 관리 20</span>
				<a href="reg" className="c-btn c-btn-default">글쓰기</a>
			</h1>
		</header>
		
		<section className="category-box">			
			<h1 className="d-none">편집도구</h1>		
			<div>
			<form action="list" method="get">
				<div>
					<label className="cate-label">My카테고리</label>					
					<select className="cate-input" name="mc">
					<option value="0">선택</option>
					{this.state.myCategoryList.map(m=>
							<option key={m.id}>{m.name}</option>						
						)			
					}
					</select>
				</div>
				<div>
					<label className="cate-label">카테고리</label>
					<select className="cate-input" name="c" >
						<option value="0">선택</option>
						{this.state.categoryList.map(c=>
									<option key={c.id}>{c.name}</option>
							)
						}		
					</select>
				</div>
				<div>
					<label className="cate-label">메인언어</label>
					<select className="cate-input" name="lang">
						<option value="0">선택</option>	
						{this.state.languageList.map(lang=>
								<option key={lang.id}>{lang.name}</option>
							)
						}		
					</select>
				</div>
				<div>
					<label className="cate-label">플랫폼</label>
					<select className="cate-input" name="pf">
						<option value="0">선택</option>	
						{this.state.platformList.map(pf=>
								<option key={pf.id}>{pf.name}</option>
							)
						}				
					</select>
				</div>
				
				<div className="search-form">
					<h2 className="d-none">검색 폼</h2>					
						<h3 className="cate-label">노트검색</h3>
						<div className="cate-input" style={{display: "flex"}}>
							<label className="d-none">제목</label>
							<input type="text" name="title" 
								placeholder="제목입력" style={{textAlign: "center"}}/>
							<input className="c-btn c-btn-default" type="submit" value="검색" onClick={this.searchButtonClickHandler.bind(this)}/>
						</div>						
				</div>	
			</form>			
				
		</div>
		</section>
		<section className="list-note">
			<h1 className="d-none">노트목록</h1>
			<table className="table">
				<tbody>	
				{ this.state.list.map(n=><tr key={n.id}>
						<td className="w60"><input name="id"  type="radio"/></td>
						<td className="title text-align-left">
							<a href={n.id}>{n.title}</a>
							<span className="w250 d-none">자바수업/노트/자바</span>
							<span className="w100">
								<a href="1/edit" className="c-btn c-btn-text">수정</a>
								<a href="1/del" className="c-btn c-btn-text">삭제</a>
							</span>
						</td>
					</tr>)
				}							
				</tbody>
			</table>
															
			<div className="pager">
				<h2 className="d-none">페이저</h2>
				<div>				
					<span onClick={()=>{"alert('이전 페이지가 없습니다.');"}}>이전</span>				
				</div>
				<ul className="pager-list">														
					<li><a href="?p=" className="current"></a></li>					
				</ul>
				<div>				
				<span className="" onClick={()=>{"alert('다음 페이지가 없습니다.');"}}>다음</span>				
				</div>
			</div>
		</section>		
	</section>
</main>;
	}
}


ReactDOM.render(
	<NoteList /> , document.querySelector("#main"));