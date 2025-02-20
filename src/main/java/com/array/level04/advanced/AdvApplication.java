package com.array.level04.advanced;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AdvApplication {
    static final int MAX_TRY = 10; // 유저 기회 최대 횟수

    /* 게임판 생성 메소드 */
    private static int[] makeGame(){
        // 1. 길이 4의 정수 배열 생성
        int[] gameBoard = new int[4];

        // 2. 각 인덱스에 중복되지 않는 0 ~ 9 범위의 난수 저장
        Random random = new Random();
        for(int i = 0; i < gameBoard.length; i++){
            gameBoard[i] = random.nextInt(9);
            for(int j = 0; j < i; j++){
                if(gameBoard[j] == gameBoard[i]){
                    i --;
                    break;
                }
            }
        }
        return gameBoard;
    }

    /* 사용자 입력 메소드 */
    private static String userInput(){
        Scanner sc = new Scanner(System.in);
        String inputStr;
        // 1. 사용자 입력
        while(true){
            System.out.print("4자리 숫자를 입력하세요 : ");
            inputStr = sc.next();
            // 사용자 입력 조건
            // - 숫자만 입력 가능
            // - 4자리만 입력 가능
            // 입력 조건을 만족한 경우
            if (inputStr.matches("^[0-9]{4}$")) break;
            else System.out.println("4자리의 정수를 입력해야 합니다.");
        }
        return inputStr;

    }
    /* 사용자 제출 정답 여부를 체크하는 메소드 */
    private static boolean isCorrect(String inputStr, int[] gameBoard){
        int strike = 0;
        int ball = 0;

        // 1. inputStr int[]로 형변환
        int[] inputStrArr = new int[4];
        for(int i = 0; i < inputStrArr.length; i ++){
            inputStrArr[i] = inputStr.charAt(i) - '0';
        }

        // 2. strike, ball 검사
        for(int i = 0; i < inputStrArr.length; i ++){
            for(int j = 0; j < gameBoard.length; j++){
                if(inputStrArr[i] == gameBoard[j] && i == j){
                    strike += 1;
                }else if(inputStrArr[i] == gameBoard[j]){
                    ball += 1;
                }
            }
        }
        if(strike == 4){
            System.out.println("정답입니다.");
            return true;
        }else{
            System.out.println("아쉽네요 " + strike + "S " + ball + "B 입니다.");
            return false;
        }
    }

    public static void main (String[] args) {
        /* 게임판 생성*/
        int[] gameBoard = makeGame();
        System.out.println(Arrays.toString(gameBoard));

        int chance = MAX_TRY;
        /* 게임 진행*/
        while(true){
            // 기회를 모두 다 쓴 경우 종료
            if(chance <= 0){
                System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
                break;
            }
            // 1. 남은 횟수 출력
            System.out.println(chance + "회 남으셨습니다.");

            // 2. 사용자 입력
            String inputStr = userInput();

            // 3. 정답 여부 확인
            if(isCorrect(inputStr, gameBoard)){
                break;
            }

            // 4. 기회 차감
            chance --;
        }
    }
}
