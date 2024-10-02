# Question:

Design a program to accept a day number (between 1 and 366), year (in 4 digits) from the user to generate and display the corresponding date. Also, accept `N` $(1 \leq N \leq 100)$ from the user to compute and display the future date corresponding to `N` days after the generated date.

Display an error message if the value of the day number, year and `N` are not within the limit or not according to the condition specified.

## Test your program with the following data and some random data:

### Example 1

**INPUT:**  
DAY NUMBER: 255  
YEAR: 2018  
DATE AFTER (N DAYS): 22

**OUTPUT:**  
DATE: 12TH SEPTEMBER, 2018  
DATE AFTER 22 DAYS: 4TH OCTOBER, 2018
 
### Example 2

**INPUT:**  
DAY NUMBER: 360  
YEAR: 2018  
DATE AFTER (N DAYS): 45

**OUTPUT:**  
DATE: 26TH DECEMBER, 2018  
DATE AFTER 45 DAYS: 9TH FEBRUARY, 2019

### Example 3

**INPUT:**  
DAY NUMBER: 500  
YEAR: 2018  
DATE AFTER (N DAYS): 33

**OUTPUT:**  
DAY NUMBER OUT OF RANGE

### Example 4

**INPUT:**  
DAY NUMBER: 150  
YEAR: 2018  
DATE AFTER (N DAYS): 330

**OUTPUT:**  
DATE AFTER (N DAYS) OUT OF RANGE
