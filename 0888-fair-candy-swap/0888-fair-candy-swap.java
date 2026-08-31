class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
        int bobTotal = 0;
        for (int x : aliceSizes) {
            aliceTotal += x;
        }
        for (int x : bobSizes) {
            bobTotal += x;
        }
        int diff = (bobTotal - aliceTotal) / 2;
        HashSet<Integer> set = new HashSet<>();
        for (int x : bobSizes) {
            set.add(x);
        }
        for (int x : aliceSizes) {
            int y = x + diff;
            if (set.contains(y)) {
                return new int[]{x, y};
            }
        }
        return new int[0];
    }
}