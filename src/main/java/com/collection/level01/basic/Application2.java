package com.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Application2 {
    private static final String EXIT = "exit";

    /* url 입력 받는 함수*/
    private static String getUrl(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String url = null;
        try{
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            url = br.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return url;
    }

    public static void main(String[] args) {
        LinkedList<String> urlList = new LinkedList<>();
        String url;
        while(true){
            url = getUrl();
            if(url.equals(EXIT)){
                break;
            }
            urlList.addFirst(url);

            if(urlList.size() > 5){
                urlList.removeLast();
            }
            System.out.println("최근 방문 url : " + urlList);
        }

    }
}
