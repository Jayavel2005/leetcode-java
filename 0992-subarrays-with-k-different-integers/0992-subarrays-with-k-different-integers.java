class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int maxK = atmostK(nums, k);
        int minK = atmostK(nums, k - 1);

        return maxK - minK;
    }

    public int atmostK(int[] nums, int k) {
        int l = 0;
        int max = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int r = 0; r < nums.length; r++) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while (map.size() > k) {
                map.put(nums[l], map.get(nums[l]) - 1);

                if (map.get(nums[l]) == 0) map.remove(nums[l]);

                l++;
            }

            max += r - l + 1;
        }

        return max;
    }
}