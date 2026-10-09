class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] count = new int[101];
        int pairs = 0;
        int leftover = 0;
        for (int n : nums) {
            count[n]++;
        }
        for (int n : count) {
            pairs += n / 2;
            leftover += n % 2;
        }
        return new int[]{pairs, leftover};
    }
}