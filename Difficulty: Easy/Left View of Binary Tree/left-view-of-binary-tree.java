/*
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
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        leftViewUtil(root, result, 0);
        return result;
    }
    public void leftViewUtil(Node curr,ArrayList<Integer> result,int currDepth) {
        if (curr == null) {
            return;
        }
        if (currDepth == result.size()) {
            result.add(curr.data);
        }
        leftViewUtil(curr.left, result, currDepth + 1);
        leftViewUtil(curr.right, result, currDepth + 1);
    }
}