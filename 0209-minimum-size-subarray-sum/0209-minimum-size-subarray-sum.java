class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int max = Integer.MAX_VALUE;

        int l = 0;

        int sum = 0;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];

            while (sum >= target) {
                max = Math.min(max, r-l+1);
                sum -= nums[l];
                l++;
            }
        }   

        return max == Integer.MAX_VALUE ? 0 : max;
    }

}