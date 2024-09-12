package Programs;

import java.util.Scanner;

public class Special {

  // Data member to store the number
  int n;

  // Default constructor to initialize n
  Special() {
    n = 0;
  }

  // Method to accept the number from the user
  void read() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    this.n = sc.nextInt();
    sc.close();
  }

  // Recursive method to calculate factorial of a number
  int factorial(int x) {
    if (x == 0 || x == 1) {
      return 1;
    } else {
      return x * factorial(x - 1);
    }
  }

  // Method to check if the number is a Special number
  boolean isSpecial() {
    // Copy of the number to extract digits
    int temp = n;
    int sum = 0;

    // Loop to calculate sum of factorials of digits
    while (temp > 0) {
      int digit = temp % 10;
      // Add the factorial of the digit to sum
      sum += factorial(digit);
      temp /= 10;
    }

    // If sum equals the original number, it's Special
    return sum == n;
  }

  // Method to display the result
  void display() {
    System.out.println(n + " is " +
      (this.isSpecial() ? "" : "not ") + "a Special number.");
  }

  // Main method to execute the program
  public static void main(String[] args) {
    // Create an object of the Special class
    Special obj = new Special();

    obj.read();

    obj.display();
  }
}
