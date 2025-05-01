package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("친구를 3명 등록해 주세요");
        System.out.println("");
        
        Friend f1 = new Friend("정우성", "010-1111-1111", "서울초등학교");
        Friend f2 = new Friend("이효리", "010-2222-2222", "제주중학교");
        Friend f3 = new Friend("유재석", "010-3333-3333", "강남고등학교");
        
        f1.showInfo();
        f2.showInfo();
        f3.showInfo();
        
        friendArray[0] = f1;
        friendArray[1] = f2;
        friendArray[2] = f3;

        for(int i=0; i<friendArray.length; i++) {
        	friendArray[i].showInfo1();	
        }

        sc.close();
    }

}
