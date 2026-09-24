class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int window_sum = 0;
        int count = 0;

        for (int i = 0; i < k; i++) window_sum += arr[i];

        if (window_sum / k >= threshold) count++;

        for (int i = k; i < arr.length; i++) {
            window_sum += arr[i] - arr[i-k];

            if (window_sum / k >= threshold) count++;
        }

        return count;
        
    }
}