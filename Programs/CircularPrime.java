package Programs;

import java.util.Scanner;

public class CircularPrime {
  // Method to check if number is prime
  public static boolean isPrime(int num) {
    int numSqrt = (int) Math.sqrt(num);

    for (int i = 1; i <= numSqrt; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  // Method to check the number of digits
  public static int getDigitCount(int num) {
    int digitCount = 0;

    while (num != 0) {
      digitCount++;
      num /= 10;
    }
    return digitCount;
  }

  // Main method of the class circular prime
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("N = ");
    int n = in.nextInt();
    in.close();

    if (n <= 0) {
      System.out.println("INVALID INPUT.");
      return;
    }

    // Check if the number is a circular prime
    boolean isCircularPrime = true;
    int digitCount = getDigitCount(n);
    int divisor = (int) (Math.pow(10, digitCount - 1));
    int n2 = n;

    for (int i = 0; i < digitCount; i++) {
      System.out.println(n2);

      if (!isPrime(n2)) {
        isCircularPrime = false;
        break;
      }

      // Rotate the number to its right
      int t1 = n2 / divisor;
      int t2 = n2 % divisor;
      n2 = t2 * 10 + t1;
    }

    System.out.println(n + " IS " + (isCircularPrime ? "" : "NOT ") + "A CIRCULAR PRIME");
  }
}

