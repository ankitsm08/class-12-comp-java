# Question:

Design a class MatRev to reverse each element of a matrix.

## Example:

| 72  | 371 | 5   |
| --- | --- | --- |
| 12  | 6   | 426 |
| 5   | 123 | 94  |

`     Becomes     `

| 27  | 173 | 5   |
| --- | --- | --- |
| 21  | 6   | 624 |
| 5   | 321 | 49  |

## Some of the members of the class are given below:

### Class name:
**MatRev**

### Data members/instance variables:

- `arr[][]`	:	To store integer elements
- `m` :	To store the number of rows
- `n` :	To store the number of columns

### Member functions/methods:

- **MatRev(int mm, int nn)** : Parameterised constructor to initialise the data members m = mm and n = nn

- **void fillarray()**     : To enter elements in the array.

- **int reverse(int x)** : Returns the reverse of the number x.

- **void revMat(MatRev P)** : Reverses each element of the array of the parameterized object and stores it in the array of the current object.

- **void show()** : Displays the array elements in matrix form.
