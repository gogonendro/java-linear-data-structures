package Stack;

import java.util.*;

public class PalinCheck {
    Scanner sc = new Scanner(System.in);
    String w, rw = "";
    char arr[];
    int l, top;

    void acc() {
        System.out.println("Enter a word:");
        w = sc.next();
        l = w.length();

        arr = new char[l];
        top = -1; // top must always be initialized with -1
    }

    void push() {
        for (int i = 0; i < l; i++) {
            top++; // increase top by 1
            arr[top] = w.charAt(i); // put the character in the new place
        }
    }

    String rev() {
        System.out.println("Reverse of word:");

        while (top >= 0) {
            rw += arr[top]; // top --> bottom, hence reverse of word
            top--;
        }
        return rw;
    }

    void check() {
        if (w.equals(rw)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) {
        PalinCheck obj = new PalinCheck();
        obj.acc();
        obj.push();
        obj.rev();
        obj.check();
        obj.sc.close();
    }
}
