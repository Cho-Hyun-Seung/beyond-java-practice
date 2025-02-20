package com.looping_and_branching.level03.hard;


import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {
//         문자열을 하나 입력 받고, 검색할 문자를 입력 하여
//         * 입력받은 문자열에서 검색할 문자가 몇 개 포함되어 있는지를 출력하는 프로그램을 만드세요
//         * -- 정상 동작의 경우 --
//         * -- 입력 예시 --
//         * 문자열 입력 : apple
//         * 문자 입력 : p
//         *
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String inputStr = sc.next();
        // regex로 풀면 더 편리?
        for(int i = 0; i < inputStr.length(); i++){
            int asciiCh = (int)inputStr.charAt(i);
//         * -- 출력 예시 --
//         * 영문자가 아닌 문자가 포함되어 있습니다.
//         *
            if( asciiCh < (int)'A' ||
                    asciiCh > (int)'Z' && asciiCh < (int)'a' ||
                    asciiCh > (int)'z'){
                System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
                return;
            }
        }
        System.out.print("문자열 입력 : ");
        char searchCh = sc.next().charAt(0);

        int count = 0;

        for(int i = 0; i < inputStr.length(); i++){
            char ch = inputStr.charAt(i);
            if(ch == searchCh) count ++;
        }
//         * -- 출력 예시 --
//         * 포함된 갯수 : 2개
        System.out.println("포함된 갯수 : " + count + "개");
    }

}

