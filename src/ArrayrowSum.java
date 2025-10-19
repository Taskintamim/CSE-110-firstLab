import java.util.Scanner;
public class ArrayrowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];

        System.out.println("Enter 12 integers for a 3x4 array:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++)
                arr[i][j] = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++)
                rowSum += arr[i][j];
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }
        sc.close();
    }
}
