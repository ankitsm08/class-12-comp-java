# Question:

The result of a quiz competition is to be prepared as follows:
The quiz has five questions with four multiple choices (A, B, C, D), with each question carrying 1 mark for the correct answer. Design a program to accept the number of participants `N` such that $3 < N < 11$.

1. Create a double-dimensional array of size (Nx5) to store the answers of each participant row-wise.

2. Calculate the marks for each participant by matching the correct answer stored in a single-dimensional array of size 5. 

3. Display the scores for each participant and also the participant(s) having the highest score.

## Example:

If the value of N = 4, then the array would be:  
|               | Q1  | Q2  | Q3  | Q4  | Q5  |
| ------------- | --- | --- | --- | --- | --- |
| Participant 1 | A   | B   | B   | C   | A   |
| Participant 2 | D   | A   | D   | C   | B   |
| Participant 3 | A   | A   | B   | A   | C   |
| Participant 4 | D   | C   | C   | A   | B   |

Key to the question: D C C B A
**Note:** Array entries are line fed (i.e. one entry per line)

## Test your program for the following data and some random data.

### Example 1

**INPUT:**  
N = 5  
Participant 1: D A B C C  
Participant 2: A A D C B  
Participant 3: B A C D B  
Participant 4: D A D C B  
Participant 5: B C A D D  
Key: B C D A A

**OUTPUT:**  
Scores:  
Participant 1 = 0  
Participant 2 = 1  
Participant 3 = 1  
Participant 4 = 1  
Participant 5 = 2  
Highest Score:  
Participant 5

### Example 2

**INPUT:**  
N = 4  
Participant 1: A C C B D  
Participant 2: B C A A C  
Participant 3: B C B A A  
Participant 4: C C D D B  
Key: A C D B B

**OUTPUT:**  
Scores:  
Participant 1 = 3  
Participant 2 = 1  
Participant 3 = 1  
Participant 4 = 3  
Highest Score:  
Participant 1  
Participant 4

### Example 3

**INPUT:**  
N = 12

**OUTPUT:**  
INPUT SIZE OUT OF RANGE.
