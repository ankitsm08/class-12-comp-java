package Programs;

import java.util.Scanner;

public class Perfect {
  // Instance variable
  int num;

  // Parameterized constructor
  Perfect(int nn) {
    num = nn;
  }

  // Recursive method to find the sum of factors of num, excluding itself
  int sum_of_factors(int i) {
    if (i == 0) {
      return 0; // Base case: no more factors to check
    }
    // Add factor to sum if it is a perfect number
    return (num % i == 0 ? i : 0) + sum_of_factors(i - 1);
  }

  // Method to check if the number is perfect
  void check() {
    int sum = sum_of_factors(num - 1); // Exclude the number itself
    System.out.println(num + " is " + 
      (sum == num ? "" : "not ") + "a perfect number.");
  }

  // Main method for testing
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check if it is perfect: ");
    int number = sc.nextInt();
    sc.close();

    // Create an object of Perfect class
    Perfect obj = new Perfect(number);

    // Check if the number is perfect
    obj.check();
  }
}
