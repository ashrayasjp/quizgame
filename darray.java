package arrays;

import java.util.Scanner;

public class darray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = new int[2][2];
        System.out.println("Enter array elements of 1st matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = scanner.nextInt();

            }
        }
        System.out.println("The matrix is :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}