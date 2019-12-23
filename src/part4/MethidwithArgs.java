package part4;

public class MethidwithArgs {

    public static void add(int num1, int num2){
        int sum = num1+num2;
        System.out.println(sum);
    }

    public static int Add(int a, int b){
        return a+b;
    }

    public static void main(String[] args){
//        Non return type method calling
        add(5, 10);
//          Return type method calling
        System.out.println(Add(5,10));
    }
}
