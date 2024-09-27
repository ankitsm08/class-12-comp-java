1. Define Class: 
   - Create a class named ArmNum.

2. Declare Data Members:
   - n (int) to store the given number.
   - l (int) to store the number of digits (length) of n.

3. Constructor: Create a parameterized constructor that:
   - Takes an integer nn.
   - Initializes n with nn.
   - Converts n to a string to find its length (l).

4. Sum of Powers Method:
   - Create a method sum_pow(int i) that:
     - Recursively calculates the sum of each digit of n raised to the power of l.
     - Base Case: If i is 0, return 0.
     - Recursive Step: Get the last digit of i, compute its power l, add to the sum, and call sum_pow(i/10) for the remaining digits.

5. Check Armstrong Method:
   - Create a method isArmstrong() that:
     - Calls sum_pow(n) to compute the sum of digits raised to the power of l.
     - Compares this sum to n.
     - Displays an appropriate message indicating whether n is an Armstrong number.

6. Main Method:
   - Accepts user input for the number.
   - Creates an object of ArmNum to check if the number is an Armstrong number. 
