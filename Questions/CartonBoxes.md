# Question:

A company manufactures packing cartons in four sizes, i.e. cartons to accommodate 6 boxes, 12 boxes, 24 boxes and 48 boxes.

Design a program to accept the number of boxes to be packed (`N`) by the user (maximum up to 1000 boxes) and display the break-up of the cartons used in descending order of capacity (i.e. preference should be given to the highest capacity available, and if boxes left are less than 6, an extra carton of capacity 6 should be used.)

## Test your program with the following data and some random data:

### Example 1

**INPUT:**  
N = 726

**OUTPUT:**  
48 * 15 = 720  
6 * 1 = 6  
Remaining boxes = 0  
Total number of boxes = 726  
Total number of cartons = 16

### Example 3

**INPUT:**  
N = 4296

**OUTPUT:**  
INVALID INPUT

### Example 2

**INPUT:**  
N = 140

**OUTPUT:**  
48 * 2 = 96  
24 * 1 = 24  
12 * 1 = 12  
6 * 1 = 6  
Remaining boxes = 2 * 1 = 2  
Total number of boxes = 140  
Total number of cartons = 6
