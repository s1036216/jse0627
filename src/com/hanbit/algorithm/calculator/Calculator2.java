package com.hanbit.algorithm.calculator;
import java.util.Scanner;
public class Calculator2{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Num1\n");
		int a=s.nextInt();
		System.out.print("계산기선택?1.+ 2.- 3.* 4./ \n");
		String opcode=s.next();				
	    System.out.print("Enter Num2\n");
		int b=s.nextInt();
		int result=0;
		if(opcode.equals("+")){
			result=a+b;			
		}else if(opcode.equals("-")){
			result=a-b;
		}else if(opcode.equals("*")){
			result=a*b;
		}else{
				result=a/b;
		}	
		System.out.print(String.format("%d %s %d = %d",a,opcode,b,result));
}
}	