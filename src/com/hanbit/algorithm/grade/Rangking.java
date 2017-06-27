package com.hanbit.algorithm.grade;
import java.util.Scanner;
public class Rangking{
	public static void main(String[]args){	
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[3];
		String name[]=new String[3];
		
			
		for(int i=0;i<3;i++){
		System.out.print("이름입력\n");
			name[i]=scan.next();
			System.out.print("점수입력\n");
			arr[i]=scan.nextInt();
		}
		int num[]=new int[3];
		String ranking[]=new String[3];
				
		//가장큰값부터 나열
				
		if(arr[0]>arr[1]&&arr[0]>arr[2]){
			num[0]=arr[0];
			ranking[0]=name[0];
			if(arr[1]>arr[2]){
				num[1]=arr[1];
				ranking[1]=name[1];
				num[2]=arr[2];
				ranking[2]=name[2];
			}else{
				num[1]=arr[2];
				ranking[1]=name[2];
				num[2]=arr[1];
				ranking[2]=name[1];
			}
		}else if(arr[1]>arr[0]&&arr[1]>arr[2]){
			num[0]=arr[1];
			ranking[1]=name[1];
			if(arr[0]>arr[2]){
				num[1]=arr[0];
				ranking[0]=name[0];
				num[2]=arr[2];
				ranking[2]=name[2];
			}else{
				num[1]=arr[2];
				ranking[0]=name[2];
				num[2]=arr[0];
				ranking[2]=name[0];
			}
		}else{
			if(arr[2]>arr[0]&&arr[2]>arr[1]){
				num[0]=arr[2];
				ranking[2]=name[2];
				if (arr[0]>arr[1]){
				num[1]=arr[0];
				ranking[0]=name[0];
				num[2]=arr[1];
				ranking[1]=name[1];
				}else
				num[1]=arr[1];
				ranking[0]=name[1];
				num[2]=arr[0];
				ranking[1]=name[0];
			}
		}
		System.out.print("1등"+ranking[0]+num[0]+"  2등  "+ranking[1]+num[1]+"   3등  "+ranking[2]+num[2]+"\n");
	}
	
}

