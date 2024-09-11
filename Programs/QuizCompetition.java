package Programs;

import java.util.Scanner;

public class QuizCompetition {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("N = ");
    int n = in.nextInt();

    // Input validation: N should be between 4 and 10
    if (n <= 3 || n >= 11) {
      System.out.println("INPUT SIZE OUT OF RANGE.");
      in.close();
      return;
    }

    char[][] answers = new char[n][5];
    char[] key = new char[5];

    // Accept answers for each participant
    for (int i = 0; i < n; i++) {
      System.out.print("Participant " + (i + 1) + ":");
      for (int j = 0; j < 5; j++) {
        answers[i][j] = in.next().charAt(0);
      }
    }

    // Accept the correct answers (Answer Key)
    System.out.print("Key:");
    for (int i = 0; i < 5; i++) {
      key[i] = in.next().charAt(0);
    }

    in.close();

    int[] scores = new int[n];
    int highestScore = 0;

    // Calculate the score for each participant
    System.out.println("Scores:");
    for (int i = 0; i < n; i++) {
      // Initialize the score for each participant
      scores[i] = 0;
      for (int j = 0; j < 5; j++) {
        if (answers[i][j] == key[j]) {
          scores[i]++;
        }
      }

      if (scores[i] > highestScore) {
        highestScore = scores[i];
      }

      System.out.println("Participant " + (i + 1) + " = " + scores[i]);
    }

    // Find and display participants with the highest score
    System.out.println("Highest Score:");
    for (int i = 0; i < n; i++) {
      if (scores[i] == highestScore) {
        System.out.println("Participant " + (i + 1));
      }
    }
  }
}
