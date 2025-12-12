class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
         for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat[0].length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < mat[0].length; j++) {
                row.add(mat[i][j]);
            }
            ans.add(row);
        }

        return ans;
    }
}