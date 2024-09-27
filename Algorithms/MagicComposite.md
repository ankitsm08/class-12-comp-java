1. Composite check
   - Input: A positive integer n.
   - Check for factors:
     - Initialize a counter to count the number of factors.
     - Iterate overall numbers i from 1 to n.
     - If n % i == 0, increment the factor counter.
     - If the number of factors is greater than 2, then it is composite; otherwise, it is not.

2. Magic Number check
   - Calculate the sum of digits of the number:
   - Convert the number to a string or extract digits using modulus (%) and division (/).
   - Sum the digits.
   - Reduce the sum recursively
   - If the sum of the digits is greater than 9, repeat the process until the sum is a single digit.
   - Check if the sum is equal to 1:
   - If the final single digit is 1, then the number is a magic number.

3. Combine both checks
   - If the number is composite and a magic number, then print that it is a composite magic number.
