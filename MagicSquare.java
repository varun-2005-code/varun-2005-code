import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        
        // Reading the matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Calculate the magic sum (sum of first row)
        int magicSum = 0;
        for (int j = 0; j < n; j++) {
            magicSum += matrix[0][j];
        }
        
        boolean isMagic = true;
        
        // Check all rows
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                isMagic = false;
                break;
            }
        }
        
        // Check all columns
        for (int j = 0; j < n && isMagic; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicSum) {
                isMagic = false;
                break;
            }
        }
        
        // Check main diagonal
        int diag1 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += matrix[i][i];
        }
        if (diag1 != magicSum) {
            isMagic = false;
        }
        
        // Check secondary diagonal
        int diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag2 += matrix[i][n - 1 - i];
        }
        if (diag2 != magicSum) {
            isMagic = false;
        }
        
        // Output result
        if (isMagic)
            System.out.println("Magic Square");
        else
            System.out.println("Not a Magic Square");
        
        sc.close();
    }
}