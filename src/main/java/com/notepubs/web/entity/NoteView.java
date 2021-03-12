package com.notepubs.web.entity;

import java.util.Date;

public class NoteView extends Note{
	
	private int bookmarkCount;		      
	private int likeCount;
	
	public NoteView() {
		// TODO Auto-generated constructor stub
	}
	
	public NoteView(int id, String title, String content, String writerId, Date regDate, int hit, int order,
			boolean pub, int mycategoryId, int memberId, int platformId, int languageId, int categoryId,int bookmarkCount, int likeCount) {
		super(id, title, content, writerId, regDate, hit, order, pub, mycategoryId, memberId, platformId, languageId,
				categoryId);

		this.bookmarkCount = bookmarkCount;
		this.likeCount = likeCount;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "NoteView [bookmarkCount=" + bookmarkCount + ", likeCount=" + likeCount + "]";
	}

	public int getBookmarkCount() {
		return bookmarkCount;
	}

	public void setBookmarkCount(int bookmarkCount) {
		this.bookmarkCount = bookmarkCount;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	} 
	

}
