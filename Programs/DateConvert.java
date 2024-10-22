package Programs;

import java.util.Scanner;

public class DateConvert {
  // Instance variables
  int n, d, m, y;

  // Constructor to initialize data members
  DateConvert() {
    n = 0; d = 0; m = 0; y = 0;
  }

  // Method to accept day number and year
  void accept() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the day number: ");
    n = sc.nextInt();
    System.out.print("Enter the year: ");
    y = sc.nextInt();

    // If n is positive, we move forward through the years
    if (n > 0) {
      while (n > (isLeapYear(y) ? 366 : 365)) {
        n -= isLeapYear(y) ? 366 : 365;
        y++; // Move to the next year
      }
    } 
    // If n is negative, we move backwards through the years
    else if (n < 0) {
      while (n < 1) {
        n += isLeapYear(y) ? 366 : 365;
        y--; // Move to the previous year
      }
    }

    sc.close();
  }

  // Method to check if the year is a leap year
  boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  }

  // Method to convert day number to month and date
  void day_to_date() {
    // Days in months for non-leap years and leap years
    int[] daysInMonths = { 31, 28, 31, 30, 31, 30,
                           31, 31, 30, 31, 30, 31 };
    // Update February days if leap year
    daysInMonths[1] += isLeapYear(y) ? 1 : 0;

    // Determine the month and date
    int remainingDays = n;
    // m = 0 -> starting with January
    while (n > daysInMonths[m]) {
      remainingDays -= daysInMonths[m];
      m++;
    }
    // Remaining days is the day of the month
    d = remainingDays;
  }

  // Method to display the date in month name format
  void display() {
    // Month names array
    String[] monthNames = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Display the result
    System.out.println(monthNames[m - 1] + " " + d + ", " + y);
  }

  // Main method to run the program
  public static void main(String[] args) {
    DateConvert obj = new DateConvert();
    obj.accept();
    obj.day_to_date();
    obj.display();
  }
}
