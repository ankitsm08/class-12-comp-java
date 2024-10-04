# Question:

Design a class NumDude to check if a given number is a Dudeney number or not.

(A Dudeney number is a positive integer that is a perfect cube, such that the sum of its digits is equal to the cube root of the number.)

## Example:

$5832 = (5 + 8 + 3 + 2) ^ 3 = (18) ^ 3 = 5832$

## Some of the members of the class are given below:

### Class name:
**NumDude**

### Data member/instance/variable:

- `num` : To store a positive integer number

### Methods/Member functions:

- **NumDude()** : Default constructor to initialise the data member with legal initial value.

- **void input()** : To accept a positive integer number.

- **int sumDigits(int x)** : Returns the sum of the digits of number ‘x’ using recursive technique.

- **void isDude()** : Checks whether the given number is a Dudeney number by invoking the function sumDigits() and displays the result with an appropriate message.
