package com.hanbit.algorithm.application;
import java.util.Scanner;
public class Bmi{
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
         System.out.print("input your height: \n");
         double height = s.nextDouble() /100;
         System.out.print(height + "m \n");
         System.out.print("input your weight: \n");
         double weight = s.nextDouble();
         System.out.print(weight + "cm");
         double bmi = weight / (height * height);
         System.out.print("BMI: "+ bmi);
         String result =""; 
            if(30.0 < bmi){
               result = "비만";
            }else if(25.0 <= bmi){
               result = "과체중";
            }else if(18.5 <= bmi){
               result = "정상";
            }else{
               result = "저체중";
            }
            System.out.print("당신은 "+result+" 입니다");
   }
   
}