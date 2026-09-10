class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        List<Integer> result = new ArrayList<>();

        int selectedSum = 0;

        for (int i = nums.length - 1; i >= 0; i--) {

            selectedSum += nums[i];
            result.add(nums[i]);

            if (selectedSum > total - selectedSum) {
                break;
            }
        }

        return result;
        
    }
}