package data_structures._02_non_primitive._01_linear_data_structure._02_linked_list._01_singly_linked_list._01_operations._03_insert_at_a_specific_position;

public class InsertAtSpecificPosition {

    // Function to insert a node at a specific position in
    // the linked list
    public static Node
    insertAtPosition(Node head, int position, int data) {
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

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(" " + head.data);
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
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

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
