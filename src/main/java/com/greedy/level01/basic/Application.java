package com.greedy.level01.basic;

public class Application {
    public static void main(String[] args){
        Calculator cal = new Calculator();

        //메소드 호출 확인용 메소드 호출
        cal.checkMethod();

        //함수를 호출하여 1~10까지의 합을 리턴 받아 출력
        int sum = cal.sumTo10();
        System.out.println("1부터 10까지의 합 : " + sum);

        //10, 20 두 개의 정수를 매개변수로 하여 큰 값 출력하는 메소드 호출
        cal.checkMaxNumber(10, 20);

        //10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력
        int plus = cal.sumTwoNumber(10, 20);
        System.out.println("10과 20의 합은 : " + 30);

        //10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력
        int minus = cal.minusTwoNumber(10,5);
        System.out.println("10과 5의 차는 : " + minus);
    }
}
