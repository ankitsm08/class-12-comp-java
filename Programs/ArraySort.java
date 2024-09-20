package Programs;

import java.util.Scanner;

public class ArraySort {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    // Input number of rows (m) and columns (n)
    System.out.print("ENTER THE VALUE OF M: ");
    int m = in.nextInt();
    System.out.print("ENTER THE VALUE OF N: ");
    int n = in.nextInt();

    // Check if matrix size is valid
    if (m <= 2 || m >= 10 || n <= 2 || n >= 10) {
      System.out.println("MATRIX SIZE OUT OF RANGE.");
      in.close();
      return;
    }

    // Initialize matrix
    int[][] a = new int[m][n];

    // Input matrix elements
    System.out.println("ENTER ELEMENTS OF MATRIX:");
    for (int i = 0; i < m; i++) {
      System.out.println("ENTER ELEMENTS OF ROW " + (i + 1) + ":");
      for (int j = 0; j < n; j++) {
        a[i][j] = in.nextInt();
      }
    }

    in.close();

    // Display the original matrix
    System.out.println("ORIGINAL MATRIX");
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }

    // Sorting each row using bubble sort
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n - 1; j++) {
        for (int k = 0; k < n - j - 1; k++) {
          if (a[i][k] > a[i][k + 1]) {
            // Swap a[i][k] and a[i][k + 1]
            int t = a[i][k];
            a[i][k] = a[i][k + 1];
            a[i][k + 1] = t;
          }
        }
      }
    }

    // Display matrix after sorting rows
    System.out.println("MATRIX AFTER SORTING ROWS");
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}
