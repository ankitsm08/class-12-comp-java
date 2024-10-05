# Question:

Write a program to declare a matrix `a[][]` of order (m × n) where 'm' is the number of rows and 'n' is the number of columns such that $(2 < m, n < 10)$. Allow the user to input integers into this matrix.

## Perform the following tasks on the matrix:

1. Display the original matrix.
2. Sort each row of the matrix in ascending order using any standard sorting technique.
3. Display the changed matrix after sorting each row.

## Test your program for the following data and some random data:
 
### Example 1

**INPUT:**  
M = 4  
N = 3

ENTER ELEMENTS OF MATRIX:  
| 11  | -2  | 3   |
| --- | --- | --- |
| 5   | 16  | 7   |
| 9   | 0   | 4   |
| 3   | 1   | 8   |

**OUTPUT:**  
ORIGINAL MATRIX:  
| 11  | -2  | 3   |
| --- | --- | --- |
| 5   | 16  | 7   |
| 9   | 0   | 4   |
| 3   | 1   | 8   |

MATRIX AFTER SORTING ROWS:  
| -2  | 3   | 11  |
| --- | --- | --- |
| 5   | 7   | 16  |
| 0   | 4   | 9   |
| 1   | 3   | 8   |
 
### Example 2

**INPUT:**  
M = 3  
N = 3

ENTER ELEMENTS OF MATRIX:  
| 22  | 5   | 19  |
| --- | --- | --- |
| 7   | 36  | 12  |
| 9   | 13  | 6   |

**OUTPUT:**  
ORIGINAL MATRIX:  
| 22  | 5   | 19  |
| --- | --- | --- |
| 7   | 36  | 12  |
| 9   | 13  | 6   |


MATRIX AFTER SORTING ROWS:  
| 5   | 19  | 22  |
| --- | --- | --- |
| 7   | 12  | 36  |
| 6   | 9   | 13  |

### Example 3

**INPUT:**  
M = 11  
N = 5

**OUTPUT:**  
MATRIX SIZE OUT OF RANGE.
