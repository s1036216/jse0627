package com.hanbit.algorithm.sequences;
import java.util.Scanner;
public class TopRanking{
		public static void main(String[]args){
			Scanner s=new Scanner(System.in);
			int sum=0,avg=0,max=0,min=0;//�̰��� �迭�� ��ȯ
			
			
			
			System.out.print("1���� �� �л����� ���?");
			int students=s.nextInt();
			int a[]=new int[students];//����
			
			for(int i=0;i<students;i++){
			System.out.print("�л��� ��� ���� �Է��ϼ���(100������)?");
            a[i]=s.nextInt();//�Ҵ�
            }

            for(int i=0;i<a.length;i++){
                sum+=a[i];
            }
            max=a[0];       
            for(int i=0;i<a.length;i++){
                if(max<a[i]){
                max=a[i];
                }
            }
            min=a[0];
            for(int i=0;i<a.length;i++){
                if(min>a[i]){
						min=a[i];
                }
            }           

						
			//�̹����� lengrh�� ������ �迭�� �����ؾ� �մϴ�
			//�׸��� �׼���ŭ for loop �� ����������
			//�Է¹޽��ϴ�
			//����� 1�� ������ ���� ������ ���ϴ� ������ ���մϴ�
			
			System.out.print("1���� ���������"+sum/students+"\n");
			System.out.print("�ִ�������"+max+"\n");
			System.out.print("�ּ�������"+min+"\n");
			
		}
}