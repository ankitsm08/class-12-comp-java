package Programs;

import java.util.Scanner;

public class Banner {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    // Input number of teams (n)
    System.out.print("ENTER THE VALUE OF N: ");
    int n = in.nextInt();
    in.nextLine(); // Clear the buffer

    in.close();

    // Check if the number of teams is within the valid range
    if (n <= 2 || n >= 9) {
      System.out.println("INVALID INPUT");
      return;
    }

    // Initialize array to store team names
    String[] teams = new String[n];
    int highLen = 0;

    // Input team names
    for (int i = 0; i < n; i++) {
      System.out.print("Team " + (i + 1) + ": ");
      teams[i] = in.nextLine();

      // Track the length of the longest team name
      if (teams[i].length() > highLen) {
        highLen = teams[i].length();
      }
    }

    // Print teams vertically, side by side with tab separation
    for (int i = 0; i < highLen; i++) {
      for (int j = 0; j < n; j++) {
        int len = teams[j].length();
        if (i >= len) {
          // If the current character index exceeds the team name length, print space with
          // tab
          System.out.print(" \t");
        } else {
          // Print the i-th character of the team name with tab separation
          System.out.print(teams[j].charAt(i) + "\t");
        }
      }
      // Move to the next line after printing one row of characters
      System.out.println();
    }
  }
}
