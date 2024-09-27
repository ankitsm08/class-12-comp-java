1. Input Validation:
   - Accept the inputs M and N. Ensure that M is between 1 and 9, and N is between 3 and 5. If the input is out of range, display "OUT OF RANGE" and terminate the program.

2. Matrix Declaration and Input:
   - Declare a matrix A[M][N] of size M by N.
   - For each element in the matrix, prompt the user to input a digit between 0 and 7. If any element is outside this range, display "INVALID INPUT" and terminate the program.

3. Display the Original Matrix:
   - Display the matrix in a tabular form as provided by the user.

4. Convert Each Row to Decimal:
   - For each row in the matrix, convert it from an octal number to its decimal equivalent. This can be done using the formula: 
     - $\text{decimal value\ = }A\left[i\right]\left[0\right]\times8^{\left(N-1\right)}+A\left[i\right]\left[1\right]\times8^{\left(N-2\right)}+\cdots A\left[i\right]\left[N-1\right]\times8^0$

5. Calculate the decimal equivalent for each row.
   - Display the Decimal Equivalents:
   - Print the original matrix along with its decimal equivalent for each row.
 
