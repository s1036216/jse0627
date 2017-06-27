package com.hanbit.algorithm.member;
import java.util.Scanner;
public class SSN{
	public static void main(String[]args){
	Scanner s=new Scanner(System.in);	
		System.out.print("주민번호를 입력하세요.\n");
		String ssn=s.next();
		
	int year=Integer.parseInt(ssn.substring(0,2));
	int age=0;		
	int gap=17-year;
	/*
	if(gap>=0){
		age=2017-(year+2000)+1;
	}else
		age=2017-(year+1900)+1;
	*/
	
	char ch=ssn.charAt(6);
	String gender="";
	switch (ch){
	case '1' :{
			gender="남자입니다";
	} break;
	case '2' :{
			gender="여자입니다";
	} break;
	case '3' :{
			gender="남자입니다";
	} break;
	case '4' :{
			gender="여자입니다";
	} break;
	case '5' :{
			gender="외국인입니다";
	} break;
	case '6' :{
			gender="외국인입니다";
	} break;
	case '7' :{
			gender="잘못입력했습니다";
	} break;
	case '8' :{
			gender="잘못입력했습니다";
	} break;
	case '9' :{
			gender="잘못입력했습니다";
	} break; 
	default :
			gender="잘못입력했습니다";
	}
	System.out.print(((17-year)>=0)?2017-(year+2000)+1:2017-(year+1900)+1+gender);
	
	//**************
	//이름 성별
	//--------
	//홍길동 20세 남
	//**************
	}
}