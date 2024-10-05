# Question:

Design a class `Perfect` to check if a given number is a perfect number or not.

A number is said to be perfect if sum of the factors of the number excluding itself is equal to the original number.

## Example:

$6 = 1 + 2 + 3$  
(where 1, 2 and 3 are factors of 6, excluding itself)

## Some of the members of the class are given below:

### Class name:
**Perfect**

### Data members/instance variables:

- `num` : To store the number

### Methods/Member functions:

- **Perfect(int nn)** : Parameterized constructor to initialize the datamember num=nn.

- **int sum_of_factors(int i)** : Returns the sum of the factors of the number(num), excluding itself, using recursive technique.

- **void check()** : Checks whether the given number is perfect by invoking the function sum_of_factors() and displays the result with an appropriate message.
