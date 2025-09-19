class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        int n = arr.length;
        List<Integer> duup = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
                duup.add(arr[i]);
                i++;
            }
        }
        return duup;
    }
}