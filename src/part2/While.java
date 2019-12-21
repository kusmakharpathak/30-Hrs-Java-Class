package part2;
import part1.Check;

import java.util.Scanner;

public class While {
    public static void main(String[] args){
        int i =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        while(true){
            String num = sc.next();
            if(!Check.isNumber(num)){
                if(i>1){
                    System.out.println("Sorry");
                    break;
                }else{
                    System.out.println("Enter a number again\nYou have "+(2-i)+" Chance");
                    i++;
                }
            }else if (Integer.parseInt(num) % 2 == 0) {
                System.out.println(num + " Even Number");
                break;
            } else {
                System.out.println(num + " Odd number");
                break;
            }
        }
    }
}
