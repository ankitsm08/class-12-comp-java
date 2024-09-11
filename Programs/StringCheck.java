package Programs;

import java.util.Scanner;

public class StringCheck {

  public static boolean isValidString(String str) {
    int len = str.length();
    char last_ch = str.charAt(len - 1);
    if (
      str == null || len == 0 ||
      (last_ch != '.' && last_ch != '?' && last_ch != '!')
    ) {
      return false;
    }
    return true;
  }

  public static void swap(String[] words, int i, int j) {
    String temp = words[i];
    words[i] = words[j];
    words[j] = temp;
  }

  public static String sortString(String ipStr) {
    String words[] = ipStr.split(" ");
    int wordCount = words.length;

    for (int i = 0; i < wordCount - 1; i++) {
      for (int j = i + 1; j < wordCount; j++) {
        if (words[i].length() > words[j].length() ||
           (words[i].length() == words[j].length() && 
            words[i].compareTo(words[j]) > 0)) {
          
          swap(words, i, j);
        }
      }
    }

    String sorted = "";
    for (int i = 0; i < wordCount - 1; i++) {
      sorted += words[i] + " ";
    }
    sorted += words[wordCount - 1];

    return sorted;
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a sentence:");
    String str = in.nextLine();
    int len = str.length();
    System.out.println();
    in.close();

    if (!isValidString(str)) {
      System.out.println("INVALID INPUT");
      return;
    }

    System.out.println(str);

    // Remove ending character - '.', '?', '!'
    str = str.substring(0, len - 1);

    String sortedStr = sortString(str);

    System.out.println(sortedStr);
  }
}