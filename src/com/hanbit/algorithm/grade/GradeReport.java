package com.hanbit.algorithm.grade;
import java.util.Scanner;
public class GradeReport{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
	//변수 선언
	int kor=0,eng=0,math=0,avg=0,total=0;
	String re="";
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
	
	if (avg >=90){  //avg >=90
		re="A";
	}else if (avg >=80){ //avg >=80
		re="B";
	}else if (avg >=70){
		re="C";
	}else if (avg >=60){
		re="D";
	}else if (avg >=50){
		re="F";
	}
	
		
	//output
	System.out.print("***************************\n");
	System.out.print("이름     총점   평균   등급\n");
	System.out.print("---------------------------\n");
	System.out.print(name+" |  "+total+"  |  "+avg+"  |  "+re+"\n");
	//System.out.print(String.format("%s  %d  %d  %d \n",name,total,avg,re));
	System.out.print("***************************\n");
		
	}
	}