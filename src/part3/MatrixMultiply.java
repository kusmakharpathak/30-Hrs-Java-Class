package part3;

import java.util.Scanner;

public class MatrixMultiply {
    public static void main(String[] args){
        int [][] a = new int[3][3];
        int [][] b = new int[3][3];
        int [][] c = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for matrix A");
        for(int i=0; i<3; i++){
            for(int j=0; j<3;j++){
                a[i][j] =sc.nextInt();
            }
        }
        System.out.println("Enter a value for matrix B");
        for(int i=0; i<3; i++){
            for(int j=0; j<3;j++){
                b[i][j] =sc.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3;j++){
                c[i][j] = 0;
                for(int k=0; k<3; k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3;j++){
                System.out.print(c[i][j]+"\t");
            }
            System.out.print("\n");
        }



    }
}
