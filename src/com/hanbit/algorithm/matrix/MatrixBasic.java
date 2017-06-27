package com.hanbit.algorithm.matrix;

public class MatrixBasic{
	public static void main(String[]args){
		int[][] mtx=new int[5][5];
		
		for(int i=0;i<mtx.length;i++){
				System.out.print("\n");
			for(int j=0;j<mtx[i].length;j++){
				System.out.printf("[%d,%d]",i,j);
			}
		
		}
		
	}
}