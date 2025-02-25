package com.io.level01.basic;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String OriginFileName;
        String CopyFileName;

        try {
            System.out.print("원본 파일의 이름을 입력하세요 : ");
            OriginFileName = br.readLine();
            System.out.print("복사 파일의 이름을 입력하세요 : ");
            CopyFileName = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileReader fr = new FileReader(OriginFileName);
             FileWriter fw = new FileWriter(CopyFileName)) {

            int s;
            while ((s = fr.read()) != -1) {
                sb.append((char) s);
            }

            fw.write(sb.toString());

            System.out.println("파일 복사가 성공적으로 완료 되었습니다.");

        } catch (FileNotFoundException e) {
            System.out.println("오류 : " + OriginFileName + "(지정된 파일을 찾을 수 없습니다)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}