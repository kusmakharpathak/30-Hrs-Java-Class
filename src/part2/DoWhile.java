package part2;//import java.util.Scanner;
//
//public class DoWhile {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int pin = 0;
//        int count=0;
//        System.out.println("Enter a pin");
//        do{
////            pin = input.nextInt();
//            if(count<3){
//                System.out.println("Count = "+count);
//                System.out.println("Enter your pin number again");
//                pin = input.nextInt();
//                count++;
//
//            }else {
//                System.out.println("Blocked");
//                break;
//            }
//
//        }while(pin != 123);
//        if(pin == 123) {
//            int balance = 1000000;
//            System.out.println("Welcome to sunrise");
//            System.out.println("1. Deposit\n2. Withdraw\n3. Balance");
//            int choice = input.nextInt();
//            if(choice == 1){
//                System.out.println("Enter a amount you want to deposit");
//                int amount = input.nextInt();
//                int updateBalance = balance+amount;
//                System.out.println("Your balance was "+balance+"\nYour new balance is "+updateBalance);
//            }else if(choice == 2){
//                System.out.println("Enter a amount you want to withdraw");
//                int amount = input.nextInt();
//                int updateBalance = balance-amount;
//                System.out.println("Your balance was "+balance+"\nYour new balance is "+updateBalance);
//
//            }else if(choice == 3){
//                System.out.println("Your Balance is "+balance);
//            }else{
//                System.out.println("Sorry You have entered a wrong option");
//            }
//        }
//    }
//}
