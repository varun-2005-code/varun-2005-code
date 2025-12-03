import java.util.Scanner;

public class modulusoperation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Reading numbers from user
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();

            // Performing modulus
            int result = num1 % num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot perform modulus operation because the second number is zero.");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter valid numbers.");
        }

        sc.close();
    }
}