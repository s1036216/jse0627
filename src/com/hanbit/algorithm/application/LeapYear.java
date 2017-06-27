package com.hanbit.algorithm.application;
import java.util.Scanner;
public class LeapYear{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.print("년도를 입력하세요.\n");
		int year=s.nextInt();
		if(year%4==0){
			System.out.print("윤년");
			
		}else 
			System.out.print("평년");
		if(year%100==0){
			System.out.print("평년");
		}else 
			System.out.print("윤년");
			if(year%400==0){
			System.out.print("평년");
		
		
	}
}
}