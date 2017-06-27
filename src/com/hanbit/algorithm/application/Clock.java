package com.hanbit.algorithm.application;
import java.util.Scanner;
public class Clock{
	public static void main(String[]args){
	Scanner s=new Scanner(System.in);	
		System.out.print("초를 입력하시오?.\n");
		int time=s.nextInt();
		
		int hour=0, min=0, sec=0;
		hour=time/3600;
				
		min=(time-(hour*3600))/60;
		
		sec=(time-(hour*3600))-(min*60);
		//hour+ "시간" +min+ "분" +sec+ "초"
		System.out.print(String.format("%d 시간 %d분 %d초",hour,min,sec));
		
	}
}	
		//초를 시간과 분으로 바꿔주는 프로그램이다 초를 입력 60000초 =16시간몇40분 0몇초