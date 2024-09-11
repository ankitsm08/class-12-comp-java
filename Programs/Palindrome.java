package Programs;

import java.util.Scanner;

public class Palindrome {

  // Function to check if a word is a palindrome
  public static boolean isPalindrome(String word) {
    int len = word.length();
    for (int i = 0; i < len / 2; i++) {
      if (word.charAt(i) != word.charAt(len - 1 - i)) {
        return false;
      }
    }
    return true;
  }

  // Function to make a word palindrome by reversing it, excluding the last
  // character
  public static String makePalindrome(String word) {
    int len = word.length();
    char lastChar = word.charAt(len - 1);
    int i = len - 1;

    // Find the first character from the end that is not equal to the last character
    while (i > 0 && word.charAt(i) == lastChar) {
      i--;
    }

    // Create the palindrome by appending the reverse (up to character i)
    String result = word;
    for (int j = i; j >= 0; j--) {
      result += word.charAt(j);
    }

    return result;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("ENTER THE SENTENCE:");
    String ipStr = in.nextLine().trim().toUpperCase();
    int len = ipStr.length();
    in.close();

    // Check if the input sentence ends with '.', '?', or '!'
    char lastChar = ipStr.charAt(len - 1);
    if (lastChar != '.' && lastChar != '?' && lastChar != '!') {
      System.out.println("INVALID INPUT");
      return;
    }

    // Remove the punctuation at the end
    String str = ipStr.substring(0, len - 1);

    // Split the sentence into words based on spaces
    String[] words = str.split(" ");
    String result = "";

    for (int i = 0; i < words.length; i++) {
      String word = words[i];

      // If the word is already a palindrome, keep it as is
      result += (isPalindrome(word) ? word : makePalindrome(word)) + " ";
    }

    // Output the original sentence with punctuation then result
    System.out.println("\n" + ipStr);
    System.out.println(result);
  }
}
