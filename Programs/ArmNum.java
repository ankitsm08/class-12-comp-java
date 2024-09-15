package Programs;

import java.util.Scanner;

public class ArmNum {

  // Instance variables
  int n;
  int l;

  ArmNum(int nn) {
    n = nn;
    // Convert number to string to find its length
    l = String.valueOf(n).length();
  }

  // Recursive method to calculate the sum of digits
  // raised to the power of the length
  int sum_pow(int i) {
    if (i == 0) {
      return 0; // Base case: no more digits to process
    }
    int digit = i % 10;
    // Add digit^l to sum and recurse for remaining digits
    return (int) Math.pow(digit, l) + sum_pow(i / 10);
  }

  // Method to check if the number is an Armstrong number
  void isArmstrong() {
    // get the sum of digits raised to the power of length
    int sum = sum_pow(n);
    System.out.println(n + " is " + 
      (sum == n ? "" : "not ") + "an Armstrong number.");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check if it is an Armstrong number: ");
    int number = sc.nextInt();
    sc.close();

    ArmNum obj = new ArmNum(number);

    obj.isArmstrong();
  }
}
