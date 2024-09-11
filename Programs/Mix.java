package Programs;

import java.util.Scanner;

public class Mix {
  // Instance variables
  String wrd;
  int len;

  // Constructor to initialize default values
  Mix() {
    wrd = "";
    len = 0;
  }

  // Method to accept a word in UPPER case
  void feedword() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the word in UPPER CASE: ");
      wrd = sc.nextLine(); // Accept word
    }
    len = wrd.length(); // Calculate and store length
  }

  // Method to mix words of two objects P and Q
  void mix_word(Mix P, Mix Q) {
    int minLen = Math.min(P.len, Q.len); // Minimum length of the two words
    String result = ""; // To store the mixed word

    // Mix the characters from both words alternately
    for (int i = 0; i < minLen; i++) {
      result += P.wrd.charAt(i); // Add character from P
      result += Q.wrd.charAt(i); // Add character from Q
    }

    // Append remaining characters from the longer word
    if (P.len > Q.len) {
      result += P.wrd.substring(minLen);
    } else if (Q.len > P.len) {
      result += Q.wrd.substring(minLen);
    }

    // Store the result in the current object's wrd variable
    this.wrd = result;
    this.len = result.length();
  }

  // Method to display the mixed word
  void display() {
    System.out.println("The mixed word is: " + wrd);
  }

  // Main method
  public static void main(String[] args) {
    // Create objects for Mix class
    Mix word1 = new Mix();
    Mix word2 = new Mix();
    Mix mixedWord = new Mix();

    // Accept words for word1 and word2
    word1.feedword();
    word2.feedword();

    // Mix the two words
    mixedWord.mix_word(word1, word2);

    // Display the mixed word
    mixedWord.display();
  }
}
