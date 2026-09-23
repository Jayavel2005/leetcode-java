class Solution {
    public int maxArea(int[] height) {
        
        // if (height.length == 2 ) return Math.min(height[0], height[1]);

        int water = Integer.MIN_VALUE;
        // for (int i = 0; i <= height.length-2; i++) {
        //     for (int j = height.length - 1; j > i; j--) {
        //         int area = Math.min(height[i], height[j]) * (j - i);
        //         water = Math.max(water, area);
        //     }
        // }

        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            water = Math.max(water, area);

            if (height[left] < height[right]) left++;
            else right--;
        }
        return water;
    }
}