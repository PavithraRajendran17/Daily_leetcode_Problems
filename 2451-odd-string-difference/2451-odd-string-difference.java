class Solution {
    public String oddString(String[] words) {
        int[] a = getDifference(words[0]);
        int[] b = getDifference(words[1]);
        int[] c = getDifference(words[2]);

        if (Arrays.equals(a, b)) {
            for (int i = 3; i < words.length; i++) {
                if (!Arrays.equals(a, getDifference(words[i]))) {
                    return words[i];
                }
            }
            return words[2];
        }

        if (Arrays.equals(a, c)) {
            return words[1];
        }

        return words[0];
    }

    private int[] getDifference(String word) {
        int[] diff = new int[word.length() - 1];

        for (int i = 0; i < word.length() - 1; i++) {
            diff[i] = word.charAt(i + 1) - word.charAt(i);
        }

        return diff;
    }
}