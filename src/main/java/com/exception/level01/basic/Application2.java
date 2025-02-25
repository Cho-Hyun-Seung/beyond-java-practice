package com.exception.level01.basic;

import com.exception.level01.basic.exception.NotAdultException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Application2 {
    public static void main(String[] args) {
        System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
        LocalDate adult = LocalDate.now().minusYears(20);
        LocalDate birthday;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            birthday = LocalDate.parse(br.readLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            if (birthday.isAfter(adult)) throw new NotAdultException("만 20세 미만은 입장 불가입니다.");

            System.out.println("입장하셔도 됩니다.");

        } catch (DateTimeException e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        } catch (NotAdultException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2014-05-05
         *
         * ----- 출력 예시 -----
         *
         * 만 20세 미만은 입장 불가입니다.
         *
         * ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 1994-05-05
         *
         * ----- 출력 예시 -----
         *
         * 입장하셔도 됩니다.
         *
         * ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2000-14-15
         *
         * ----- 출력 예시 -----
         *
         * 날짜 양식을 잘못 입력하셨습니다.
         */

    }
}
