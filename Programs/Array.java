package Programs;

import java.util.Scanner;

public class Array {

  // Sorting array using bubble sort
  public static void sortArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int t = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = t;
        }
      }
    }
  }

  // Function to fill matrix b[][] using cyclic shifts
  public static void fillMatrix(int a[], int b[][]) {
    int n = a.length;
    // First row is the sorted array itself
    for (int j = 0; j < n; j++) {
      b[0][j] = a[j];
    }

    // For each row, cyclically shift the previous row left by 1 position
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < n; j++) {
        b[i][j] = b[i - 1][(j + 1) % n]; // Shift elements cyclically
      }
    }
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("ENTER VALUE OF N: ");
    int n = in.nextInt();
    in.close();

    if (n <= 2 || n >= 10) {
      System.out.println("MATRIX SIZE OUT OF RANGE");
      return;
    }

    int a[] = new int[n];
    int b[][] = new int[n][n];

    System.out.println("ENTER ELEMENTS OF SINGLE DIMENSIONAL ARRAY:");
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
    }

    sortArray(a);

    System.out.println("SORTED ARRAY:");
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }

    fillMatrix(a, b);

    System.out.println("\nFILLED MATRIX:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(b[i][j] + " ");
      }
      System.out.println();
    }
  }
}
