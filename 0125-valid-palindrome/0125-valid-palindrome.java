class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;
        while (left < right) {

            while (left < right &&
                !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right &&
                !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            char chl = Character.toLowerCase(s.charAt(left));
            char chr = Character.toLowerCase(s.charAt(right));

            if (chl != chr)
                return false;

            left++;
            right--;
        }
        return true;
    }
}