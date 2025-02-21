package com.greedy.level01.basic.student.run;

import com.greedy.level01.basic.student.model.dto.StudentDTO;

import java.util.Objects;
import java.util.Scanner;

public class Application {

    /* 입력 지속 여부 확인 메소드 */
    private static boolean isConinue(char ch){
        return ch == 'y' || ch == 'Y';
    }

    /* 학생 입력 메소드 */
    private static StudentDTO inputStudent(){
        Scanner sc = new Scanner(System.in);
        StudentDTO student = new StudentDTO();
        System.out.print("학년 : ");
        student.setGrade(sc.nextInt());

        System.out.print("반 : ");
        student.setClassroom(sc.nextInt());

        System.out.print("이름 : ");
        student.setName(sc.next());

        System.out.print("국어점수 : ");
        student.setKor(sc.nextInt());

        System.out.print("영어점수 : ");
        student.setEng(sc.nextInt());

        System.out.print("수학점수 : ");
        student.setMath(sc.nextInt());
        
        return student;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentDTO[] studentArr = new StudentDTO[10];

        for(int i = 0; i < studentArr.length; i++){
            studentArr[i] = inputStudent();
            System.out.print("계속 추가할겁니까 ? (y/n) : ");
            if(!isConinue(sc.next().charAt(0))){
                break;
            }
        }
        /* Objects.isNyll(객체)
        * - 객체의 요소가 존재하는지 확인하여 boolean 값을 return 함! */
        for(int i = 0; !Objects.isNull(studentArr[i]); i++){
            System.out.println(studentArr[i].getInformation());
        }

    }
}
