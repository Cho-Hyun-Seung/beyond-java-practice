package com.greedy.level01.basic;

public class Calculator {
    // 메소드 호출 확인용
    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    // 1 ~ 10 합 return
    public int sumTo10(){
        int sum = 0;
        for(int i = 1; i <= 10; i ++){
            sum += i;
        }
        return sum;
    }

    // 두 int형 매개변수를 비교하여 큰 값 return
    public void checkMaxNumber(int a, int b){
        int biggerNum = a > b ? a : b;
        System.out.println("두 수 중 큰 수는 " + biggerNum + "이다.");
    }

    // 두 int형 매개변수의 합을 return
    public int sumTwoNumber(int a, int b){
        return a+b;
    }

    // 두 int형 매개변수의 차를 return
    public int minusTwoNumber(int a, int b){
        return a-b;
    }
}
