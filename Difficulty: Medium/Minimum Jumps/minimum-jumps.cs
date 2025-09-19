public class Solution {
    public int minJumps(int[] arr) {
        // code here
        int n = arr.Length;
        if (n == 0 || arr[0] == 0) return -1;
        if (n == 1) return 0;

        int maxReach = arr[0];
        int steps = arr[0];
        int jumps = 1;

        for (int i = 1; i < n; i++) {
            if (i == n - 1) return jumps;

            maxReach = Math.Max(maxReach, i + arr[i]);
            steps--;

            if (steps == 0) {
                jumps++;
                if (i >= maxReach) return -1;
                steps = maxReach - i;
            }
        }
        return -1;
    }
}
