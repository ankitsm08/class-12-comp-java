package Programs;

import java.util.Scanner;

public class Adder {

   // Array to store hours (a[0]) and minutes (a[1])
  int[] time = new int[2];

  // Constructor to initialize hours and minutes to 0
  public Adder() {
    time[0] = 0; // hours
    time[1] = 0; // minutes
  }

  // Method to read and split time input (HH:MM) into hours and minutes
  public void readtime(String input) {
    String[] timeParts = input.split(":");
    time[0] = Integer.parseInt(timeParts[0]); // hours
    time[1] = Integer.parseInt(timeParts[1]); // minutes

    if (time[0] < 0 || time[0] > 23 ||
        time[1] < 0 || time[1] > 59) {

      System.out.println("Invalid time input");
      System.exit(0);
    }
  }

  // Method to add time from two Adder objects
  public void addtime(Adder X, Adder Y) {
    int hoursSum = X.time[0] + Y.time[0];
    int minutesSum = X.time[1] + Y.time[1];

    if (minutesSum >= 60) {
      hoursSum += minutesSum / 60;
      minutesSum = minutesSum % 60;
    }

    if (hoursSum >= 24) {
      hoursSum = hoursSum % 24;
    }

    this.time[0] = hoursSum;
    this.time[1] = minutesSum;
  }

  // Method to display the time in hours and minutes
  public void disptime() {
    System.out.println("hours = " + time[0] + ", minutes = " + time[1]);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Adder time1 = new Adder();
    Adder time2 = new Adder();
    Adder sumTime = new Adder();

    System.out.print("Enter the first time (HH:MM): ");
    time1.readtime(sc.nextLine());
    System.out.print("Enter the second time (HH:MM): ");
    time2.readtime(sc.nextLine());

    sumTime.addtime(time1, time2);

    System.out.println("The sum of the two times is:");
    sumTime.disptime();

    sc.close();
  }
}
