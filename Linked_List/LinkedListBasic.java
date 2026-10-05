package Linked_List;

//Node class creates int variable named 'data' and a Node named 'next'
class Node {
    int data;
    Node next;

    // parameterized constructor to initialize data
    Node(int data) {
        this.data = data;
        this.next = null; // next default null
    }
}

public class LinkedListBasic {
    public static void main(String[] args) {

        // creating three nodes
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        // connecting the nodes
        n1.next = n2;
        n2.next = n3;

        Node head = n1; // head points to the first node
        Node current = head; // current node is head

        // runs until current becomes null
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next; // next node becomes current
        }
    }
}
