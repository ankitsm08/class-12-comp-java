package Programs;

import java.util.Scanner;

public class OctalMatrix {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Input M and N values
    System.out.print("Enter number of rows M: ");
    int M = sc.nextInt();
    System.out.print("Enter number of columns N: ");
    int N = sc.nextInt();

    // Check for valid range of M and N
    if (M <= 0 || M >= 10 || N <= 2 || N >= 6) {
      System.out.println("OUT OF RANGE");
      sc.close();
      return;
    }

    // Declare the matrix
    int[][] A = new int[M][N];

    // Input elements for the matrix and validate each element
    for (int i = 0; i < M; i++) {
      System.out.println("Enter elements for row " + (i + 1) + ": ");
      for (int j = 0; j < N; j++) {
        A[i][j] = sc.nextInt();
        // Check if input is a valid octal digit (0-7)
        if (A[i][j] < 0 || A[i][j] > 7) {
          System.out.println("INVALID INPUT");
          return;
        }
      }
    }
    sc.close();

    // Display the filled matrix and compute the decimal equivalent
    System.out.println("FILLED MATRIX\tDECIMAL EQUIVALENT");

    for (int i = 0; i < M; i++) {
      int decimal_value = 0;

      // Display the row and calculate its decimal equivalent
      for (int j = 0; j < N; j++) {
        System.out.print(A[i][j] + "\t");
        decimal_value += A[i][j] * Math.pow(8, N - j - 1);
      }
      System.out.println(decimal_value); // Print the decimal equivalent for the row
    }
  }
}