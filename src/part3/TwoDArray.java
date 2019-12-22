package part3;

public class TwoDArray {
    public static void main(String[] args){
//        int[][] a= {{1,2},{1,2}};
//        int sum = 0;
//
//        for(int i=0; i<a.length; i++){
//            for(int j=0; j<a[i].length;j++){
//                sum+=a[i][j];
//                System.out.println(a[i][j]);
//            }
//        }
//        System.out.println(sum);
        int sum=0;
        int[][] a= {{1,2},{3,4}};
        int[][] b= {{5,6},{7,8}};
        int[][] c = new int[2][2];
        for(int i=0; i<2; i++){
            for(int j =0; j<2; j++){
                c[i][j] =0;
                for(int k=0; k<2;k++) {
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }

        for(int i=0; i<2; i++){
            for(int j =0; j<2; j++){
                System.out.println(c[i][j]);
            }
        }
    }
}
