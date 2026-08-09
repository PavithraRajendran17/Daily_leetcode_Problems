class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] available = new int[26];
        for (char c : chars.toCharArray()) {
            available[c - 'a']++;
        }
        int result = 0;
        for (String word : words) {
            int[] count = new int[26];
            boolean canForm = true;
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
                if (count[c - 'a'] > available[c - 'a']) {
                    canForm = false;
                    break;
                }
            }
            if (canForm) {
                result += word.length();
            }
        }
        return result;
    }
}