/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
         if (head == null || head.next == null) return;

        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) break;
        }

        if (fast == null || fast.next == null) return;

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        Node temp = fast;
        while (temp.next != slow) {
            temp = temp.next;
        }

        temp.next = null;
    }
}