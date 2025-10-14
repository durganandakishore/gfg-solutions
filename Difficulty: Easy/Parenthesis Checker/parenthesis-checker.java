class Solution {
    public boolean isBalanced(String s) {
        // code here
        char[] arr = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                top++;
                arr[top] = ch;
            } else {
                if (top == -1) return false;

                char open = arr[top];
                if ((ch == ')' && open != '(') ||
                    (ch == '}' && open != '{') ||
                    (ch == ']' && open != '[')) {
                    return false;
                }
                top--;
            }
        }

        return top == -1;
    }
}
