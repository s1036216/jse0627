package com.hanbit.algorithm.sequences;
public class EvenSum{
	public static void main(String[]args){
		int[] arr=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=(i+2);
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
				if (arr[i]%2==0){
			sum+=arr[i];	
			}
		}
		System.out.print("sum:"+sum);
		}
	}
//1~10���� ¦���� ���� ���Ͽ���
