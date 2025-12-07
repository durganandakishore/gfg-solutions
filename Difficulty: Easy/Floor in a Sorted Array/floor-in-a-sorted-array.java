class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
         int n = arr.length;
        if (x < arr[0]) return -1; 

        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                return i - 1;
            }
        }
        return n - 1;
    }
}
