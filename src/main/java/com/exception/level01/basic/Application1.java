package com.exception.level01.basic;

import java.io.*;

public class Application1 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("분자 입력 : ");
            int num = Integer.parseInt(br.readLine());
            System.out.print("분모 입력 : ");
            int denum = Integer.parseInt(br.readLine());

            int result = num / denum;

            System.out.println("결과 : " + result);

        } catch (NumberFormatException e) {
            System.out.println("오류 : 유효한 정수를 입력하세요.");
        } catch (ArithmeticException e) {
            System.out.println("오류 : 0으로 나누는 것은 허용되지 않습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("실행이 완료되었습니다.");
        }

    }
}