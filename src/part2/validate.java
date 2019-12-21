package part2;

import java.util.Scanner;

public class validate {
    public static void main(String[] args) {
        String password = "Admin";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password");
        String userPassword = sc.next();
//        boolean flag = true;
//        for (int i = 0; i < password.length(); i++) {
//            if (userPassword.charAt(i) != password.charAt(i)) {
//                flag = false;
//            } else {
//                flag = true;
//            }
//        }
//
//        if(!flag){
//            System.out.println("Sorry");
//        }else{
//            System.out.println("Success");
//        }
        if(password.equals(userPassword)){
            System.out.println("Success");
        }else{
            System.out.println("Sorry");
        }

    }
}
