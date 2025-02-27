package com.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Application5 {
    private static final String EXIT = "exit";

    public static String userInput(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        try {
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            input = br.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return input;
    }

    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        String input;

        while(true) {
            input = userInput();
            // 입력이 종료 신호일 경우
            if(input.equals(EXIT)){
                wordList.sort((o1, o2) -> o1.compareTo(o2));
                System.out.println("정렬 된 단어 : " + wordList);
                break;
            }
            wordList.add(input);
        }
    }
}
