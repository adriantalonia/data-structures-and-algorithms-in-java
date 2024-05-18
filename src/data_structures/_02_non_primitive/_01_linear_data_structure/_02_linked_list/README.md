# LInked LIst

<!-- TOC -->
* [LInked LIst](#linked-list)
  * [What is a Linked List?](#what-is-a-linked-list)
  * [Common Features of Linked List:](#common-features-of-linked-list)
  * [Importance of Linked List:](#importance-of-linked-list)
  * [Types of Linked Lists:](#types-of-linked-lists)
    * [Singly Linked List](#singly-linked-list-)
    * [Doubly Linked Lists](#doubly-linked-lists-)
    * [Circular Linked Lists](#circular-linked-lists)
<!-- TOC -->

> A Linked List is a linear data structure which looks like a chain of nodes, where each node contains a data field and a reference(link) to the next node in the list. Unlike Arrays, Linked List elements are not stored at a contiguous location.

## What is a Linked List?
Linked List is a linear data structure which looks like a series of nodes, where each node has two parts: data and next pointer. Unlike Arrays, Linked List elements are not stored at a contiguous location. In the linked list there is a head pointer, which points to the first element of the linked list, and if the list is empty then it simply points to null or nothing.

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
### Singly Linked List 
In this type of linked list, every node stores the address or reference of the next node in the list and the last node has the next address or reference as NULL. For example: 1->2->3->4->NULL

![img](/src/resources/img/singly-linked-list.png)

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

### Doubly Linked Lists 
In a doubly linked list, each node has two pointers: one pointing to the next node and one pointing to the previous node. This bidirectional structure allows for efficient traversal in both directions.

![img](/src/resources/img/doubly-linked-list.png)

### Circular Linked Lists
A circular linked list is a type of linked list in which the first and the last nodes are also connected to each other to form a circle, there is no NULL at the end.

![img](/src/resources/img/circular-linked-list.png)