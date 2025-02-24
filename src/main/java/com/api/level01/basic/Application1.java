package com.api.level01.basic;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Application1 {
    public static void main(String[] args) {
        /* 사용자로부터 입력받은 텍스트에서 공백 문자를 기준으로 앞 글자를 대문자로 만들어서 변환해서 출력하는 프로그램을
        * String과 StringBuilder를 활용하여 구현한다.
        * 전체 단어의 개수도 함께 출력한다. */
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int size = st.countTokens();
        while(st.hasMoreTokens()){
            String targetStr = st.nextToken();
            String newString = (""+targetStr.charAt(0)).toUpperCase() + targetStr.substring(1) + " ";
            sb.append(newString);
        }

        System.out.println(sb);
        System.out.println("총 단어 개수: " + size);




        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */

    }
}
