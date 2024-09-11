package Programs;

import java.util.Scanner;

public class PrimeAdam {

  // Function to reverse a number
  public static int reverse(int num) {
    int rev = 0;
    while (num > 0) {
      rev = rev * 10 + num % 10;
      num /= 10;
    }
    return rev;
  }

  // Function to check if a number is prime
  public static boolean isPrime(int num) {
    if (num < 2)
      return false;
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0)
        return false;
    }
    return true;
  }

  // Function to check if a number is an Adam number
  public static boolean isAdam(int num) {
    int rev = reverse(num);
    return num * num == reverse(rev * rev);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Input m and n
    System.out.print("Enter m: ");
    int m = sc.nextInt();
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    sc.close();

    // Check for invalid input
    if (m > n) {
      System.out.println("INVALID INPUT");
      return;
    }

    System.out.println("THE PRIME-ADAM INTEGERS ARE:");

    int count = 0;
    // Loop through the range [m, n]
    for (int i = m; i <= n; i++) {
      // Check if number is prime and Adam and print it
      if (isPrime(i) && isAdam(i)) {
        count++;
        System.out.print(i + " ");
      }
    }

    // Output the results
    if (count == 0) {
      System.out.println("NIL");
    }
    System.out.println("\nFREQUENCY OF PRIME-ADAM INTEGERS IS: " + count);
  }
}
