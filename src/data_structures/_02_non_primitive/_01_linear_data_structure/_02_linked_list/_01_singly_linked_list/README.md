# Singly Linked List

<!-- TOC -->
* [Singly Linked List](#singly-linked-list)
  * [Singly Linked List definition & meaning DSA](#singly-linked-list-definition--meaning-dsa)
  * [Structure of a Singly Linked List](#structure-of-a-singly-linked-list)
  * [Characteristics of a Singly Linked List:](#characteristics-of-a-singly-linked-list)
  * [Application of Singly Linked Lists:](#application-of-singly-linked-lists)
  * [Operations on Singly Linked List:](#operations-on-singly-linked-list)
    * [Inserting At the Beginning of the list](#inserting-at-the-beginning-of-the-list)
    * [Inserting At End of the list](#inserting-at-end-of-the-list)
    * [Insert at a specific position in list](#insert-at-a-specific-position-in-list)
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

## Operations on Singly Linked List:
- Traversal
- Searching
- Length
- Insertion:
  - Insert at the beginning
  - Insert at the end
  - Insert at a specific position
- Deletion:
  - Delete from the beginning
  - Delete from the end
  - Delete a specific node

### Inserting At the Beginning of the list

To insert a new node at the front, we create a new node and point its next reference to the current head of the linked list. Then, we update the head to be this new node. This operation is efficient because it only requires adjusting a few pointers.

**Algorithm**:

- Make the first node of Linked List linked to the new node
- Remove the head from the original first node of Linked List
- Make the new node as the Head of the Linked List.

```java
// Java Program to insert the node at the beginning of
// Linked List

class Node {
    int data;
    Node next;

    Node(int new_data)
    {
        data = new_data;
        next = null;
    }
}

public class GFG {
    // Function to insert a new node at the beginning of the
    // list
    public static Node insertAtFront(Node head,
                                     int new_data)
    {
        // Create a new node with the given data
        Node new_node = new Node(new_data);

        // Make the next of the new node point to the
        // current head
        new_node.next = head;

        // Return the new node as the new head of the list
        return new_node;
    }

    public static void printList(Node head)
    {
        Node curr = head;
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        // Create the linked list 2->3->4->5
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        // Print the original list
        System.out.println("Original Linked List:");
        printList(head);

        // Insert a new node at the front of the list
        System.out.println(
            "After inserting Nodes at the front:");
        int data = 1;
        head = insertAtFront(head, data);

        // Print the updated list
        printList(head);
    }
}
```

```
Original Linked List: 2 3 4 5
After inserting Nodes at the front: 1 2 3 4 5
```

- **Time Complexity**: O(1), We have a pointer to the head and we can directly attach a node and update the head pointer. So, the Time complexity of inserting a node at the head position is O(1).
- **Auxiliary Space**: O(1)

### Inserting At End of the list

Inserting at the end involves traversing the entire list until we reach the last node. We then set the last node’s next reference to point to the new node, making the new node the last element in the list.

***Algorithm:***

- Go to the last node of the Linked List
- Change the next pointer of last node from NULL to the new node
- Make the next pointer of new node as NULL to show the end of Linked List

```java
// Java Program to Insert a Node at the End of Linked List

class Node {
    int data;
    Node next;

    Node(int newData)
    {
        data = newData;
        next = null;
    }
}

public class GfG {

    // Function appends a new node at the end and returns
    // the head.
    static Node insertAtEnd(Node head, int newData)
    {

        // Create a new node
        Node newNode = new Node(newData);

        // If the Linked List is empty, make the new
        // node as the head and return
        if (head == null) {
            return newNode;
        }

        // Store the head reference in a temporary variable
        Node last = head;

        // Traverse till the last node
        while (last.next != null) {
            last = last.next;
        }

        // Change the next pointer of the
        // last node to point to the new node
        last.next = newNode;

        // Return the head of the list
        return head;
    }

    public static void printList(Node node)
    {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }

    public static void main(String[] args)
    {
        // Create a linked list:
        // 2 -> 3 -> 4 -> 5 -> 6
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);

        System.out.print("Created Linked list is:");
        printList(head);

        // Example of appending a node at the end
        head = insertAtEnd(head, 1);

        System.out.print("\nAfter inserting 1 at the end:");
        printList(head);
    }
}
```

```
Created Linked list is: 2 3 4 5 6 
After inserting 1 at the end: 2 3 4 5 6 1 
```

- **Time complexity**: O(N), where N is the number of nodes in the linked list. Since there is a loop from head to end, the function does O(n) work.
- **Auxiliary Space**: O(1)

### Insert at a specific position in list

To insert a new node at a specific position, we need to traverse the list to position – 1. If the position is valid, we adjust the pointers similarly such that the next pointer of the new node points to the next of current nod and next pointer of current node points to the new node.

**Algorithm:**

- Traverse the Linked list upto position-1 nodes.
- Once all the position-1 nodes are traversed, allocate memory and the given data to the new node.
- Point the next pointer of the new node to the next of current node.
- Point the next pointer of current node to the new node.

```Java
// Java Program to Insert a Node At a Specific Position in
// Linked List
class Node {
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class GFG {
    // Function to insert a node at a specific position in
    // the linked list
    public static Node
    insertAtPosition(Node head, int position, int data)
    {
        Node newNode = new Node(data);

        // If inserting at the beginning
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node current = head;
        for (int i = 1; i < position - 1 && current != null;
             ++i) {
            current = current.next;
        }

        // If the position is out of bounds
        if (current == null) {
            System.out.println(
                "Position is out of bounds.");
            return head;
        }

        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    public static void printList(Node head)
    {
        while (head != null) {
            System.out.print(" " + head.data);
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        // Creating the list 3->5->8->10
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(8);
        head.next.next.next = new Node(10);

        System.out.print("Linked list before insertion:");
        printList(head);

        // Insert a new node with data 12 at position 3
        int data = 12, pos = 2;
        head = insertAtPosition(head, pos, data);
        System.out.print("Linked list after insertion of 12 at position " + pos + ":");
        printList(head);
    }
}
```

**Output**
```
Linked list before insertion: 3 5 8 10
Linked list after insertion of 12 at position 3: 3 12 5 8 10
```

- **Time complexity**: O(N), where N is the number of nodes in the linked list. Since there is a loop from head to end, the function does O(n) work.
- **Auxiliary Space**: O(1)