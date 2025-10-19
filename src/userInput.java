import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter second number: ");
        float num2 = sc.nextFloat();
        System.out.println("Sum = " + (num1 + num2));
        System.out.println("Difference = " + (num1 - num2));
        System.out.println("Quotient = " + (num1 / num2));
        sc.close();
    }
}
