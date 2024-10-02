Write a program to declare a single-dimensional array `a[]` and a square matrix `b[][]` of size `N`, where `N > 2` and `N < 10`. Allow the user to input positive integers into the single-dimensional array.

## Perform the following tasks on the matrix:

1. Sort the elements of the single-dimensional array in ascending order using any standard sorting technique and display the sorted elements.


2. Fill the square matrix `b[][]` in the following format:
  
    If the array `a[] = {5, 2, 8, 1}`,  
    then, after sorting `a[] = {1, 2, 5, 8}`,  
    the matrix `b[][]` would fill as below:

    | 1   | 2   | 5   | 8   |
    | --- | --- | --- | --- |
    | 1   | 2   | 5   | 1   |
    | 1   | 2   | 1   | 2   |
    | 1   | 1   | 2   | 5   |

3. Display the filled matrix in the above format.

## Test your program for the following data and some random data:


### Example 1:

**INPUT:**  
N = 3  
ENTER ELEMENTS OF SINGLE DIMENSIONAL ARRAY: 3 1 7

**OUTPUT:**  
SORTED ARRAY: 1 3 7  
FILLED MATRIX:  
| 1   | 3   | 7   |
| --- | --- | --- |
| 1   | 3   | 1   |
| 1   | 1   | 3   |

### Example 2

**INPUT:**  
N = 13

**OUTPUT:**  
MATRIX SIZE OUT OF RANGE

### Example 3

**INPUT:**  
N = 5  
ENTER ELEMENTS OF SINGLE DIMENSIONAL ARRAY: 10 2 5 23 6

**OUTPUT:**  
SORTED ARRAY: 2 5 6 10 23  
FILLED MATRIX:  
| 2   | 5   | 6   | 10  | 23  |
| --- | --- | --- | --- | --- |
| 2   | 5   | 6   | 10  | 2   |
| 2   | 5   | 6   | 2   | 5   |
| 2   | 5   | 2   | 5   | 6   |
| 2   | 2   | 5   | 6   | 10  |
