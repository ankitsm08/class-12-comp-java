1. Input the Sentence:
   - Read a sentence from the user using the Scanner class.
   - The sentence must be in uppercase and can only end with '.', '?', or '!' to be considered valid.

2. Validate the Sentence:
   - Use the isValidString() function to check the following conditions:
     - The sentence should not be null or empty.
     - The last character must be either '.', '?', or '!'.
   - If the sentence does not meet these conditions, print "INVALID INPUT" and terminate the program.

3. Print the Original Sentence:
   - If the sentence is valid, print the original sentence.

4. Remove the Terminating Character:
   - Remove the last character ('.', '?', or '!') from the input sentence for further processing.

5. Split the Sentence into Words:
   - Split the sentence into words using space (" ") as the delimiter.

6. Sort the Words:
   - Sort the words by their length in ascending order.
   - If two words have the same length, sort them alphabetically.
   - The sortString() function handles the sorting using a modified bubble sort approach and the swap() function to swap words.

7. Concatenate the Sorted Words:
   - After sorting, concatenate the words back into a single sentence with a space between each word.

8. Print the Sorted Sentence:
   - Display the sentence with words arranged based on the sorting criteria.
