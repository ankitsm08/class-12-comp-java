# Question:

A Special number is a number in which the sum of the factorial of its digits is equal to the number.

Design a class Special to check if the given number is a Special number or not. 

## Example:

$145 = 1! + 4! + 5!$  
Thus, 145 is a special number.

## Some of the members of the class are given below:

### Class name:
**Special**

### Data members /instance variables:

- `n` : integer to store the number

### Member functions:

- **Special()** : Default constructor.

- **void read()** : To accept the number.

- **int factorial(int x)** : Return the factorial of a number using recursion technique.

- **boolean isSpecial()** : Checks for the special number by invoking the function `factorial()` and returns `true` if Special, otherwise returns `false`.

- **void display()** : To show the result with an appropriate message.
