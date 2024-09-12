package Programs;

import java.util.Scanner;

public class VowelWord {

  public static boolean isVowel(char ch) {
    ch = Character.toUpperCase(ch);
    return (ch == 'A' || ch == 'E' ||
      ch == 'I' || ch == 'O' || ch == 'U');
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("ENTER THE SENTENCE:");
    String ipStr = in.nextLine().trim().toUpperCase();
    int len = ipStr.length();
    in.close();

    // Check for valid sentence termination
    char lastChar = ipStr.charAt(len - 1);
    if (lastChar != '.' &&
        lastChar != '?' &&
        lastChar != '!') {
      
      System.out.println("INVALID INPUT");
      return;
    }
    // Remove the punctuation mark from the end of the sentence
    String str = ipStr.substring(0, len - 1).trim();

    // Initialize variables for processing
    String vowelsWords = "";
    String otherWords = "";
    int count = 0;

    // Split the sentence into words manually
    int start = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ' || i == str.length() - 1) {
        String word;
        if (i == str.length() - 1) {
          word = str.substring(start);
        } else {
          word = str.substring(start, i);
        }
        if (!word.isEmpty()) {
          // Check if the word starts and ends with a vowel
          int wordLen = word.length();
          if (isVowel(word.charAt(0)) &&
              isVowel(word.charAt(wordLen - 1))) {
            count++;
            vowelsWords += word + " ";
          } else {
            otherWords += word + " ";
          }
        }
        start = i + 1; // Move to the next word
      }
    }

    // Construct the new string
    String newStr = (vowelsWords + otherWords).trim();

    // Output results
    System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = " + count);
    System.out.println(newStr);
  }
}

