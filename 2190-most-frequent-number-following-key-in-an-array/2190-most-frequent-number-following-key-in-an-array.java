class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] count = new int[1001];
        int max = 0;
        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                count[nums[i + 1]]++;

                if (count[nums[i + 1]] > max) {
                    max = count[nums[i + 1]];
                    result = nums[i + 1];
                }
            }
        }

        return result;
        
    }
}