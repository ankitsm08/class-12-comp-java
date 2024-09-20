package Programs;

import java.util.Scanner;

public class MatRev {
  // Instance variables
  private int[][] arr; // To store the integer elements of the matrix
  private int m, n; // To store the number of rows and columns

  // Parameterized constructor to initialize m, n and the array
  public MatRev(int mm, int nn) {
    m = mm;
    n = nn;
    arr = new int[m][n]; // Initialize the array with the given dimensions
  }

  // Method to fill the array with user inputs
  public void fillarray() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the elements of the matrix (" + m + "x" + n + "):");
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          arr[i][j] = sc.nextInt();
        }
      }
    }
  }

  // Method to reverse a number
  public int reverse(int x) {
    int rev = 0;
    while (x != 0) {
      rev = rev * 10 + x % 10; // Add the last digit to rev
      x /= 10; // Remove the last digit from x
    }
    return rev;
  }

  // Method to reverse each element of the matrix of the given object P
  public void revMat(MatRev P) {
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = reverse(P.arr[i][j]);
        // Reverse each element and store it
      }
    }
  }

  // Method to display the matrix in a formatted way
  public void show() {
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println(); // Move to the next line after each row
    }
  }

  // Main method to demonstrate the functionality
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Create the first matrix object
    System.out.print("Enter the number of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter the number of columns: ");
    int cols = sc.nextInt();

    MatRev original = new MatRev(rows, cols);
    original.fillarray(); // Fill the original matrix

    sc.close();

    // Create a second matrix object to store reversed elements
    MatRev reversed = new MatRev(rows, cols);
    reversed.revMat(original); // Reverse the elements of the original matrix

    // Display the original and reversed matrices
    System.out.println("Original Matrix:");
    original.show();

    System.out.println("Reversed Matrix:");
    reversed.show();
  }
}
