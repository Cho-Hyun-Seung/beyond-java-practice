package com.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Application1 {
    private static boolean isContinue() {
        boolean response = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                System.out.print("추가 입력하려면 y : ");
                char input = br.readLine().charAt(0);
                // 1. y || Y 인 경우
                if (input == 'Y' || input == 'y') {
                    response = true;
                    break;
                }
                // 2. n || N 인 경우
                else if (input == 'N' || input == 'n') {
                    response = false;
                    break;
                } else {
                    System.out.println("(y | Y | n | N) 형태로 입력해주세요!");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return response;
    }

    private static int getGrade() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int grade = 0;
        try {
            System.out.print("학생 성적 : ");
            grade = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return grade;
    }

    public static void main(String[] args) {
        Stack<Integer> gradeStack = new Stack<>();
        do {
            gradeStack.push(getGrade());
        }while(isContinue());
        int sum = 0;
        int length = gradeStack.size();

        while (!gradeStack.isEmpty()) {
            sum += gradeStack.pop();
        }

        System.out.println("학생 인원 : " + length);
        System.out.println("평균 점수 : " + (double) sum / length);

    }
}
