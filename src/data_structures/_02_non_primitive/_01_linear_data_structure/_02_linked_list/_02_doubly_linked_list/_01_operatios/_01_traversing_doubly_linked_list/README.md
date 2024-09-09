# Traversing a doubly linked list

<!-- TOC -->
* [Traversing a doubly linked list](#traversing-a-doubly-linked-list)
  * [Doubly Linked List Node Class definition](#doubly-linked-list-node-class-definition)
  * [Doubly Linked List Class definition](#doubly-linked-list-class-definition)
  * [Main Method](#main-method)
  * [Explanation](#explanation)
<!-- TOC -->

Traversing a doubly linked list in Java involves iterating through the list from the head to the tail (forward traversal) or from the tail to the head (backward traversal).

## Doubly Linked List Node Class definition

```java
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
```

## Doubly Linked List Class definition

Next, let's define the DoublyLinkedList class with methods for forward and backward traversal:

```java
class DoublyLinkedList {
    Node head;
    Node tail;

    // Add a node to the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Forward traversal from head to tail
    public void traverseForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Backward traversal from tail to head
    public void traverseBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}
```

## Main Method

```java
class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);

        System.out.println("Forward Traversal:");
        dll.traverseForward();

        System.out.println("Backward Traversal:");
        dll.traverseBackward();
    }
}
```

**Output**
```
Forward Traversal:
1 2 3 4 
Backward Traversal:
4 3 2 1 
```

## Explanation

1. **Node Class**: Represents a node in the doubly linked list with data, prev, and next pointers.
2. **DoublyLinkedList Class**:
   - **append(int data)**: Adds a new node with the given data to the end of the list. 
   - **traverseForward()**: Traverses the list from the head to the tail, printing each node's data. 
   - **traverseBackward()**: Traverses the list from the tail to the head, printing each node's data. 
3. **Main Method**: Demonstrates the creation of a doubly linked list, appending nodes, and performing both forward and backward traversals.