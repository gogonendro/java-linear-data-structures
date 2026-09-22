package Queue;

import java.util.*;

public class QueuePalin {
    Scanner sc = new Scanner(System.in);
    String w, rw = "";
    char que[];
    int size, front, rear;

    void acc() {
        System.out.print("Enter a word: ");
        w = sc.next();
        size = w.length();

        que = new char[size];
        front = 0;
        rear = -1; // because string counting starts from 0
    }

    void add_ele() {
        for (int i = 0; i < size; i++) {
            rear += 1;
            que[rear] = w.charAt(i);
        }
    }

    String getRev() {
        rw = "";
        for (int i = rear; i >= front; i--) {
            rw += que[i];
        }
        return rw;
    }

    void check() {
        if (rw.equals(w)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) {
        QueuePalin ob = new QueuePalin();
        ob.acc();
        ob.add_ele();
        ob.getRev();
        ob.check();
        ob.sc.close();
    }
}
