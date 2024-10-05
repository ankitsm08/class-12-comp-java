| Name    | Datatype | Description                                                                                |
|---------|----------|--------------------------------------------------------------------------------------------|
| a       | int[][]  | 2D array storing the matrix input by the user.                                             |
| m       | int      | Size of the matrix (number of rows and columns).                                           |
| b       | int[]    | 1D array storing non-boundary elements of the matrix for sorting.                          |
| k       | int      | Counter used to index into the b[] array during extraction and sorting.                    |
| sum     | int      | Stores the sum of diagonal elements of the matrix.                                         |
| i, j    | int      | Loop variables used to traverse the matrix rows and columns.                               |
| t       | int      | Temporary variable used for swapping elements in the bubble sort.                          |
| divisor | int      | Used to shift digits while generating cyclic permutations (in the circular prime example). |
