# Singly Linked List

<!-- TOC -->
* [Singly Linked List](#singly-linked-list)
  * [Singly Linked List definition & meaning DSA](#singly-linked-list-definition--meaning-dsa)
  * [Structure of a Singly Linked List](#structure-of-a-singly-linked-list)
  * [Characteristics of a Singly Linked List:](#characteristics-of-a-singly-linked-list)
  * [Application of Singly Linked Lists:](#application-of-singly-linked-lists)
<!-- TOC -->

## Singly Linked List definition & meaning DSA

> A singly linked list is a special type of linked list in which each node has only one link that points to the next node in the linked list.

A singly linked list is a data structure consisting of a sequence of elements, each containing data and a reference (or link) to the next element in the sequence. Unlike arrays, linked lists do not require contiguous memory locations, making them efficient for insertions and deletions.

## Structure of a Singly Linked List
A singly linked list is composed of nodes. Each node has two components:

1) Data: The value stored in the node.
2) Next: A reference to the next node in the list.

**Code:**

```java
class Node {
int data;
Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

## Characteristics of a Singly Linked List:
- Each node holds a single value and a reference to the next node in the list.
- The list has a head, which is a reference to the first node in the list, and a tail, which is a reference to the last node in the list.
- The nodes are not stored in a contiguous block of memory, but instead, each node holds the address of the next node in the list.
- Accessing elements in a singly linked list requires traversing the list from the head to the desired node, as there is no direct access to a specific node in memory.

## Application of Singly Linked Lists:
- **Memory management:** Singly linked lists can be used to implement memory pools, in which memory is allocated and deallocated as needed.
- **Database indexing:** Singly linked lists can be used to implement linked lists in databases, allowing for fast insertion and deletion operations.
- **Representing polynomials and sparse matrices:** Singly linked lists can be used to efficiently represent polynomials and sparse matrices, where most elements are zero.
- **Operating systems:** Singly linked lists are used in operating systems for tasks such as scheduling processes and managing system resources.