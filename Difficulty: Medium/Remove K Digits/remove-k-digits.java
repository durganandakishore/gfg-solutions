class Solution {
    public String removeKdig(String s, int k) {
        // code here
         StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            while (sb.length() > 0 && k > 0 && sb.charAt(sb.length() - 1) > ch) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }

            sb.append(ch);
        }

        while (k > 0 && sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        int idx = 0;
        while (idx < sb.length() && sb.charAt(idx) == '0') {
            idx++;
        }

        sb.delete(0, idx);

        if (sb.length() == 0) {
            return "0";
        }

        return sb.toString();
    }
}