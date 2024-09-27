1. Initialize the Circular Queue:
   - Input the capacity cap of the queue.
   - Set front and rear to 0, and create an array cq[] of size cap.

2. Push (Enqueue) Operation:
   - Check if the queue is full by verifying if (rear + 1) % cap == front.
     - If full, display "QUEUE IS FULL".
     - If not full, add the integer n to the position rear in the array.
     - Increment rear circularly: rear = (rear + 1) % cap.

3. Pop (Dequeue) Operation:
   - Check if the queue is empty by verifying if front == rear.
     - If empty, return -9999.
     - If not empty, retrieve the integer from position front.
     - Increment front circularly: front = (front + 1) % cap.
     - Return the dequeued value.

4. Show Queue Elements:
   - If front == rear, the queue is empty; display "QUEUE IS EMPTY".
   - Else, display elements from front to rear in circular order.

5. Main Program Logic:
   - Repeat the following steps until the user chooses to exit:
     - Input the user's choice (push, pop, show, exit).
     - Perform the corresponding action based on the choice.
     - Exit the program if the choice is 4.
