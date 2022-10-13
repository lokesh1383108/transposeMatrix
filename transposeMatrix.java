package rough_practice;

import java.util.Arrays;
import java.util.Scanner;

public class transposeMatrix {
    public static void transpose(int[][] a, int[][] b) {
        int transpose[][] = new int[3][3];
        int transpose1[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = a[j][i];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose1[i][j] = b[j][i];
            }
        }
        int[][] matrixThree = new int[3][3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = 0;
                for (int k = 0; k < 3; k++) {
                    sum = sum + (transpose[i][k] * transpose1[k][j]);
                }
                matrixThree[i][j] = sum;
            }
        }
        System.out.println("Multiplication of Two transposed matrices:- ");
        System.out.println(Arrays.deepToString(matrixThree));

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a ={{1,3,4},{2,4,3},{3,4,5}};
        int[][] b ={{1,1,1},{2,2,2},{3,3,3}};

        transpose(a,b);
    }
}
