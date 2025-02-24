package com.api.level01.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdvApplication2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String[] strArr = sc.nextLine().split("[^a-zA-Z]");

        List<String> strList = new ArrayList<>();
        int[] countStr = new int[strArr.length];
        int idx = 0;

        for(String str : strArr){
            str = str.toLowerCase();
            if(!strList.contains(str)){
                strList.add(str);
            }
            countStr[strList.indexOf(str)] +=1;
        }

        for(int i = 0; i < strList.size(); i++){
            System.out.println(strList.get(i) + ": " + countStr[i]);
            if(countStr[i] > countStr[idx]){
                idx = i;
            }
        }

        System.out.println("가장 빈도 높은 단어 : " + strList.get(idx)  +" (" + countStr[idx] + "번)");
    }
}
