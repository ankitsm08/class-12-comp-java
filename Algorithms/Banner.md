1. Input Validation:
   - Accept the number N of teams participating in the competition.
   - Validate that N is greater than 2 and less than 9. If not, print "INVALID INPUT" and terminate the program.

2. Input Team Names:
   - Create a string array teams[ ] to store the names of the teams.
   - Use a loop to allow the user to input the names of all N teams.
   - Track the length of the longest team name (highLen).

3. Display Teams Vertically:
   - For each index i from 0 to highLen - 1:
     - For each team, print the i-th character. If the current team name length is less than i, print a space followed by a tab.
     - After printing the characters of all teams at the current index i, move to the next line.
