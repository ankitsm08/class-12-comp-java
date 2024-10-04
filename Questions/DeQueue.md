# Question:

A dequeue enables the user to add and remove integers from both the ends i.e. front and rear.

## Define a class DeQueue with the following details:

### Class name:
**DeQueue**

### Data Members:

- `ele[]` : array to hold the integer elements.
- `cap` : stores the maximum capacity of the array.
- `front` : to point the index of the front.
- `rear` : to point the index of the rear.

### Member functions:

- **DeQueue(int max)** : constructor to initialize the data member `cap = max`, `front = rear = 0` and create the integer array.

- **void pushfront(int v)** : to add integers from the front index if possible else display the message(“full from front”).

- **int popfront()** : to remove the return elements from front. If array is empty then return -999.

- **void pushrear(int v)** : to add integers from the front index if possible else display the message(“full from rear”).

- **int poprear()** : to remove and return elements from rear. If the array is empty then return -999.
