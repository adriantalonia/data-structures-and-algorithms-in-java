package data_structures._02_non_primitive._01_linear_data_structure._02_linked_list._01_singly_linked_list._01_operations._04_deleting_from_the_beginning;

public class DeletionAtBeginning {
    // Delete the head node and return the new head
    static Node deleteHead(Node head) {

        // Check if the list is empty
        if (head == null)
            return null;

        // Store the current head in a temporary variable
        Node temp = head;

        // Move the head pointer to the next node
        head = head.next;

        // Help the garbage collector by
        // removing the reference
        temp = null;

        return head;
    }

    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 3 -> 12 -> 15 -> 18
        Node head = new Node(3);
        head.next = new Node(12);
        head.next.next = new Node(15);
        head.next.next.next = new Node(18);
        System.out.print("Beginning: ");
        printList(head);
        head = deleteHead(head);
        System.out.print("\nAfter Deletion: ");
        printList(head);
    }
}


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}