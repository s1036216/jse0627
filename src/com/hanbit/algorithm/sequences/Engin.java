package com.hanbit.algorithm.sequences;
import java.util.Scanner;
public class Engin{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);  
		
		while(true){
			System.out.print("0.���� 1.���� \n");
			String menu=s.next();
			switch(menu){
			case "0":
				System.out.print("�ý�������!! \n");
			return;
			case "1":
				System.out.print("�ý��۽���!! \n");
			break;
			}
		}
		
	}
}