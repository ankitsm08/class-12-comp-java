# Question:

Write a program to declare a matrix `A[][]` of order $(M \times N)$ where `M` is the number of rows and `N` is the number of columns such that the value of $M > 0$ and $M < 10$ and the value of $N > 2$ and $N < 6$.

Allow the user to input digits `(0 - 7)` only at each location, such that each row represents an octal number.

## Example:

|2|3|1|( decimal equivalent of 1st row = 153 i.e. $2 \times 82 + 3 \times 81 + 1 \times 80$ ) |
|-|-|-|--|
|4|0|5|( decimal equivalent of 2nd row = 261 i.e. $4 \times 82 + 0 \times 81 + 5 \times 80$ ) |
|1|5|6|( decimal equivalent of 3rd row = 110 i.e. $1 \times 82 + 5 \times 81 + 6 \times 80$ ) |

## Perform the following tasks on the matrix:

1. Display the original matrix.

2. Calculate the decimal equivalent for each row and display as per the format given below.

## Test your program for the following data and some random data:

### Example 1:

**INPUT:**  
M = 1  
N = 3  
ENTER ELEMENTS FOR ROW 1: 1 4 4

**OUTPUT:**  
|FILLED MATRIX| |DECIMAL EQUIVALENT |
|------------|-|-----------------|

|1|4|4| | 100 |
|-|-|-|-|----|

### Example 2:

**INPUT:**  
M = 3  
N = 4  
ENTER ELEMENTS FOR ROW 1: 1 1 3 7  
ENTER ELEMENTS FOR ROW 2: 2 1 0 6  
ENTER ELEMENTS FOR ROW 3: 0 2 4 5

**OUTPUT:**  
|FILLED MATRIX| |DECIMAL EQUIVALENT |
|------------|-|-----------------|

|1|1|3|7| | 607 |
|-|-|-|-|-|-----|
|2|1|0|6| |1094 |
|0|2|4|5| | 165 |

### Example 3:

**INPUT:**  
M = 3  
N = 3  
ENTER ELEMENTS FOR ROW 1: 2 4 8

**OUTPUT:**  
INVALID INPUT

### Example 4:

**INPUT:**  
M = 4  
N = 6

**OUTPUT:**  
OUT OF RANGE
