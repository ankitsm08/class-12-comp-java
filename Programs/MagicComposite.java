
package Programs;

import java.util.Scanner;

public class MagicComposite {

  // Function to check if a number is composite
  public static boolean isComposite(int num) {
    int num_sqrt = (int) Math.sqrt(num);
    for (int i = 2; i <= num_sqrt; i++) {
      if (num % i == 0) {
        return true;
      }
    }
    return false;
  }

  // Function to check if a number is magic
  public static boolean isMagic(int num) {
    while (num > 9) {
      num = sumOfDigits(num); // Reduce to the sum of digits
    }
    return num == 1;
  }

  // Helper function to calculate the sum of digits of a number
  public static int sumOfDigits(int num) {
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Input the range (m and n)
    System.out.print("Enter the lower bound (m): ");
    int m = sc.nextInt();
    System.out.print("Enter the upper bound (n): ");
    int n = sc.nextInt();
    sc.close();

    System.out.println("Magic Composite numbers between " + m + " and " + n + " are:");

    // Iterate through all numbers in the range [m, n]
    for (int i = m; i <= n; i++) {
      if (isComposite(i) && isMagic(i)) {
        System.out.println(i); // Print if the number is both composite and magic
      }
    }
  }
}