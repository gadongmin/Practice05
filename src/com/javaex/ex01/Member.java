package com.javaex.ex01;

public class Member {
	// 필드
	private String name;
	private int point;

	// 생성자
	public Member(String name, int point) {
		this.name = name;
		this.point = point;
	}

	// 메소드 gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	// 메소드 일반
	public void showInfo() {
		System.out.println("=========================");
		System.out.println("회원정보: " + name + ", " + point + "점");
		System.out.println("=========================");
	}

}
