package Programs;

public class DeQueue {

  // Data members
  int ele[];
  int cap;
  int front;
  int rear;

  // Constructor to initialize the DeQueue with a given maximum capacity
  DeQueue(int max) {
    cap = max;
    ele = new int[cap];
    front = rear = -1;
  }

  // Method to add an element at the front
  void pushfront(int v) {

    // Check if full from the front
    if ((front == 0 && rear == cap - 1) || (front == rear + 1)) {
      System.out.println("Full from front");
    } else {
      if (front == -1) { // Initially empty DeQueue
        front = rear = 0;
      } else if (front == 0) {
        front = cap - 1; // Wrap around to end
      } else {
        front--; // Move front backward
      }
      ele[front] = v; // Insert element at front
    }
  }

  // Method to remove and return the element from the front
  int popfront() {
    // Check if DeQueue is empty
    if (front == -1) {
      return -999; // Return -999 if empty
    }
    int temp = ele[front]; // Store the element to be returned
    if (front == rear) { // Only one element was present
      front = rear = -1;
    } else if (front == cap - 1) {
      front = 0; // Wrap around to start
    } else {
      front++; // Move front forward
    }
    return temp;
  }

  // Method to add an element at the rear
  void pushrear(int v) {
    // Check if full from the rear
    if ((front == 0 && rear == cap - 1) || (front == rear + 1)) {
      System.out.println("Full from rear");
    } else {
      if (rear == -1) { // Initially empty DeQueue
        front = rear = 0;
      } else if (rear == cap - 1) {
        rear = 0; // Wrap around to start
      } else {
        rear++; // Move rear forward
      }
      ele[rear] = v; // Insert element at rear
    }
  }

  // Method to remove and return the element from the rear
  int poprear() {
    // Check if DeQueue is empty
    if (front == -1) {
      return -999; // Return -999 if empty
    }
    int temp = ele[rear]; // Store the element to be returned
    if (front == rear) { // Only one element was present
      front = rear = -1;
    } else if (rear == 0) {
      rear = cap - 1; // Wrap around to end
    } else {
      rear--; // Move rear backward
    }
    return temp;
  }

  // Main method to test the DeQueue
  public static void main(String[] args) {
    DeQueue dq = new DeQueue(5); // Initialize a DeQueue with capacity 5

    // Test pushing and popping elements from both ends
    dq.pushfront(10);
    dq.pushrear(20);
    dq.pushfront(30);
    dq.pushrear(40);
    dq.pushfront(50);

    System.out.println(dq.popfront()); // 50
    System.out.println(dq.poprear()); // 40
    System.out.println(dq.popfront()); // 30
    System.out.println(dq.poprear()); // 20
    System.out.println(dq.popfront()); // 10
  }
}
