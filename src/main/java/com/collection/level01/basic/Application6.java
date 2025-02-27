package com.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Application6 {
    private static final String SEARCH = "search";
    private static final String EXIT = "exit";

    // 입력의 유효성 검증하는 메서드
    private static boolean checkValidation(String input) {
        String[] inputArr = input.split(" ");
        // 1. 2개로 나눴을 때 길이가 2인가?
        if (inputArr.length != 2) return false;

        // 2. 전화번호 유형을 만족하는가 ?
        if (!inputArr[1].matches("^\\d{3}-\\d{3,4}-\\d{4}$")) return false;

        return true;
    }

    // 전화번호 부에서 검색하는 메서드
    private static void searchPhoneNum(HashMap<String, String> phoneBook) {
        System.out.print("검색 할 이름 : ");
        String name = userInput();

        if (!phoneBook.containsKey(name)) {
            System.out.println(name + "씨의 번호는 등록 되어 있지 않습니다.");
            return;
        }

        System.out.println(name + "씨의 전화번호 : " + phoneBook.get(name));
    }

    // 전화번호 부에 기록하는 메서드
    private static void insertPhoneNum(String input, HashMap<String, String> phoneBook) {
        // 입력 요건을 만족하지 않는 경우
        if (!checkValidation(input)) {
            System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
            return;
        }
        StringTokenizer st = new StringTokenizer(input);
        phoneBook.put(st.nextToken(), st.nextToken());
    }

    // 유저 입력 받는 메서드
    private static String userInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        try {
            input = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return input;
    }

    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        String input;

        while (true) {
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            input = userInput();
            switch (input) {
                case EXIT:
                    return;
                case SEARCH:
                    searchPhoneNum(phoneBook);
                    break;
                default:
                    insertPhoneNum(input, phoneBook);
                    System.out.println("추가 완료 : " + input);

            }
        }

    }
}
