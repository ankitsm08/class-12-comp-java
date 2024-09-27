1. Define Class:
    - Create a class named Perfect.

2. Declare Data Member:
    - Create an instance variable num of type int to store the number.

3. Constructor:
    - Create a parameterized constructor that takes an integer nn and initializes num with nn.

4. Sum of Factors Method:
   - Recursive Method: Create a method named/called as sum_of_factors(int i) that recursively calculates the sum of all factors of num (excluding itself).
   - Base Case: If i is 1, return 0 (no more factors to check).
   - Recursive Step: If num is divisible by i, add i to the sum. Call sum_of_factors(i - 1) to check the next smaller number.

5. Check Method: Create a method check() that:
   - Calls sum_of_factors(num - 1) to get the sum of factors of num excluding itself.
   - Checks if the sum equals num. If yes, print that num is a perfect number. Otherwise, print that it is not a perfect number.
