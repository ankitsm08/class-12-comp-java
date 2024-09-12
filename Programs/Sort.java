package Programs;

import java.util.Scanner;

public class Sort {
  String sentence;
  String words[];
  String sortedSentence;

  Sort() {
    sentence = "";
    sortedSentence = "";
  }

  void readSentence() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    sentence = sc.nextLine();
    sc.close();
    words = sentence.split(" ");
  }

  String sortWord(String word) {
    char[] temp = word.toCharArray();
    int n = temp.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (temp[j] > temp[j + 1]) {
          char swap = temp[j];
          temp[j] = temp[j + 1];
          temp[j + 1] = swap;
        }
      }
    }
    return new String(temp);
  }

  void arrangeWords() {
    for (int i = 0; i < words.length; i++) {
      words[i] = sortWord(words[i].toLowerCase());
    }

    for (int i = 0; i < words.length - 1; i++) {
      for (int j = 0; j < words.length - i - 1; j++) {
        if (words[j].compareTo(words[j + 1]) > 0) {
          String swap = words[j];
          words[j] = words[j + 1];
          words[j + 1] = swap;
        }
      }
    }

    sortedSentence = String.join(" ", words);
  }

  void display() {
    System.out.println("Original Sentence: " + sentence);
    System.out.println("Sorted Sentence (Words and Characters): " + sortedSentence);
  }

  public static void main(String[] args) {
    Sort sorter = new Sort();
    sorter.readSentence();
    sorter.arrangeWords();
    sorter.display();
  }
}

