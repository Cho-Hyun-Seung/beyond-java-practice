package com.greedy.level02.normal;

public class RandomMarker {
    //첫 번째 인자의 최소값 부터 두 번쨰 인자까지 범위의 난수를 return
    public int randomNumber(int min, int max){
        return (int) (Math.random() * (max-min+1)) + min;
    }

    //인자로 전달한 정수 길이의 랜덤한 문자열 return
    public String randomUpperAlpabet(int length){
        String randomString = "";
        while(randomString.length() <= length){
            randomString += (char)randomNumber(65, 90);
        }
        return randomString;
    }

    //가위, 바위, 보 중 한 가지를 return
    public String rockPaperScissors(){
        String[] rockPaperScissorsArr = {"가위", "바위", "보"};
        return rockPaperScissorsArr[randomNumber(0,2)];
    }

    //앞면, 뒷면 중 한 가지를 return
    public String tossCoin(){
        String[] coin = {"앞면", "뒷면"};
        return coin[randomNumber(0,1)];
    }
}
