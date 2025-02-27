package com.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Application3 {
    private static final String NEXT = "next";
    private static final String EXIT = "exit";

    /* 정보 입력 받는 메서드 */
    private static String userInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        try {
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            input = br.readLine();
        } catch (IOException e) {
            System.out.println("userInput 에러 : " + e.getMessage());
        }
        return input;
    }

    /* next 진행 메서드 */
    private static String nextCustomer(LinkedList<String> customerList) {
        if (customerList.isEmpty()) return "대기 고객이 없습니다.";

        return customerList.poll() + " 고객님 차례입니다.";
    }

    /* exit 진행 메서드 */
    private static boolean isRemain(LinkedList<String> customerList) {
        if (customerList.isEmpty()) {
            return true;
        }

        System.out.println("대기 고객이 존재합니다. " + customerList);
        return false;
    }


    public static void main(String[] args) {
        LinkedList<String> customerList = new LinkedList<>();
        String userInput;

        while (true) {
            userInput = userInput();
            switch (userInput) {
                case NEXT:
                    System.out.println(nextCustomer(customerList));
                    break;
                case EXIT:
                    if (isRemain(customerList)) return;
                    else break;
                default:
                    System.out.println(userInput + " 고객님 대기 등록 되었습니다.");
                    customerList.addFirst(userInput);
            }
        }
    }
}


