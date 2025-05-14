package com.javaex.ex06;

public class CConverter {

	public static double rate;  // 환율을 저장하는 클래스 변수

	public static void setRate(double rate) {
		CConverter.rate = rate; // 환율을 설정하는 메소드
	}

	public static double toDoller(double won) {
		return won / rate; // 달러 = 원화 / 환율
	}

	public static double toKWR(double dollar) {
		return dollar * rate; // 원화 = 달러 * 환율
	}

}
