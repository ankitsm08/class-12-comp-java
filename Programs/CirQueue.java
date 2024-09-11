package Programs;

import java.util.Scanner;

public class CirQueue {
  // Instance variables
  int[] cq;
  int cap;
  int front;
  int rear;

  // Constructor to initialize the circular queue with given capacity
  CirQueue(int max) {
    cap = max;
    cq = new int[cap];
    front = 0;
    rear = 0;
  }

  // Method to add an integer to the queue (enqueue)
  void push(int n) {
    if ((rear + 1) % cap == front) {
      System.out.println("QUEUE IS FULL");
    } else {
      cq[rear] = n; // Add to rear position
      rear = (rear + 1) % cap; // Increment rear circularly
    }
  }

  // Method to remove and return an integer from the queue (dequeue)
  int pop() {
    if (front == rear) {
      return -9999; // Queue is empty
    } else {
      int val = cq[front]; // Retrieve front element
      front = (front + 1) % cap; // Increment front circularly
      return val;
    }
  }

  // Method to display the elements of the queue
  void show() {
    if (front == rear) {
      System.out.println("QUEUE IS EMPTY");
    } else {
      System.out.print("Queue elements: ");
      int i = front;
      while (i != rear) {
        System.out.print(cq[i] + " ");
        i = (i + 1) % cap; // Circular increment
      }
      System.out.println();
    }
  }

  // Main method to run the program
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the capacity of the circular queue: ");
    int max = sc.nextInt();
    CirQueue queue = new CirQueue(max);

    while (true) {
      System.out.println("\n1. Push");
      System.out.println("2. Pop");
      System.out.println("3. Show");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Enter an integer to push: ");
          int value = sc.nextInt();
          queue.push(value);
          break;
        case 2:
          int removedValue = queue.pop();
          if (removedValue == -9999) {
            System.out.println("QUEUE IS EMPTY");
          } else {
            System.out.println("Popped value: " + removedValue);
          }
          break;
        case 3:
          queue.show();
          break;
        case 4:
          sc.close();
          System.exit(0);
        default:
          System.out.println("Invalid choice, try again.");
      }
    }
  }
}
