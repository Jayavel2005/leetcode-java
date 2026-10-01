class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int alreadySatisfied = 0;

        for (int i = 0; i < grumpy.length; i++) {
            if (grumpy[i] == 0) {
                alreadySatisfied += customers[i];
            }
        }

        int baseGain = 0;

        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                baseGain += customers[i];
            }
        }

        int maxGain = baseGain;

        for (int i = minutes; i < grumpy.length; i++) {
            if (grumpy[i-minutes] == 1) {
                baseGain -= customers[i-minutes];
            }

            if (grumpy[i] == 1) {
                baseGain += customers[i];
            }

            maxGain = Math.max(baseGain, maxGain);
        }
        return maxGain + alreadySatisfied;
    }
}