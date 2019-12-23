package part4;

import java.util.Scanner;

public class CalcUsingMethods {
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }

    public static int mul(int a, int b){
        return a*b;
    }

    public static int div(int a, int b){
        return a/b;
    }

    public static int mod(int a, int b){
        return a%b;
    }

    public static void Display(char operation, int a, int b) {
        switch (operation) {
            case '+':
                System.out.println(add(a, b));
                break;
            case '-':
                System.out.println(sub(a, b));
                break;
            case '*':
                System.out.println(mul(a, b));
                break;
            case '/':
                System.out.println(div(a, b));
                break;
            default:
                System.out.println("error");
        }


    }

    public static void main(String[] args){
        int a =10;
        int b = 5;
        Scanner sc = new Scanner(System.in);
        char operation = sc.next().charAt(0);
        Display(operation, a, b);
    }

}
