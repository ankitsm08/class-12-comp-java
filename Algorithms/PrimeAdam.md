1. Input Validation:
   - Accept the inputs m and n. If m is greater than n, display "INVALID INPUT" and exit the program.

2. Prime Check:
   - For every number i in the range from m to n (both inclusive), check if i is a prime number.
   - A number is prime if it has only two factors: 1 and itself. You can check divisibility from 2 to the square root of i.

3. Reverse and Adam Check:
   - If i is prime, reverse the number i.
   - Square both i and its reverse.
   - If the square of the reverse of i is the reverse of the square of i, then the number is an Adam number.

4. Print Prime-Adam Integers:
   - Print the found Prime-Adam numbers as the loop progresses.
   - Count the frequency of such numbers when one is found.

5. Print NIL case and frequency:
   - If there are no Prime-Adam integers (count = 0), output "NIL" and frequency 0.
   - Else output the frequency (count).
