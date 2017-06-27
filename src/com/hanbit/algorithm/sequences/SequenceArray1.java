package com.hanbit.algorithm.sequences;
public class SequenceArray1{
	public static void main(String[]args){
		int[] arr=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=(i+1);
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
			System.out.print(i+1+"\t");
			sum+=arr[i];
		}
		System.out.print("sum:"+sum);
		}
	}


	//���ڸ� �迭�ض�