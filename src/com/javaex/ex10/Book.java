package com.javaex.ex10;

public class Book {
	// 필드
	private int bookNo;
	private String title;
	private String author;
	private int stateCode = 1;

	// 생성자
	public Book() {
	}

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}

	// 메소드-gs
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int book) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	// 메소드-일반
	public void rent() {
		this.stateCode = 0;
		System.out.println(title + "이(가) 대여 됐습니다.");
	}

	public void print() {
		String state; // state 문자열 변수 설정 
		if (this.stateCode == 1) { // stateCode 값이 1일때 재고있음 
			state = "재고있음";
		} else {
			state = "대여중";
		}
		System.out.println(bookNo + "  제목: " + title + ", 작가: " + author + ", 대여 유무: " + state);
	}

}
