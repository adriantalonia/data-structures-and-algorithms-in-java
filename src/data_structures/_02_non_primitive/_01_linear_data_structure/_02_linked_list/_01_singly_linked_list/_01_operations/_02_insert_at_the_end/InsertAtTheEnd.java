package data_structures._02_non_primitive._01_linear_data_structure._02_linked_list._01_singly_linked_list._01_operations._02_insert_at_the_end;

public class InsertAtTheEnd {
    static Node insertAtEnd(Node head, int newData) {

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

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
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

class Node {
    int data;
    Node next;

    Node(int newData) {
        data = newData;
        next = null;
    }
}