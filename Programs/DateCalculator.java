package Programs;

import java.util.Scanner;

public class DateCalculator {
  // Checks if a year is a leap year.
  public static boolean isLeapYear(int y) {
    return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
  }

  // Computes the date given a day number and year.
  public static String computeDate(int day, int year) {
    int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    String[] monthNames = {
      "JANUARY", "FEBRUARY", "MARCH", "APRIL",
      "MAY", "JUNE", "JULY", "AUGUST",
      "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"
    };

    boolean leap = isLeapYear(year);

    // Adjust for February in leap year
    monthDays[1] += leap ? 1 : 0;

    int i = 0, daySum = 0;
    for (i = 0; i < monthDays.length; i++) {
      daySum += monthDays[i];
      if (daySum >= day) break;
    }
    int date = day + monthDays[i] - daySum;

    return date + getDaySuffix(date) + " " + monthNames[i] + ", " + year;
  }

  // Gets the suffix for a day number (ST, ND, RD, TH).
  public static String getDaySuffix(int day) {
    if (day >= 11 && day <= 13) return "TH";
    switch (day % 10) {
      case 1: return "ST";
      case 2: return "ND";
      case 3: return "RD";
      default: return "TH";
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("DAY NUMBER: ");
    int dayNum = in.nextInt();
    System.out.print("YEAR: ");
    int year = in.nextInt();
    System.out.print("DATE AFTER (N DAYS): ");
    int n = in.nextInt();
    in.close();

    if (dayNum < 1 || dayNum > 366) {
      System.out.println("DAY NUMBER OUT OF RANGE");
      return;
    }
    if (n < 1 || n > 100) {
      System.out.println("DATE AFTER (N DAYS) OUT OF RANGE");
      return;
    }

    // Original date calculation
    String dateStr = computeDate(dayNum, year);

    // Future date calculation
    int nDays = dayNum + n;
    int nYear = year;
    boolean leap = isLeapYear(year);

    if (leap && nDays > 366) {
      nYear = nYear + 1;
      nDays = nDays - 366;
    } else if (!leap && nDays > 365) {
      nYear = nYear + 1;
      nDays = nDays - 365;
    }

    String nDateStr = computeDate(nDays, nYear);

    // Output results
    System.out.println();
    System.out.println("DATE: " + dateStr);
    System.out.println("DATE AFTER " + n + " DAYS: " + nDateStr);
  }
}

