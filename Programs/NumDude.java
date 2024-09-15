package Programs;

import java.util.Scanner;

public class NumDude {
  // Instance variable
  private int num;

  public NumDude() {
    num = 0;
  }

  // Method to accept a positive integer number
  public void input() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    num = sc.nextInt();
    if (num <= 0) {
      System.out.println("Invalid input! Please enter a positive integer.");
      input(); // Recur to get a valid input
    } else sc.close();
  }

  // Recursive method to calculate the sum of digits
  public int sumDigits(int x) {
    if (x == 0) return 0;
    return (x % 10) + sumDigits(x / 10);
  }

  // Method to check if the number is a Dudeney number
  public void isDude() {
    int sum = sumDigits(num);
    int sumCubed = sum * sum * sum;

    System.out.println(num + " is " + 
      (sumCubed == num ? "" : "NOT ") + "a Dudeney number.");
  }

  public static void main(String[] args) {
    NumDude numDude = new NumDude();
    numDude.input();
    numDude.isDude();
  }
}
