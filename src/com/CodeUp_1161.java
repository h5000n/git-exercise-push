package com;
import java.util.Scanner;
public class CodeUp_1161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
       if(num_1 % 2 == 1){
           System.out.print("홀수");
       }else{
           System.out.print("짝수");
       }
        System.out.print("+");
        if(num_2 % 2 == 1){
            System.out.print("홀수");
        }else{
            System.out.print("짝수");
        }
        System.out.print("=");
        if((num_1+num_2) % 2 ==0){
            System.out.print("짝수");
        }else{
            System.out.print("홀수");
        }

    }
}
