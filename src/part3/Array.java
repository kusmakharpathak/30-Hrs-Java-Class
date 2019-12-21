package part3;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[] a = new int[index];
        int[] b = new int[index];
        int[] c = new int[index];
//        Random num = new Random();
        for(int i=0; i<index; i++){
            System.out.println("Enter a value for A ["+(int)(i+1)+"] =>\t");
            int num1 = sc.nextInt();
            a[i] = num1;
            System.out.println("Enter a value for B ["+(int)(i+1)+"] =>\t");
            int num2 = sc.nextInt();
            b[i] = num2;
            c[i] = a[i]+b[i];
        }
        for(int i=0; i<index; i++){
            System.out.println(c[i]);
        }


    }
}
