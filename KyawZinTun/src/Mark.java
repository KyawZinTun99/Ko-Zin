import java.util.Scanner;

class Mark {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Get matrix dimensions
        System.out.println("Enter number of rows (L1):");
        int L1 = s.nextInt();
        System.out.println("Enter number of columns (L2):");
        int L2 = s.nextInt();

        int[][] A = new int[L1][L2];

        // Input values for the matrix
        for (int i = 0; i < L1; i++) {
            for (int j = 0; j < L2; j++) {
                System.out.println("Enter value for position [" + i + "][" + j + "]:");
                A[i][j] = s.nextInt();
            }
        }

        // Display the matrix properly
        System.out.println("\nMatrix values:");
        for (int i = 0; i < L1; i++) {
            for (int j = 0; j < L2; j++) {
                System.out.print(A[i][j] + "\t");  // Print with tab space
            }
            System.out.println();  // New line after each row
        }

        s.close(); // Close Scanner
    }
}
