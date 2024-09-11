package Programs;

import java.util.Scanner;

public class CaesarCipher {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter plain text:");
    String str = in.nextLine();
    in.close();

    int len = str.length();
    // Validate length
    if (len <= 3 || len >= 100) {
      System.out.println("INVALID LENGTH");
      return;
    }

    // Initialize an empty string to store cipher text
    String cipher = "";

    // Loop through each character in the plain text
    for (int i = 0; i < len; i++) {
      char ch = str.charAt(i);

      if ((ch >= 'A' && ch <= 'M') || (ch >= 'a' && ch <= 'm')) {
        // Rotate by +13 for A-M or a-m
        cipher += (char) (ch + 13);
      } else if ((ch >= 'N' && ch <= 'Z') || (ch >= 'n' && ch <= 'z')) {
        // Rotate by -13 for N-Z or n-z
        cipher += (char) (ch - 13);
      } else {
        // Leave non-alphabetic characters unchanged
        cipher += ch;
      }
    }

    // Output the encrypted cipher text
    System.out.println("The cipher text is:");
    System.out.println(cipher);
  }
}
