package com.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Application4 {
    private static final String EXIT = "exit";

    public static String userInput(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        try {
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            input = br.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return input;
    }

    public static void main(String[] args) {
        HashSet<String> stdIdSet = new HashSet<>();
        String input;

        while(true) {
            input = userInput();

            // 입력이 종료 신호일 경우
            if(input.equals(EXIT)){
                System.out.println("모든 학생의 ID" + stdIdSet);
                break;
            }

            // 입력이 set에 포함된 경우
            if (stdIdSet.contains(input)) {
                System.out.println("이미 등록 된 ID입니다.");
                continue;
            }

            stdIdSet.add(input);
            System.out.println("ID가 추가 되었습니다.");
        }
    }
}
