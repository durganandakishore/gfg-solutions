class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;

        int repeating = -1;
        int missing = -1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                repeating = arr[i];
                break;
            }
        }
        int expected = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == expected) {
                expected++;
            }
        }
        missing = expected;

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(repeating);
        ans.add(missing);
        return ans;
    }
}
