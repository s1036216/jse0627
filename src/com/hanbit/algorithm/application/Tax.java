package com.hanbit.algorithm.application;
import java.util.Scanner;
public class Tax{
	public static void main(String[]args){
	Scanner s=new Scanner(System.in);
		System.out.print("세금출력프로그램\n");
		System.out.print("연봉을 적어주세요?");
		int salary=s.nextInt();
		System.out.print("이름을 적어주세요?");
		String name=s.next();
		
		double taxRate=0;
		int tax=(int)(salary*taxRate);
		if (salary<=1200){
			taxRate=0.08;
		}else if (4600>=salary&&salary>=1200){
			taxRate=0.17;
		}else if (8800>=salary&&salary>=4600){
			taxRate=0.26;
		}else if (8800<=salary){
			taxRate=0.35;
		}
		
				
		
				
		System.out.print("**************************\n");
		System.out.print("이름|연봉|세율|납부할 세금\n");
		System.out.print("-----------------------------\n");
		System.out.print(String.format("%s %d %f %f \n" ,name,salary,taxRate,tax));
		//System.out.print(b+" | "+a+"만원 |"+tax+" | "+c+"만원\n");
		System.out.print("**************************");
		
	}
	}
	