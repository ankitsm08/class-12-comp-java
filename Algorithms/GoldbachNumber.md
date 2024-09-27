1. Input Validation:
   - Accept an integer input N.
   - Check if N is within the valid range (i.e., greater than 9 and less than 50).
   - If N is outside the range, print "INVALID INPUT. NUMBER OUT OF RANGE" and terminate.
   - If N is odd, print "INVALID INPUT. NUMBER IS ODD" and terminate.

2. Prime Pair Search:
   - Start with the smallest odd prime (a = 3).
   - For each odd prime a less than or equal to N/2, compute b = N - a.
   - Check if both a and b are prime.
   - If they are, print the pair a, b.

3. Prime Checking:
   - Implement a function isPrime() to check if a given number is prime. A number is prime if it has exactly two divisors: 1 and itself. i.e. not divisible by any other number.

4. Looping for Odd Primes:
   - Increment a by 2 in each iteration to check only odd numbers.
   - Continue the loop until a exceeds N/2.

5. Output:
   - Display all valid prime pairs whose sum equals N.
