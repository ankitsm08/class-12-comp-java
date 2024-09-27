1. Input Validation:
   - Accept dayNumber, year, and N from the user.
   - Check if dayNumber is between 1 and 366 for a leap year, and 1 and 365 for a non-leap year.
   - Check if N is between 1 and 100.
   - If the input is invalid, display an appropriate error message and terminate.

2. Leap Year Calculation:
   - A year is a leap year if it is divisible by 4 but not divisible by 100 unless divisible by 400.

3. Date Calculation:
   - Create an array of days in each month for leap years or non-leap years by adding a day to February if leap year.
   - Using the dayNumber, calculate the corresponding month and day in that month.

4. Future Date Calculation:
   - Add N days to the initial date.
   - Adjust the month and year if the number of days exceeds the number of days in the current month.
   - If the month exceeds 12, increment the year accordingly.

5. Edge Cases:
   - Ensure that if the date after N days exceeds the given year’s day limit or dayNumber is out of range, appropriate error messages are displayed.
