/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
// complete the below function
class Solution {
    public static int count(Node head, int key) {
        // code here
        int c = 0;
        Node temp = head;
        
        while(temp != null){
            if(temp.data == key){
                c++;
            }
            temp = temp.next;
        }
        
        return c;
    }
}