# Question:

A **Prime-Adam** integer is a positive integer (without leading zeros) which is a prime as well as an Adam number.

**Prime number:** A number which has only two factors, i.e. 1 and the number itself.  
Example: 2, 3, 5, 7 ... etc.

**Adam number:** The square of a number and the square of its reverse are reverse to each other.

## Example:

If n = 13 and reverse of 'n' = 31, then,  
$(13)^2 = 169$  
$(31)^2 = 961$ which is reverse of 169  
thus 13, is an Adam number.

Accept two positive integers `m` and `n`, where $m < n$ as user input. Display all Prime-Adam integers that are in the range between `m` and `n` (both inclusive) and output them along with the frequency, in the format given below:

## Test your program with the following data and some random data:

### Example 1

**INPUT:**  
m = 5  
n = 100

**OUTPUT:**  
THE PRIME-ADAM INTEGERS ARE:
11 13 31
FREQUENCY OF PRIME-ADAM INTEGERS IS: 3

### Example 2

**INPUT:**  
m = 100  
n = 200

**OUTPUT:**  
THE PRIME-ADAM INTEGERS ARE:  
101 103 113  
FREQUENCY OF PRIME-ADAM INTEGERS IS: 3

### Example 3

**INPUT:**  
m = 50  
n = 70

**OUTPUT:**  
THE PRIME-ADAM INTEGERS ARE:  
NIL  
FREQUENCY OF PRIME-ADAM INTEGERS IS: 0

### Example 4

**INPUT:**  
m = 700  
n = 450

**OUTPUT:**  
INVALID INPUT
