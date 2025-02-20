package com.controlflow.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         영업사원의 월급을 계산하는 프로그램을 작성하려고 합니다.
//         * 월 급여액과 월 매출액을 입력 받아 급여를 산정합니다.
//         * -- 입력 예시 --
//         * 월 급여 입력 : 3000000
//         * 매출액 입력 : 20000000
        System.out.print("월 급여 입력 : ");
        int monthlySalary = sc.nextInt();
        System.out.print("매출액 입력 : ");
        int monthlySales = sc.nextInt();
        int bonusAmount = 0;
        double bonus = 0;
//         * 영업사원은 매출액 대비 보너스율에 명시된 보너스를 급여 외에 추가로 지급받습니다.
//         *
//         * 단, 보너스율은 입력 받은 월 매출액에 비례하며,
//         * 계산된 보너스 금액을 월 급여액에 더하여 총 급여를 계산한다.
//         *
//         * 보너스율을 적용하여 출력 예시처럼 출력되도록 프로그램을 만들어보세요
//         *
//         * -- 총 급여 계산식 --
//         * 총 급여 = 월 급여  + (매출액 * 보너스율)
//         *
//         * -- 매출액 대비 보너스율 --
//         *   매출액       보너스율
//         * 5천만원 이상      5%
//         * 3천만원 이상      3%
//         * 1천만원 이상      1%
//         * 1천만원 미만      0%
        if(monthlySales >= 50000000){
            bonus = 0.05;
        }else if(monthlySales >= 30000000){
            bonus = 0.03;
        }else if(monthlySales >= 10000000){
            bonus = 0.01;
        }

        bonusAmount = (int)(monthlySales * bonus);
//         * -- 출력 예시 --
//         * ======================
//         * 매출액 : 20000000
//         * 보너스율 : 1%
//         * 월 급여 : 3000000
//         * 보너스 금액 : 200000
//         * ======================
//         * 총 급여 : 3200000
//         *
        System.out.println("======================");
        System.out.println("매출액 : " + monthlySales);
        System.out.println("보너스 율 : " + (int)(bonus * 100) + "%");
        System.out.println("월 급여 : " + monthlySalary);
        System.out.println("보너스 금액 : " + bonusAmount);
        System.out.println("======================");
        System.out.println("총 급여 : " + (monthlySalary + bonusAmount));
    }
}
