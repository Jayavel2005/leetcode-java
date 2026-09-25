class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m;

        for (int num : nums2) {
            int j = last - 1;

            while ( j >= 0 && nums1[j] > num) {
                nums1[j+1] = nums1[j];
                j--;
            }
            nums1[j+1] = num;
            last++;
        }   
    }
}