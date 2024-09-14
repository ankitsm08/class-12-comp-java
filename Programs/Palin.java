package Programs;

import java.util.Scanner;

public class Palin {

  // Data Members
  int num;
  int revnum;
  int sumDigits;

  // Constructor to initialize the instance variables
  public Palin() {
    num = 0;
    revnum = 0;
    sumDigits = 0;
  }

  // Method to accept a number from the user
  public void accept() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive number: ");
    num = sc.nextInt();
    sc.close();
  }

  // Recursive method to reverse the number
  public int reverse(int y) {
    if (y == 0) {
      return 0;
    } else {
      int lastDigit = y % 10;
      revnum = revnum * 10 + lastDigit;
      reverse(y / 10);
      return revnum;
    }
  }

  // Recursive method to sum the digits of the number
  public int sumOfDigits(int x) {
    if (x == 0) {
      return 0;
    } else {
      int lastDigit = x % 10;
      sumDigits += lastDigit;
      sumOfDigits(x / 10);
      return sumDigits;
    }
  }

  // Method to check if the number is a palindrome and sum of digits is even
  public void check() {
    revnum = 0;
    sumDigits = 0;

    int reversed = reverse(num);
    int sum = sumOfDigits(num);

    if (num == reversed) {
      System.out.println(num + " is a palindrome.");
      System.out.println("The sum of its digits (" + sum + ") is " +
                         (sum % 2 == 0 ? "even" : "odd") + ".");
    } else {
      System.out.println(num + " is not a palindrome.");
    }
  }

  public static void main(String[] args) {
    Palin palinObj = new Palin();
    palinObj.accept();
    palinObj.check();
  }
}
