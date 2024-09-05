# Doubly Linked List

A doubly linked list is a more complex data structure than a singly linked list, but it offers several advantages. The main advantage of a doubly linked list is that it allows for efficient traversal of the list in both directions. This is because each node in the list contains a pointer to the previous node and a pointer to the next node. This allows for quick and easy insertion and deletion of nodes from the list, as well as efficient traversal of the list in both directions.

<!-- TOC -->
* [Doubly Linked List](#doubly-linked-list)
  * [What is a Doubly Linked List?](#what-is-a-doubly-linked-list)
  * [Representation of Doubly Linked List in Data Structure](#representation-of-doubly-linked-list-in-data-structure)
<!-- TOC -->

## What is a Doubly Linked List?

A doubly linked list is a data structure that consists of a set of nodes, each of which contains a value and two pointers, one pointing to the previous node in the list and one pointing to the next node in the list. This allows for efficient traversal of the list in both directions, making it suitable for applications where frequent insertions and deletions are required.

## Representation of Doubly Linked List in Data Structure

In a data structure, a doubly linked list is represented using nodes that have three fields:

1. Data
2. A pointer to the next node (next)
3. A pointer to the previous node (prev)

![img](/src/resources/img/doubly-linked-list-representation.png)

## Node Definition

Here is how a node in a Doubly Linked List is typically represented:

```java
class Node {

    // To store the Value or data.
    int data;

    // Reference to the Previous Node
    Node prev;
  
    // Reference to the next Node
    Node next;
  
    // Constructor
    Node(int d) {
       data = d;
       prev = next = null;      
    }
};
```

Each node in a Doubly Linked List contains the data it holds, a pointer to the next node in the list, and a pointer to the previous node in the list. By linking these nodes together through the next and prev pointers, we can traverse the list in both directions (forward and backward), which is a key feature of a Doubly Linked List.

## Operations on Doubly Linked List

- Traversal in Doubly Linked List
- Searching in Doubly Linked List
- Finding Length of Doubly Linked List
- Insertion in Doubly Linked List:
  - Insertion at the beginning of Doubly Linked List
  - Insertion at the end of the Doubly Linked List
  - Insertion at a specific position in Doubly Linked List
- Deletion in Doubly Linked List:
  - Deletion of a node at the beginning of Doubly Linked List
  - Deletion of a node at the end of Doubly Linked List
  - Deletion of a node at a specific position in Doubly Linked List