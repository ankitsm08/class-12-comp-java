# Question:

A Circular queue is a linear data structure which works on the principle of FIFO, enables the user to enter data from the rear end and remove data from the front end with the rear end connected to the front end to form a circular pattern.

## Define a class CirQueue with the following details:

### Class name:
**CirQueue**

### Data members / instance variables:

- `cq[]` : Array to store the integers
- `cap` : Stores the maximum capacity of the array
- `front` : To point the index of the front end
- `rear` : To point the index of the rear end

### Member functions:

- **CirQueue(int max)** : Constructor to initialize the data member `cap = max`, `front = 0` and `rear = 0`.

- **void push(int n)** : To add integer in the queue from the rear end if possible, otherwise display the message “QUEUE IS FULL”.

- **int pop()** : Removes and returns the integer from the front end of the queue if any, else returns -9999.

- **void show()** : Displays the queue elements.
