import java.util.Scanner;

public class dynamicarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Reading array size from the user
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            // Allocating array dynamically
            int[] arr = new int[size];

            System.out.println("Array of size " + size + " created successfully!");

        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative!");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }

        sc.close();
    }
}