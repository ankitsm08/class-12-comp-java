1. Input plain text: 
   - Read a string (plain text) from the user.

2. Check text length: 
   - Ensure the length of the text is greater than 3 and less than 100. If not, display "INVALID LENGTH" and terminate.

3. Initialize result string: 
   - Prepare an empty string to store the encrypted text.

4. Loop through each character in the plain text:
   - If the character is an uppercase letter between 'A' and 'M' or lowercase between 'a' and 'm', add 13 to its ASCII value.
   - If the character is an uppercase letter between 'N' and 'Z' or lowercase between 'n' and 'z', subtract 13 from its ASCII value.
   - If the character is not a letter (non-alphabetic), leave it unchanged.

5. Store encrypted characters: 
   - Append each processed character to the result string.

6. Output the cipher text: 
   - Print the final encrypted string.
