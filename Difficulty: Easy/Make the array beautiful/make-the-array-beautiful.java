class Solution {
    List<Integer> makeBeautiful(int[] arr) {
        // code here
        List<Integer> ans = new ArrayList<>();
        for (int num : arr) {
            int size = ans.size();
            if (size > 0 &&
               ((ans.get(size - 1) >= 0 && num < 0) ||
                (ans.get(size - 1) < 0 && num >= 0))) {
                ans.remove(size - 1);
            }
            else {
                ans.add(num);
            }
        }
        return ans;
    }
}