package com.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {
//         * 문자열 1개를 입력 받고, 얼마나 문자를 밀지 알려주는 0보다 큰 정수를 1개 입력 받아
//         * 암호문을 작성하는 프로그램을 만들어보세요

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        String inputStr = sc.nextLine();

        // 스페이스 기준 분리하여 배열 생성
        String[] inputStrArr = inputStr.split(" ");

        // 결과를 저장할 문자열
        String[] result = new String[inputStrArr.length];

        int pushNum = 0;
        while(pushNum <= 0){
            System.out.print("숫자를 입력하세요 : ");
            pushNum = sc.nextInt();
        }
        // 문자열 배열 순회하면서 할당 값 변경
        for(int i = 0; i < inputStrArr.length; i++){
            // 형 변환
            char ch = inputStrArr[i].charAt(0);
//         어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
            pushNum = pushNum % 26;
            int caeser = (int)ch + pushNum;

            // 범위보다 큰 지 확인
            // 대문자인 경우
            if(caeser > (int)'Z' && caeser < (int)'a'){
                caeser = ('A' + (caeser - (int)'Z') -1);
            } // 소문자인 경우
            else if(caeser > (int)'z'){
                caeser = ('a' + (caeser - (int)'z') -1);
            }

            // 결과 배열 추가
            result[i] = "" + (char)caeser;
        }
        System.out.println(String.join(" ", result));



//         * A를 3만큼 밀면 D가 되고, z를 1만큼 밀면 a가 됩니다.
//         * 또한 공백문자는 변경되지 않습니다.

//         * 단, 숫자가 27인 경우는 1칸을 밀게 됩니다. (알파벳은 26글자 이기 때문)

//         * -- 입력 예시 --
//         * 문자열을 입력하세요 : a B z
//         * 숫자를 입력하세요 : 4
//         * -- 출력 예시 --
//         * e F d
//         *
//         * -- 입력 예시 --
//         * 문자열을 입력하세요 : a B z
//         * 숫자를 입력하세요 : 27

//         * -- 출력 예시 --
//         * b C a
//         *

    }

}