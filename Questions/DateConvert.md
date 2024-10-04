# Question:

Design a class DateConvert to find the date and the month from a given day number for a particular year.

## Example:

If day number is 64 and the year is 2020, then the corresponding date would be:  

March 4, 2020 i.e. $(31 + 29 + 4 = 64)$

## Some of the members of the class are given below:

### Class name:
**DateConvert**

### Data members/instance variables:

- `n` : Integer to store the day number
- `d` : Integer to store the day of the month (date)
- `m` : Integer to store the month
- `y` : Integer to store the year

### Methods/Member functions:

- **DateConvert()** : Constructor to initialize the data members with legal initial values.

- **void accept()** : To accept the day number and the year.

- **void day_to_date()** : Converts the day number to its corresponding date for a particular year and stores the date in `d` and the month in `m`.

- **void display()** : Displays the month name, date and year.
