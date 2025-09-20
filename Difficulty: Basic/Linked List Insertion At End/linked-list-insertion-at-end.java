/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    Node tail;

    public Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x);
        if (head == null) {
            tail = newNode;
            return newNode;
        }
        if (tail == null) {
            tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
        }
        tail.next = newNode;
        tail = newNode;
        return head;
    }
}
