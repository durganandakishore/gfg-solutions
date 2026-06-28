/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        // code here
        ArrayList <Integer> result = new ArrayList<>();
        rightSideView(root,result,0);
        return result;
    }
    public void rightSideView(Node Curr,List<Integer> result,int CurrDepth){
        if(Curr == null){
            return;
        }
        if(CurrDepth == result.size()){
            result.add(Curr.data);
        }
        rightSideView(Curr.right,result,CurrDepth + 1);
        rightSideView(Curr.left,result,CurrDepth + 1);
    }
}