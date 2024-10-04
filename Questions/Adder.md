# Question:

A class **Adder** has been defined to add any two accepted times. The time is entered in the 24-hour format (HH) as a string and then converted to an integer array representing hours and minutes. Additionally, the class checks if the total hours exceed 24 hours after addition, in which case it resets the hours to fit within the 24-hour format.

## Example:

- **Time A** - "06:35" (6 hours 35 minutes)
- **Time B** - "19:50" (19 hours 50 minutes)
- **Their sum** is - "02:25" (since 26 hours 25 minutes wraps around to 24-hour format)

## The details of the class members are given below:

### Class name: 
**Adder**

### Data members (instance variables):

- `a[]`: An integer array of size 2 to hold the hours and minutes.

### Member functions/methods:

- **Adder()** : Constructor to assign 0 to the array elements.

- **void readtime(String input)** : Takes a time input in the format "HH" as a string, splits it, and stores hours and minutes in the array.

- **void addtime(Adder X, Adder Y)** : Adds the time of the two parameterized objects X and Y, storing the result in the current calling object. If the sum of hours exceeds 24, it wraps around the 24-hour format.

- **void disptime()** : Displays the array elements with an appropriate message (hours = and minutes =).
