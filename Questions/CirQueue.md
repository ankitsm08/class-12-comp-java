# Question:

A Circular queue is a linear data structure which works on the principle of FIFO, enables the user to enter data from the rear end and remove data from the front end with the rear end connected to the front end to form a circular pattern.

## Define a class CirQueue with the following details:

### Class name:
**CirQueue**

### Data members / instance variables:
- `cq[]` : array to store the integers
- `cap` : stores the maximum capacity of the array
- `front` : to point the index of the front end
- `rear` : to point the index of the rear end

### Member functions:
- **CirQueue(int max)** : constructor to initialize the data member cap=max, front=0 and rear=0.
- **void push(int n)** : to add integer in the queue from the rear end if possible, otherwise display the message “QUEUE IS FULL”.
- **int pop()** : removes and returns the integer from the front end of the queue if any, else returns -9999.
- **void show()** : displays the queue elements.
