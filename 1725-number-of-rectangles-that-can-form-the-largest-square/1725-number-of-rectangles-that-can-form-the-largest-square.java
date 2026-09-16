class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;
        int count = 0;

        for (int[] rect : rectangles) {

            int len = Math.min(rect[0], rect[1]);

            if (len > maxLen) {
                maxLen = len;
                count = 1;
            } else if (len == maxLen) {
                count++;
            }
        }

        return count;
        
    }
}