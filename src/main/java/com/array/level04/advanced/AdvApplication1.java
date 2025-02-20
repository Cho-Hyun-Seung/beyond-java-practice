package com.array.level04.advanced;

import java.util.Arrays;
import java.util.Random;

public class AdvApplication1 {
    public static void main(String[] args){
        int[] arr = new int[6];

        Random random = new Random();

        int index = 0;

        label:
        while(index < 6){
            int ranNum = random.nextInt(7) + 1;
            for(int i = 0; i < index; i ++){
                if(arr[i] == ranNum) continue label;
            }
            arr[index] = ranNum;
            index +=1;
        }

        System.out.println(Arrays.toString(arr));
    }
}
