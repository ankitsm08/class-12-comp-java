| Name        | Datatype | Description                                                             |
|-------------|----------|-------------------------------------------------------------------------|
| ipStr       | String   | Input sentence entered by the user, trimmed and converted to uppercase. |
| len         | int      | Length of the input sentence.                                           |
| lastChar    | char     | Last character of the input sentence ('.', '!', or '?').                |
| str         | String   | Sentence excluding the last character (punctuation).                    |
| words[]     | String[] | Array of words obtained by splitting str based on spaces.               |
| isPalinWord | boolean  | Indicates if the current word is a palindrome.                          |
| palinWord   | String   | Palindrome version of the current word.                                 |
| i           | int      | Loop index for iterating over the words and characters.                 |
| result      | String   | Sentence after converting non-palindrome words into palindrome words.   |
