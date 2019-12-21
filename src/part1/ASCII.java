package part1;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a >65 num");
        int choice = input.nextInt();
//        char choice1 = input.next().charAt(0);
//        int ascii_num = choice1;
//        System.out.println(ascii_num);
        if(choice=='A'){
            System.out.println("Success");
        }
    }
}
