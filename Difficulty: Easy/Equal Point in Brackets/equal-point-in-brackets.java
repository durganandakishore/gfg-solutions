class Solution {
    public int findIndex(String s) {
        // code here
        int close = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                close++;
            }
        }
        
        int open = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            if (open == close) {
                return i;
            }
            
            if (s.charAt(i) == '(') {
                open++;
            } else {
                close--;
            }
        }
        
        return s.length();
    }
}