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
}
*/

class Solution {
    public int GetNth(Node head, int index) {
        // Code here
        if(head == null){
            return -1;
        }
        int pos = 1;
        Node temp = head;
        while(temp != null){
            if(pos == index){
                return temp.data;
            }
            pos++;
            temp = temp.next;
        }
        return -1;
    }
}