# Question:

Write a program to declare a square matrix A[][] of order (M × M) where 'M' must be greater than 3 and less than 10. Allow the user to input positive integers into this matrix.

## Perform the following tasks on the matrix:

1. Sort the non-boundary elements in ascending order using any standard sorting technique and rearrange them in the matrix.

2. Calculate the sum of both the diagonals.

3. Display the original matrix, rearranged matrix and only the diagonal elements of the rearranged matrix with their sum.

## Test your program for the following data and some random data:
 
### Example

**INPUT:**  
M = 4  
| 9   | 2   | 1   | 5   |
| --- | --- | --- | --- |
| 8   | 13  | 8   | 4   |
| 15  | 6   | 3   | 11  |
| 7   | 12  | 23  | 8   |

**OUTPUT:**  
ORIGINAL MATRIX  
| 9   | 2   | 1   | 5   |
| --- | --- | --- | --- |
| 8   | 13  | 8   | 4   |
| 15  | 6   | 3   | 11  |
| 7   | 12  | 23  | 8   |

REARRANGED MATRIX  
| 9   | 2   | 1   | 5   |
| --- | --- | --- | --- |
| 8   | 3   | 6   | 4   |
| 15  | 8   | 13  | 11  |
| 7   | 12  | 23  | 8   |

DIAGONAL ELEMENTS  
| 9   |     |     | 5   |
| --- | --- | --- | --- |
|     | 3   | 6   |     |
|     | 8   | 13  |     |
| 7   |     |     | 8   |

SUM OF THE DIAGONAL ELEMENTS = 59
