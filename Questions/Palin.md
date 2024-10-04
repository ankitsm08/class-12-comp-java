# Question:

A class Palin has been defined to check whether a positive number is a palindrome. Additionally, the class checks if the sum of the digits of the palindrome number is an even number. The number `N` is a palindrome if the original number and its reverse are the same.

## Some of the members of the class are given below:

### Class name:
**Palin**

### Data members (instance variables):

- num : An integer to store the original number.
- Revnum : An integer to store the reverse of the number.
- sumDigits : An integer to store the sum of the digits of the original number.

### Methods/Member functions:

- **Palin()** : Constructor to initialize `num`, `revnum`, and `sumDigits` with legal initial values.

- **void accept()** : To accept the number using user input.

- **int reverse(int y)** : Recursively reverses the parameterized argument `y` and stores it in `revnum`.

- **int sumOfDigits(int x)** : Recursively calculates the sum of digits of the number `x` and stores it in `sumDigits`.

- **void check()** : Checks whether the number is a palindrome by invoking `reverse()` and then checks if the sum of its digits is even by invoking `sumOfDigits()`. Displays the appropriate messages.
