# Question:

Design a class StringSort which enables multiple words to be sorted in alphabetical order, both within each word and among the words as well. It also allows for case-insensitive sorting.

Additionally, the class should handle a sentence, where each word is first sorted alphabetically, and then the entire sentence is rearranged based on alphabetical order of the words. The class should also provide functionality to handle punctuation and spaces efficiently.

## Class Details:

### Class Name:
**StringSort**

### Data members / instance variables:

- `Sentence` : stores the input sentence as a string
- `words[]` : array of words from the sentence
- `wordLen[]` : an array storing the length of each word
- `sortedSentence` : stores the rearranged sentence with words and characters sorted alphabetically

### Member Functions:

- **StringSort()** : A default constructor to initialize data members with default values.

- **void readSentence()** : Accepts the input sentence from the user and splits it into words.

- **void sortWord(String word)** : A utility function to sort individual words alphabetically using a standard sorting technique.

- **void arrangeWords()** : Sorts each word and then rearranges the words of the sentence in alphabetical order.

- **void display()** : Displays the original sentence along with the fully sorted sentence (characters and words).
