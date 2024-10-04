# Question:

Write a program to accept a sentence which may be terminated by either `.`, `?` or `!` only. The words are to be separated by a single blank space and are in uppercase.

## Perform the following tasks:

- **(a)** Check for the validity of the accepted sentence.

- **(b)** Convert the non-palindrome words of the sentence into palindrome words by concatenating the word by its reverse (excluding the last character).

    **Example:**  
    The reverse of the word HELP would be LEH (omitting the last alphabet) and by concatenating both, the new palindrome word is HELPLEH. Thus, the word HELP becomes HELPLEH.

    **Note:**  
    The words which end with repeated alphabets, for example ABB would become ABBA and not ABBBA and XAZZZ becomes XAZZZAX.

    **Palindrome word:** Spells same from either side.  
    **Example:** DAD, MADAM etc.

- (c) Display the original sentence along with the converted sentence.

## Test your program for the following data and some random data:
 
### Example 1

**INPUT:**  
THE BIRD IS FLYING.

**OUTPUT:**  
THE BIRD IS FLYING.  
THEHT BIRDRIB ISI FLYINGNIYLF

### Example 2

**INPUT:**  
IS THE WATER LEVEL RISING?

**OUTPUT:**  
IS THE WATER LEVEL RISING?  
ISI THEHT WATERETAW LEVEL RISINGNISIR

### Example 3

**INPUT:**  
THIS MOBILE APP LOOKS FINE.

**OUTPUT:**  
THIS MOBILE APP LOOKS FINE.  
THISIHT MOBILELIBOM APPA LOOKSKOOL FINENIF

### Example 4

**INPUT:**  
YOU MUST BE CRAZY#

**OUTPUT:**  
INVALID INPUT
