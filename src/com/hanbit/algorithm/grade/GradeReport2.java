package com.hanbit.algorithm.grade;
import java.util.Scanner;
public class GradeReport2{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
    //변수 선언
    int kor=0,eng=0,math=0,avg=0,total=0;
    String re="", grade="";
    //name, kor, eng, math
    //total, avg(평균)
    // 이름: 학점
    System.out.print("이름?\n");
    String name=s.next();
      System.out.print("국어점수는?\n");
    kor=s.nextInt();
    System.out.print("영어점수는?\n");
    eng=s.nextInt();
    System.out.print("수학점수는?\n");
    math=s.nextInt();
    // operation
    total=kor+eng+math;
    avg=total/3;

	switch(avg/10){
        case 10: case 9:
			grade="A";
            re="장학금 대상입니다";
        break;
        case 8 :
            grade="B";
			re="3학점 이수";   
        break;
        case 7 :
            grade="C";
			re="2학점 이수";   
        break;
        case 6 :
            grade="D";
			re="재수강";   
        break;
        case 5 :
            grade="e";
			re="학사경고";   
        break;
        default :
			grade="f";
			re="학사경고";
			break;
    }

	
    //output
    System.out.print("***************************\n");
    System.out.print("이름     총점   평균   등급\n");
    System.out.print("---------------------------\n");
    //System.out.print(name+" |  "+total+"  |  "+avg+"  |   "+grade+"|"+re+"\n");
    System.out.print(String.format("%s |  %d  | %d  |  %s |  %s \n",name,total,avg,grade,re));   
System.out.print("***************************\n");

    }
    }
