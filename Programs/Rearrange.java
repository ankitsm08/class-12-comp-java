package Programs;

import java.util.Scanner;

public class Rearrange {
  
  String wrd;
  String newwrd;

  Rearrange() {
    wrd = "";
    newwrd = "";
  }

  // Method to accept the word in uppercase
  public void readword() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word in UPPER case:");
    wrd = sc.next().toUpperCase();
    sc.close();
  }

  // Method to find and display the frequency of vowels and consonants
  public void freq_vow_con() {
    int vowels = 0, consonants = 0;
    // Loop through the characters of the word
    for (int i = 0; i < wrd.length(); i++) {
      char ch = wrd.charAt(i);
      // Check if the character is a vowel
      if (ch == 'A' || ch == 'E' ||
          ch == 'I' || ch == 'O' || ch == 'U') {
        vowels++;
      } else if (ch >= 'A' && ch <= 'Z') {
        consonants++;
      }
    }
    
    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
  }

  // Method to rearrange the word with vowels first, then consonants
  public void arrange() {
    newwrd = ""; // Reset newwrd
    // Add vowels to newwrd first
    for (int i = 0; i < wrd.length(); i++) {
      char ch = wrd.charAt(i);
      if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        newwrd += ch;
      }
    }
    // Then add consonants to newwrd
    for (int i = 0; i < wrd.length(); i++) {
      char ch = wrd.charAt(i);
      if (!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
        newwrd += ch;
      }
    }
  }

  // Method to display the original word and the rearranged word
  public void display() {
    System.out.println("Original word: " + wrd);
    System.out.println("Rearranged word: " + newwrd);
  }

  public static void main(String[] args) {
    Rearrange obj = new Rearrange();
    obj.readword();
    obj.freq_vow_con();
    obj.arrange();
    obj.display();
  }
}
