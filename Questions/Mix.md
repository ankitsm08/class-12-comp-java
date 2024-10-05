# Question:

A class `Mix` has been defined to mix two words, character by character, in the following manner:

The first character of the first word is followed by the first character of the second word and so on. If the words are of different length, the remaining characters of the longer word are put at the end.

## Example:

If the First word is “JUMP” and the second word is “STROLL”, then the required word will be “JSUTMRPOLL”

## Some of the members of the class are given below:

### Class name:
**Mix**

### Data member/instance variable:

- `wrd` : To store a word
- `len` : To store the length of the word

### Member functions/methods:

- **Mix()** : Default constructor to initialize the data members with legal initial values.

- **void feedword()** : To accept the word in UPPER case.

- **void mix_word(Mix P, Mix Q)** : Mixes the words of objects P and Q as stated above and stores the resultant word in the current object.

- **void display()** : Displays the word.
