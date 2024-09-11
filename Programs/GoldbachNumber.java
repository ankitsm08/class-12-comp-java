package Programs;

import java.util.Scanner;

public class GoldbachNumber {

  // Function to check if a number is prime
  public static boolean isPrime(int num) {
    if (num < 2)
      return false; // Prime numbers are greater than 1
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false; // If divisible by any number other than 1 and itself
      }
    }
    return true; // Prime if not divisible by any number other than 1 and itself
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // Input the value of N
    System.out.print("ENTER THE VALUE OF N: ");
    int n = in.nextInt();
    in.close();

    // Validate if N is within the range and even
    if (n <= 9 || n >= 50) {
      System.out.println("INVALID INPUT. NUMBER OUT OF RANGE.");
      return;
    }

    if (n % 2 != 0) {
      System.out.println("INVALID INPUT. NUMBER IS ODD.");
      return;
    }

    // Output prime pairs
    System.out.println("PRIME PAIRS ARE:");

    // Start checking odd primes starting from 3
    for (int a = 3; a <= n / 2; a += 2) {
      int b = n - a; // Calculate b as the complement of a
      if (isPrime(a) && isPrime(b)) {
        // Print the prime pair
        System.out.println(a + ", " + b);
      }
    }
  }
}
