# Linked List

<!-- TOC -->
* [Linked List](#linked-list)
  * [What is a Linked List?](#what-is-a-linked-list)
  * [Common Features of Linked List:](#common-features-of-linked-list)
  * [Importance of Linked List:](#importance-of-linked-list)
  * [Types of Linked Lists:](#types-of-linked-lists)
    * [1. Singly Linked List 🔗](#1-singly-linked-list-)
    * [2. Doubly Linked Lists 🔗](#2-doubly-linked-lists--)
    * [3. Circular Linked Lists 🔗](#3-circular-linked-lists-)
    * [4. Doubly Circular Linked List 🔗](#4-doubly-circular-linked-list-)
    * [5. Header Linked List](#5-header-linked-list)
<!-- TOC -->

> A Linked List is a linear data structure which looks like a chain of nodes, where each node contains a data field and a reference(link) to the next node in the list. Unlike Arrays, Linked List elements are not stored at a contiguous location.

## What is a Linked List?
Linked List is a linear data structure which looks like a series of nodes, where each node has two parts: data and next pointer. Unlike Arrays, Linked List elements are not stored at a contiguous location. In the linked list there is a head pointer, which points to the first element of the linked list, and if the list is empty then it simply points to null or nothing.

A linked list is a data structure used for storing collections of data. A linked list
has the following properties.

- Successive elements are connected by pointers
- The last element points to NULL
- Can grow or shrink in size during execution of a program
- Can be made just as long as required (until systems memory exhausts)
- Does not waste memory space (but takes some extra memory for pointers). It allocates memory as list grows.

## Common Features of Linked List:
- **Node**: Each element in a linked list is represented by a node, which contains two components:
  - **Data**: The actual data or value associated with the element.
  - **Next Pointer(or Link)**: A reference or pointer to the next node in the linked list.
- **Head**: The first node in a linked list is called the “head.” It serves as the starting point for traversing the list.
- **Tail**: The last node in a linked list is called the “tail.”

## Importance of Linked List:
Here are a few advantages of a linked list that is listed below, it will help you understand why it is necessary to know.

- **Dynamic Data structure:** The size of memory can be allocated or de-allocated at run time based on the operation insertion or deletion.
- **Ease of Insertion/Deletion:** The insertion and deletion of elements are simpler than arrays since no elements need to be shifted after insertion and deletion, Just the address needed to be updated.
- **Efficient Memory Utilization:** As we know Linked List is a dynamic data structure the size increases or decreases as per the requirement so this avoids the wastage of memory.
- **Implementation:** Various advanced data structures can be implemented using a linked list like a stack, queue, graph, hash maps, etc.


## Types of Linked Lists:

### [1. Singly Linked List](_01_singly_linked_list/README.md) 🔗
> It is the simplest type of linked list in which every node contains some data and a pointer to the next node of the same data type.

In this type of linked list, every node stores the address or reference of the next node in the list and the last node has the next address or reference as NULL. For example: 1->2->3->4->NULL

![img](/src/resources/img/singly-linked-list.png)

**Structure of Singly Linked List:**

```java
// Singly Linked List Class
class LinkedList { 
    Node head; // head of list
    
  LinkedList() {
    this.head = null;
  }
    /* Node Class */
    class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }
}
```

**Creation and Traversal of Singly Linked List:**
```java
class Node {
  int data;       // The data stored in the node
  Node next;      // Reference to the next node

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class SinglyLinkedList {
  Node head;  // The head of the list

  // Method to insert a new node at the end of the list
  public void insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {  // If the list is empty, set the new node as the head
      head = newNode;
    } else {
      Node current = head;
      // Traverse the list to find the last node
      while (current.next != null) {
        current = current.next;
      }
      // Set the next of the last node to the new node
      current.next = newNode;
    }
  }

  // Method to print the list
  public void printList() {
    Node current = head;
    // Traverse the list and print each node's data
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  // Method to delete a node by its value
  public void delete(int key) {
    Node current = head;
    Node previous = null;

    // If the node to be deleted is the head
    if (current != null && current.data == key) {
      head = current.next;  // Change the head to the next node
      return;
    }

    // Search for the node to be deleted
    while (current != null && current.data != key) {
      previous = current;
      current = current.next;
    }

    // If the node was not found
    if (current == null) return;

    // Unlink the node from the list
    previous.next = current.next;
  }

  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();

    // Insert elements into the list
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);

    // Print the list
    System.out.println("Linked list:");
    list.printList();

    // Delete an element from the list
    list.delete(20);
    System.out.println("Linked list after deleting 20:");
    list.printList();
  }
}
```



**Time Complexity:** O(N)

**Auxiliary Space:** O(N)

---

### [2. Doubly Linked Lists](_02_doubly_linked_list/README.md) 🔗 
> A doubly linked list or a two-way linked list is a more complex type of linked list that contains a pointer to the next as well as the previous node in sequence.

In a doubly linked list, each node has two pointers: one pointing to the next node and one pointing to the previous node. This bidirectional structure allows for efficient traversal in both directions.

![img](/src/resources/img/doubly-linked-list.png)

**Structure of Doubly Linked List:**

```java
class Node {
  int data;       // The data stored in the node
  Node next;      // Reference to the next node
  Node prev;      // Reference to the previous node

  Node(int data) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}
```

**Creation and Traversal of Doubly Linked List:**

```java
public class DoublyLinkedList {
    Node head;  // The head of the list

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {  // If the list is empty, set the new node as the head
            head = newNode;
        } else {
            Node current = head;
            // Traverse the list to find the last node
            while (current.next != null) {
                current = current.next;
            }
            // Link the new node
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Method to print the list from the head
    public void printList() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to print the list from the tail
    public void printListReverse() {
        Node current = head;
        // Go to the last node
        while (current != null && current.next != null) {
            current = current.next;
        }
        System.out.print("Backward: ");
        // Print from the last node to the head
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    // Method to delete a node by its value
    public void delete(int key) {
        Node current = head;

        // Search for the node to be deleted
        while (current != null && current.data != key) {
            current = current.next;
        }

        // If the node was not found
        if (current == null) return;

        // If the node to be deleted is the head
        if (current == head) {
            head = current.next;
        }

        // Unlink the node
        if (current.prev != null) {
            current.prev.next = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Insert elements into the list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // Print the list
        System.out.println("Linked list:");
        list.printList();
        list.printListReverse();

        // Delete an element from the list
        list.delete(20);
        System.out.println("Linked list after deleting 20:");
        list.printList();
        list.printListReverse();
    }
}
```

**Time Complexity:**

The time complexity of the **push() function is O(1)** as it performs constant-time operations to insert a new node at the beginning of the doubly linked list. The time complexity of the **printList() function is O(n)** where n is the number of nodes in the doubly linked list. This is because it traverses the entire list twice, once in the forward direction and once in the backward direction. Therefore, the overall time complexity of the program is **O(n).**

**Space Complexity:**

The space complexity of the program is **O(n)** as it uses a doubly linked list to store the data, which requires n nodes. Additionally, it uses a constant amount of auxiliary space to create a new node in the push() function. Therefore, the overall space complexity of the program is **O(n)**.



---
### [3. Circular Linked Lists](_03_circular_linked_list/README.md) 🔗
> A circular linked list is that in which the last node contains the pointer to the first node of the list.

A circular linked list is a type of linked list in which the first and the last nodes are also connected to each other to form a circle, there is no NULL at the end.

![img](/src/resources/img/circular-linked-list.png)

**Structure of the Circular Linked List:**

```java
class Node {
  int data;       // The data stored in the node
  Node next;      // Reference to the next node

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}
```

**Creation and Traversal of Circular Linked List:**

```java
public class CircularLinkedList {
    Node head;  // The head of the list

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {  // If the list is empty, initialize the circular reference
            head = newNode;
            head.next = head;
        } else {
            Node current = head;
            // Traverse the list to find the last node
            while (current.next != head) {
                current = current.next;
            }
            // Link the new node
            current.next = newNode;
            newNode.next = head;
        }
    }

    // Method to print the list from the head
    public void printList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Method to delete a node by its value
    public void delete(int key) {
        if (head == null) return;

        Node current = head;
        Node previous = null;

        // If the node to be deleted is the head
        if (current.data == key) {
            // If there is only one node in the list
            if (current.next == head) {
                head = null;
                return;
            }

            // Find the last node
            while (current.next != head) {
                current = current.next;
            }

            current.next = head.next;
            head = head.next;
            return;
        }

        previous = head;
        current = head.next;

        // Traverse the list to find the node to be deleted
        while (current != head) {
            if (current.data == key) {
                previous.next = current.next;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Insert elements into the list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // Print the list
        System.out.println("Linked list:");
        list.printList();

        // Delete an element from the list
        list.delete(20);
        System.out.println("Linked list after deleting 20:");
        list.printList();
    }
}
```

**Time Complexity:**

Insertion at the beginning of the circular linked list takes O(1) time complexity.
Traversing and printing all nodes in the circular linked list takes O(n) time complexity where n is the number of nodes in the linked list.
Therefore, the overall time complexity of the program is O(n).

**Auxiliary Space:**

The space required by the program depends on the number of nodes in the circular linked list.
In the worst-case scenario, when there are n nodes, the space complexity of the program will be O(n) as n new nodes will be created to store the data.
Additionally, some extra space is required for the temporary variables and the function calls.
Therefore, the auxiliary space complexity of the program is O(n).


### [4. Doubly Circular Linked List](_04_doubly_circular_linked_list/README.md) 🔗

A Doubly Circular linked list or a circular two-way linked list is a more complex type of linked list that contains a pointer to the next as well as the previous node in the sequence. The difference between the doubly linked and circular doubly list is the same as that between a singly linked list and a circular linked list. The circular doubly linked list does not contain null in the previous field of the first node. Below is the image for the same:

![img](/src/resources/img/Doubly-Circular-Linked-List.png)

**Structure of the Doubly Circular Linked List:**

```java
// Structure of a Node 
class Node {
  int data;       // The data stored in the node
  Node next;      // Reference to the next node
  Node prev;      // Reference to the previous node

  Node(int data) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}
```

**Creation and Traversal of Doubly Circular Linked List:**

```java
public class DoublyCircularLinkedList {
    Node head;  // The head of the list

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {  // If the list is empty, initialize the circular reference
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node last = head.prev;
            last.next = newNode;
            newNode.prev = last;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    // Method to print the list from the head
    public void printList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        System.out.print("Forward: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Method to print the list from the tail
    public void printListReverse() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head.prev;
        System.out.print("Backward: ");
        do {
            System.out.print(current.data + " ");
            current = current.prev;
        } while (current != head.prev);
        System.out.println();
    }

    // Method to delete a node by its value
    public void delete(int key) {
        if (head == null) return;

        Node current = head;

        do {
            if (current.data == key) {
                if (current.next == current) { // Only one node in the list
                    head = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    if (current == head) { // Deleting the head node
                        head = current.next;
                    }
                }
                return;
            }
            current = current.next;
        } while (current != head);
    }

    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();

        // Insert elements into the list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // Print the list
        System.out.println("Linked list:");
        list.printList();
        list.printListReverse();

        // Delete an element from the list
        list.delete(20);
        System.out.println("Linked list after deleting 20:");
        list.printList();
        list.printListReverse();
    }
}

```

**Time Complexity:**

Insertion at the beginning of a doubly circular linked list takes O(1) time complexity.
Traversing the entire doubly circular linked list takes O(n) time complexity, where n is the number of nodes in the linked list.
Therefore, the overall time complexity of the program is O(n).

**Auxiliary space:**

The program uses a constant amount of auxiliary space, i.e., O(1), to create and traverse the doubly circular linked list.
The space required to store the linked list grows linearly with the number of nodes in the linked list.
Therefore, the overall auxiliary space complexity of the program is O(1).

### [5. Header Linked List]()

A header linked list is a special type of linked list that contains a header node at the beginning of the list. 

So, in a header linked list START will not point to the first node of the list but START will contain the address of the header node. Below is the image for Grounded Header Linked List:

A header linked list is a variation of a singly linked list that includes a special node at the beginning called the header node. This header node does not contain any meaningful data related to the list elements but serves as a placeholder to simplify list operations such as insertions and deletions.

![image](/src/resources/img/Grounded-Headed-Linked-List.png)

**Structure of the Header Linked List:**

```java
class Node {
    int data;       // The data stored in the node
    Node next;      // Reference to the next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

**Creation and Traversal of Doubly Circular Linked List:**

```java
public class HeaderLinkedList {
    Node head;  // The header node of the list

    // Constructor to initialize the header node
    public HeaderLinkedList() {
        head = new Node(0);  // The header node, data can be any value, typically 0 or -1
        head.next = null;
    }

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        Node current = head;
        // Traverse the list to find the last node
        while (current.next != null) {
            current = current.next;
        }
        // Link the new node
        current.next = newNode;
    }

    // Method to print the list from the head
    public void printList() {
        if (head.next == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head.next;  // Start from the first actual node
        System.out.print("Header Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to delete a node by its value
    public void delete(int key) {
        Node current = head;
        Node previous = null;

        // Traverse the list to find the node to be deleted
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        // If the node was found
        if (current.next != null) {
            current.next = current.next.next;  // Unlink the node
        }
    }

    public static void main(String[] args) {
        HeaderLinkedList list = new HeaderLinkedList();

        // Insert elements into the list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // Print the list
        System.out.println("Linked list:");
        list.printList();

        // Delete an element from the list
        list.delete(20);
        System.out.println("Linked list after deleting 20:");
        list.printList();
    }
}
```

**Time Complexity:**

The time complexity of creating a new node and inserting it at the end of the linked list is O(1).
The time complexity of traversing the linked list to display its contents is O(n), where n is the number of nodes in the list.
Therefore, the overall time complexity of creating and traversing a header linked list is O(n).

**Auxiliary Space:**

The space complexity of the program is O(n), where n is the number of nodes in the linked list.
This is because we are creating n nodes, each with a fixed amount of space required for storing the node information and a pointer to the next node.
Therefore, the overall auxiliary space complexity of the program is O(n).