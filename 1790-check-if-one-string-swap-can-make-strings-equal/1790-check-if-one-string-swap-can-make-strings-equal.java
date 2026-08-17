class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int first = -1;
        int second = -1;
        int diff = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff++;
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false;
                }
            }
        }
        if (diff == 0) {
            return true;
        }
        if (diff == 2) {
            return s1.charAt(first) == s2.charAt(second)
                && s1.charAt(second) == s2.charAt(first);
        }
        return false;
    }
}