import java.util.Scanner;
class Minofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int min = (a < b && a < c) ? a : (b < c ? b : c);
        System.out.println("Minimum: " + min);
    }
}
