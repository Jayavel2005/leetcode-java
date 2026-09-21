class Solution {
    public int[] replaceElements(int[] arr) {
        int rightMax = -1;
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            ans[i] = rightMax;
            rightMax = Math.max(rightMax, arr[i]);
        }   
        return ans;
    }
}