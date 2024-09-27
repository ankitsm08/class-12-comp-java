1. Input N: 
   - Accept the number of participants N (must be between 4 and 10).

2. Validation: 
   - If N is less than 4 or greater than 10, print "INPUT SIZE OUT OF RANGE" and terminate the program.

3. Initialize Arrays:
   - Create a 2D array answers of size N x 5 to store the participants' answers.
   - Create a 1D array key of size 5 to store the correct answers.

4. Accept Answers:
   - For each participant, accept their answers to the 5 questions and store them in the corresponding row of the answers array.

5. Accept Answer Key: 
   - Read the correct answers into the key array.

6. Score Calculation:
   - Initialize an array score to store the marks for each participant.
   - Compare each participant's answers with the answer key. For each correct answer, increment the participant's score.
   - Track the highest score using a variable hScore.

7. Output Scores:
   - Print the score of each participant after calculating it.

8. Determine and Display Highest Score:
   - After scoring all participants, identify and print the participants who have the highest score.
