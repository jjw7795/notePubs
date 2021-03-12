package com.notepubs.web.entity;

import java.sql.Date;

public class Language {

	private int id;
	private String name;
	private Date release;
	private int memberId;
	
	public Language() {
	
	}

	public Language(int id, String name, Date release, int memberId) {
		super();
		this.id = id;
		this.name = name;
		this.release = release;
		this.memberId = memberId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRelease() {
		return release;
	}

	public void setRelease(Date release) {
		this.release = release;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	@Override
	public String toString() {
		return "Language [id=" + id + ", name=" + name + ", release=" + release + ", memberId=" + memberId + "]";
	}
	
	
	
	
}
