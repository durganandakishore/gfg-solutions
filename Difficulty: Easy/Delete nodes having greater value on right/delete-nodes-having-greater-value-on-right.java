/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution {
    Node compute(Node head) {
        // your code here
       if (head == null || head.next == null) return head;

        head = reverse(head);  
        Node curr = head;
        Node prev = head;
        int max = curr.data;
        curr = curr.next;

        while (curr != null) {
            if (curr.data >= max) {
                max = curr.data;
                prev = curr;
            } else {
                prev.next = curr.next; 
            }
            curr = curr.next;
        }

        head = reverse(head);
        return head;
    }

    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}