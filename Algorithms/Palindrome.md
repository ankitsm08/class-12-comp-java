1. Input Validation:
   - Accept a sentence from the user.
   - Convert the sentence to uppercase.
   - Check if the sentence ends with a valid punctuation mark (i.e., ., ?, or !). If not, display "INVALID INPUT" and exit.

2. Process Each Word:
   - Remove the terminating punctuation.
   - Split the sentence into individual words using space as the delimiter.

3. Palindrome Check:
   - For each word, check if it's a palindrome:
     - If a word reads the same forwards and backwards, it’s a palindrome.
   - If the word is not a palindrome, convert it into one by reversing it (excluding the last character) and concatenating it to the original word. Handle words that end with repeated characters specially (i.e., avoid repeating the same character multiple times).

4. Concatenate the Converted Words:
   - Construct a new sentence by joining the converted palindrome words.

5. Display:
   - Display the original sentence and the transformed sentence.
 
