package com.api.level01.basic;

import java.util.*;

public class Application2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        // 1. 영문자가 아닌 애들 기준으로 자르기
        String[] strArr = sc.nextLine().split("[^a-zA-Z]");
        HashMap<String, Integer> hashMap = new HashMap<>();
        String perStr = "";
//        System.out.println(Arrays.toString(strArr));

        // 2. 소문자로 바꿔서 hashmap에 넣기
        for (String s : strArr) {
            String lowerStr = s.toLowerCase();
            if (hashMap.containsKey(lowerStr)) {
                hashMap.put(lowerStr, hashMap.get(lowerStr) + 1);
            } else {
                hashMap.put(lowerStr, 1);
            }
        }
        System.out.println("===== 단어 빈도 =====");
        for(String str: hashMap.keySet()){
            System.out.println(str + ": " + hashMap.get(str));
            if(perStr == ""){
                perStr = str;
            }else if(hashMap.get(str)  > hashMap.get(perStr)){
                perStr = str;
            }
        };

        System.out.println("가장 빈도 높은 단어 : " + perStr + " ("+hashMap.get(perStr) + " 번)");
    }
}