1. Input: 
   - Read the number of boxes N to be packed.

2. Validation:
   - If N is less than 1 or greater than 1000, print "INVALID INPUT" and terminate the program.

3. Carton Sizes: 
   - Create an array with the available carton sizes [48, 24, 12, 6].

4. Initialize Variables:
   - Initialize a variable total to store the total number of cartons used.
   - Initialize t to store the number of boxes left to be packed.

5. Determine Carton Count:
   - For each carton size in descending order, calculate how many cartons of that size are needed using integer division (t / carton_size).
   - Subtract the packed boxes from the total boxes using the modulo operator (t = t % carton_size).
   - Add the number of cartons used to the total.

6. Remaining Boxes:
   - If there are any boxes left (t != 0), print the remaining boxes, assign one additional carton of size 6, and increment total by 1.

7. Output:
   - Print the total number of boxes.
   - Print the total number of cartons used.
