package com.hanbit.algorithm.member;
import java.util.Scanner;
public class Login{
	 public static final String USER_ID="kim";
	 public static final String USER_PW="1";
	 public static void main(String[]args){ 
	 Scanner s = new Scanner(System.in);
	 System.out.print("login \n"); 
	 //public static final 이 문장은 USER_ID 를 상수로 만든다 
	 System.out.print("Insert ID: ");
	 String id= s.next();
	 System.out.print("Insert PassWord: ");
	 String pw=s.next(); 
	 String result=null; 
	 if(!id.equals(USER_ID)){ 
	 result="plz check your ID and password"; 
	 }else if(!pw.equals(USER_PW)){ 
	 result="wrong pass word"; 
	 }else{ result= "login success"; } 
	 System.out.print(result); 
	 } 
	 }