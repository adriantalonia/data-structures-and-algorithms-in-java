# Linked List

<!-- TOC -->
* [Linked List](#linked-list)
  * [What is a Linked List?](#what-is-a-linked-list)
  * [Common Features of Linked List:](#common-features-of-linked-list)
  * [Importance of Linked List:](#importance-of-linked-list)
  * [Types of Linked Lists:](#types-of-linked-lists)
    * [Singly Linked List 🔗](#singly-linked-list-)
      * [The structure of the singly linked list](#the-structure-of-the-singly-linked-list)
    * [Doubly Linked Lists 🔗](#doubly-linked-lists--)
    * [Circular Linked Lists](#circular-linked-lists)
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

### [Singly Linked List](_01_singly_linked_list/README.md) 🔗
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

### [Doubly Linked Lists](_02_doubly_linked_list/README.md) 🔗 
> A doubly linked list or a two-way linked list is a more complex type of linked list that contains a pointer to the next as well as the previous node in sequence.

In a doubly linked list, each node has two pointers: one pointing to the next node and one pointing to the previous node. This bidirectional structure allows for efficient traversal in both directions.

![img](/src/resources/img/doubly-linked-list.png)

**Structure of Doubly Linked List:**

```java
class Node { 
    int data;
    // Pointer to next node in DLL 
    Node next;
    // Pointer to the previous node in DLL 
    Node prev; 
}
```

---
### Circular Linked Lists
> A circular linked list is that in which the last node contains the pointer to the first node of the list.

A circular linked list is a type of linked list in which the first and the last nodes are also connected to each other to form a circle, there is no NULL at the end.

![img](/src/resources/img/circular-linked-list.png)

**Structure of the Circular Linked List:**
```java
class Node { 
    int data;
    // Pointer to next node in CLL 
    Node next; 
}; 
```
