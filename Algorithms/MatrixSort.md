1. Input the Matrix Size:
   - Prompt the user to enter the matrix size m.
   - If m is less than 3 or greater than or equal to 10, print an "OUT OF RANGE" message and exit.

2. Input the Matrix Elements:
   - Prompt the user to input elements for a square matrix a[m][m].
   - Ensure that only positive integers are accepted. If any negative value is input, display "INVALID INPUT" and exit.

3. Display the Original Matrix:
   - Use printMatrix(a, m) to print the matrix as entered by the user.

4. Sort the Non-Boundary Elements:
   - Extract non-boundary elements from the matrix into an
array b[].
   - Sort the array b[] using the bubble sort technique.
   - Place the sorted values of b[] back into the non-boundary
cells of the matrix a[][].

5. Display the Rearranged Matrix:
   - Print the rearranged matrix after sorting non-boundary elements using printMatrix(a, m).

6. Compute and Print the Sum of Diagonal Elements:
   - Use the computePrintDiagonalSum(a, m) method to:
     - Identify and print diagonal elements (both primary and secondary diagonals).
     - Compute the sum of the diagonal elements and display it.
