package com.io.level01.basic;

import java.io.*;

public class Application1 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        try{
            System.out.print("파일 이름을 입력하세요 : ");
            String filename = br.readLine();
            FileReader fr = new FileReader(filename);
            int num;
            while( (num = fr.read()) != -1){
                sb.append((char)num);
            }
            bw.write(sb.toString());
            bw.flush();
            bw.close();
        }catch(FileNotFoundException e){
            System.out.println("오류 : 해당 이름을 가진 파일이 없습니다.");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


        /* ----- 입력 예시 -----
         *
         * (존재하는 파일명을 입력한 경우)
         * 파일 이름을 입력하세요 : hello.txt
         *
         * ----- 출력 예시 -----
         *
         * ===== 파일 내용 출력 =====
         * 안녕하세요. 반갑습니다. 제 이름은 홍길동입니다.
         *
         * ----- 입력 예시 -----
         *
         * (존재하지 않는 파일명을 입력한 경우)
         * 파일 이름을 입력하세요 : unknown.txt
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 해당 이름을 가진 파일이 없습니다.
         *
         */
    }
}
