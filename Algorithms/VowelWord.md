1. Input the Sentence:
   - Read the sentence from the user in uppercase.
   - Remove any extra spaces at the beginning or end of the sentence.

2. Check Sentence Termination:
   - Ensure the sentence ends with either a period (.), question mark (?), or exclamation mark (!).
   - If it doesn’t end with one of these, print "INVALID INPUT" and stop the program.

3. Remove the Punctuation:
   - Remove the last character (punctuation mark) from the sentence.

4. Initialize Variables:
   - Initialize a counter (count) to keep track of the number of words that start and end with a vowel.

5. Process Each Word:
   - Loop through the sentence and split it manually into words based on spaces.
   - For each word:
     - Check if the first and last characters are vowels.

6. Combine Results:
   - Combine the words starting and ending with a vowel (stored in sbVowel) with the other words (stored in sbOther).

7. Display Results:
   - Print the number of words that start and end with a vowel.
   - Print the sentence with vowel words at the beginning, followed by the remaining words.
