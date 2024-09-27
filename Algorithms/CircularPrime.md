1. Input the Number:
   - Accept a positive integer n from the user.
   - If n is less than or equal to zero, display "INVALID INPUT" and terminate.

2. Check if the Number is Prime:
   - Call the isPrime(num) function to check whether the number n is a prime number.
   - If n is not prime, print that n is not a circular prime and terminate.

3. Calculate the Number of Digits:
   - Use the getDigitCount(num) function to count the number of digits in n and store it in digitCount.

4. Display the Original Number:
   - Print the original number n.

5. Shift the Digits and Check Primality:
   - Set n2 to the original number n.
   - For each shift:
     - Extract the leftmost digit of n2 (using t1 = n2 / divisor).
     - Remove the leftmost digit and shift the remaining digits (using t2 = n2 % divisor).
     - Form the new shifted number by appending t1 to the end of t2 (n2 = t2 * 10 + t1).

6. Check Circular Prime:
   - If all shifted numbers are prime, print that n is a circular prime.
   - Otherwise, print that n is not a circular prime.
