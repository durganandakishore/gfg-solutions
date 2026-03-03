class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
         int n = arr.length;
        int insertPos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[insertPos] = arr[i];
                insertPos++;
            }
        }
        while (insertPos < n) {
            arr[insertPos] = 0;
            insertPos++;
        }
    }
}