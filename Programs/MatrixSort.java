package Programs;

import java.util.Scanner;

public class MatrixSort {

  // Computes and prints the sum of the diagonal elements in the matrix
  public static void computePrintDiagonalSum(int[][] matrix, int m) {
    int sum = 0;
    System.out.println("DIAGONAL ELEMENTS");
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < m; j++) {
        if (i == j || i + j == m - 1) {
          sum += matrix[i][j];
          System.out.print(matrix[i][j] + "\t");
        } else {
          System.out.print("\t");
        }
      }
      System.out.println();
    }
    System.out.println("SUM OF THE DIAGONAL ELEMENTS = " + sum);
  }

  // Prints the matrix in a tabular format
  public static void printMatrix(int[][] matrix, int m) {
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix[i][j] + "\t");
      }
      System.out.println();
    }
  }

  // Sorts the non-boundary elements of the matrix in ascending order
  public static void sortNonBoundaryMatrix(int[][] matrix, int m) {

    int[] temp = new int[(m - 2) * (m - 2)];
    int k = 0;
    for (int i = 1; i < m - 1; i++) {
      for (int j = 1; j < m - 1; j++) {
        temp[k++] = matrix[i][j];
      }
    }

    for (int i = 0; i < k - 1; i++) {
      for (int j = 0; j < k - i - 1; j++) {
        if (temp[j] > temp[j + 1]) {
          int t = temp[j];
          temp[j] = temp[j + 1];
          temp[j + 1] = t;
        }
      }
    }

    k = 0;
    for (int i = 1; i < m - 1; i++) {
      for (int j = 1; j < m - 1; j++) {
        matrix[i][j] = temp[k++];
      }
    }
  }
  
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("ENTER MATRIX SIZE (M): ");
    int m = in.nextInt();

    if (m <= 3 || m >= 10) {
      System.out.println("THE MATRIX SIZE IS OUT OF RANGE.");
      in.close();
      return;
    }

    int[][] matrix = new int[m][m];

    System.out.println("ENTER ELEMENTS OF MATRIX");
    for (int i = 0; i < m; i++) {

      for (int j = 0; j < m; j++) {
        matrix[i][j] = in.nextInt();
        // Only positive integers should be enetered
        if (matrix[i][j] < 0) {
          System.out.println("INVALID INPUT");
          in.close();
          return;
        }
      }
    }

    in.close();

    System.out.println("ORIGINAL MATRIX");
    printMatrix(matrix, m);

    sortNonBoundaryMatrix(matrix, m);
    System.out.println("REARRANGED MATRIX");
    printMatrix(matrix, m);

    computePrintDiagonalSum(matrix, m);
  }
}

