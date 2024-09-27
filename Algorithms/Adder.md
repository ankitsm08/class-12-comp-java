1. Class Initialization (Adder Constructor):
   -	Initialize an integer array a with size 2.
   -	Set a[0] (hours) and a[1] (minutes) to 0.

2. Reading Time (readtime Method):
   -	Accept a time in the format "HH" as a string parameter.
   -	Split the string using ":" to extract hours and minutes.
   -	Convert these substrings to integers and store them in the array a.

3. Adding Time (addtime Method):
   - Sum the hours (X.a[0] + Y.a[0]) and minutes (X.a[1] + Y.a[1]) from the objects X and Y.
   - If the minutes sum is 60 or more, convert the excess into hours by:
       -	Incrementing the hour sum by minutes / 60.
       -	Setting the new minutes to minutes % 60.
   - If the total hours exceed 24, set the hours to hours % 24 to wrap around to the 24-hour format.
   - Store the calculated hours and minutes in the current object (this.a[0] and this.a[1]).

4. Displaying Time (disptime Method):
   - Print the current object's hours and minutes with the message: "hours = X, minutes = Y".
