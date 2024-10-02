# Question:

Design a class **ArmNum** to check if a given number is an Armstrong number or not.  
[ A number is said to be Armstrong if the sum of its digits raised to the power of the length of the number is equal to the number ]  

## Example:

- $371 = 3^3 + 7^3 + 1^3$
- $1634 = 1^4 + 6^4 + 3^4 + 4^4$

Thus, 371 and 1634 are examples of Armstrong numbers.

## Some of the members of the class are given below:

### Class name: 
**ArmNum**

### Data members/instance variables:
- `n` : To store the number
- `l` : To store the length of the number

### Methods/Member functions:

- **ArmNum(int nn)** : Parameterized constructor to initialize the data member `n = nn`.
- **int sum_pow(int i)** : Returns the sum of each digit raised to the power of the length of the number using recursive technique.
- **void isArmstrong()** : Checks whether the given number is an Armstrong number by invoking the function `sum_pow()` and displays the result with an appropriate message.
