package com.io.level02.normal;

import java.io.*;

public class Application {
    /* 파일 명 입력 받는 메소드*/
    private static String[] getFileName(int length){
        /* 배열의 마지막 요소는 병합 될 파일 명이 들어가야 함!*/
        String[] fileNameArr = new String[length + 1];

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            for(int i = 0; i < fileNameArr.length - 1; i++){
                System.out.print((i+1) + " 번째 파일 이름 입력 : ");
                fileNameArr[i] = br.readLine();
            }
            System.out.print("병합 될 파일명 입력 : ");
            fileNameArr[fileNameArr.length - 1] = br.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return fileNameArr;
    }

    /* 입력할 파일 갯수를 입력받는 메소드 */
    private static int inputFileLength() {
        int length = 0;

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("병합할 파일의 개수 입력 : ");
            length = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return length;
    }
    /* 여러 개의 텍스트 파일을 하나의 파일로 병합하는 프로그램을 작성한다.
     * 이 때 BufferedReader와 BufferedWriter를 사용하여 작성한다.*/
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        int countFile = inputFileLength(); // 입력될 파일의 개수

        String[] fileName = getFileName(countFile); // [1번 파일명, 2번 파일명 ... 병합될 파일명]

        try(FileWriter fw = new FileWriter(fileName[fileName.length-1])){
            BufferedReader br;

            for(int i = 0; i < fileName.length -1; i++){
                br = new BufferedReader(new FileReader(fileName[i]));
                String str;
                while( (str = br.readLine()) != null) {
                    sb.append(str).append("\n");
                }
            }
            fw.write(sb.toString());
            System.out.println("파일 병합이 완료 되었습니다.");
        } catch (FileNotFoundException e) {
            System.out.println("오류 : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("오류 : " + e.getMessage());
        }
    }
}
