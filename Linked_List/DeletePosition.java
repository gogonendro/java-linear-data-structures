package Linked_List;

import java.util.*;

public class DeletePosition {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insert(int data) {
        Node newNode = new Node(data);
        Node current = head;

        if (this.head == null) {
            this.head = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // method to delete element from entered position
    boolean delPos(int pos, int n) {
        Node current = head;

        // if input position less than 1 or greater than n (number of elements)
        if (pos < 1 || pos > n) {
            System.out.println("Invalid"); // print invalid and return false
            return false;
        }

        // if input position 1
        else if (pos == 1) {
            head = current.next; // shift the head to the second element (current.next)
            return true;
        } else {

            // run till one position before the input position
            for (int i = 1; i < pos - 1; i++) {
                current = current.next;
            }
            // connect input's previous position to input's next position (skipping input
            // pos)
            current.next = current.next.next;
            return true;
        }
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeletePosition dp = new DeletePosition();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            dp.insert(sc.nextInt());
        }

        System.out.print("List: ");
        dp.printList();

        System.out.print("\nEnter position to delete from: ");
        int p = sc.nextInt();

        if (dp.delPos(p, n)) {
            System.out.print("List after deleting from " + p + " position: ");
            dp.printList();

            sc.close();
        }
    }
}
