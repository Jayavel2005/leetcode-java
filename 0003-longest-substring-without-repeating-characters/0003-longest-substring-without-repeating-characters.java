class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() <= 0) return 0; 

        HashSet<Character> seen = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            
            while (seen.contains(s.charAt(r))) {
                seen.remove(s.charAt(l));
                l++;
            }

            seen.add(s.charAt(r));
            max = Math.max(max, r - l + 1); 
        }

        return max;

    }
}
