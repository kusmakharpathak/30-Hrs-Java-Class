package part1;

import java.util.Scanner;

public class Calc {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter first Number");
//        int a =input.nextInt();
//        System.out.println("Enter your operation");
//        String operation = input.next();
//        System.out.println("Enter second Number");
//        int b =input.nextInt();
//        int result=0;
//        System.out.println(result);
//        char operation1 = operation.charAt(0);
//        if(operation1=='+'){
//            result = a+b;
//        }else if(operation1=='-'){
//            result = a-b;
//        }else if(operation1=='*'){
//            result = a*b;
//        }else if(operation1=='/'){
//            (double)result = a/(double)b;
//        }else if(operation1=='%'){
//            result = a%b;
//        }else{
//            System.out.println("Wrong Operation");
//        }
//        System.out.println(result);
//    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("\t\tMenu\n1.\tAddition\n2.\tSubtraction\n3.\tMultiply\n4.\tDivide\n5.\tModulo");
        System.out.print("\nEnter your choice =>\t");
        int operation = input.nextInt();
        System.out.print("Enter first Number =>\t");
        int a =input.nextInt();
        System.out.print("Enter second Number =>\t");
        int b =input.nextInt();
        if(operation==1){
            int sum = a+b;
            System.out.println(sum);
        }else if(operation==2){
            int sub = a-b;
            System.out.println(sub);
        }else if(operation==3){
            int multi = a*b;
            System.out.println(multi);
        }else if(operation==4){
            double div = a/(double)b;
            System.out.println(div);
        }else if(operation==5){
            int mod = a%b;
            System.out.println(mod);
        }else{
            System.out.println("Wrong Operation");
        }
    }
}
