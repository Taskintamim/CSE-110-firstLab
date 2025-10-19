import java.util.Scanner;
public class matrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] sum = new int[2][2];

        System.out.println("Enter 4 elements of matrix A:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter 4 elements of matrix B:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                B[i][j] = sc.nextInt();

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                sum[i][j] = A[i][j] + B[i][j];

        System.out.println("Sum of matrices:");
        for (int[] row : sum) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
