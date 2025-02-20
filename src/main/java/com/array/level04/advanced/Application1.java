package com.array.level04.advanced;

import java.util.Arrays;
import java.util.Random;

public class Application1 {

    public static void main(String[] args) {
        int[] arr = new int[6];
        Random random = new Random();
        for(int i = 0; i < arr.length; i++){
            label:
            while(true){
                int ranNum = random.nextInt(45) + 1;
                for(int j =0; j < i; j++){
                    if(ranNum == arr[j]){
                        continue label;
                    }
                }
                arr[i] = ranNum;
                break;
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        /* 로또번호 생성기
         * 6칸 짜리 정수 배열을 하나 생성하고
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요.
         * Arrays.sort(배열) 메소드 활용하여 정렬 가능.
         * */

    }

}