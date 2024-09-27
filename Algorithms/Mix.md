1. Initialize Variables:
   - Define the class Mix with two instance variables: wrd (to store the word) and len (to store the length of the word).
   - Create a constructor to initialize wrd and len with default values.

2. Feed Word:
   - In the feedword() method, accept a word in uppercase and assign it to wrd.
   - Calculate and store the length of the word in len.

3. Mix Word:
   - Define the mix_word() method which takes two Mix objects (P and Q) as parameters.
   - Loop through the characters of both words:
     - Add one character from P.wrd followed by one character from Q.wrd to the resultant word.
   - If the words are of different lengths, append the remaining characters of the longer word.
   - Store the resultant word in the current object.

4. Display:
   - Define the display() method to print the mixed word.
