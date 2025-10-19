import java.util.Scanner;
public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter 6 integers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0], min = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
            if (val < min) min = val;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        sc.close();
    }
}
