package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {
    	CConverter.setRate(1118.70);
    	
        //100만원을 달러로 출력하기
        double dollar = CConverter.toDoller(1000000);
        System.out.println("100만원은 " + dollar + "달러입니다.");
        
        //100달러를 원으로 출력하기
        double won = CConverter.toKWR(100);
        System.out.println("100달러는 " + won + "원입니다.");;
        
    }

}
