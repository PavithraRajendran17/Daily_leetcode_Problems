class Solution {
    public String reorderSpaces(String text) {
        int spaces = 0;
        for (char ch : text.toCharArray()) {
            if (ch == ' ') {
                spaces++;
            }
        }
        String[] words = text.trim().split("\\s+");
        int gaps = words.length - 1;
        if (gaps == 0) {
            return words[0] + " ".repeat(spaces);
        }
        int between = spaces / gaps;
        int extra = spaces % gaps;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);
            if (i < gaps) {
                result.append(" ".repeat(between));
            }
        }
        result.append(" ".repeat(extra));
        return result.toString();
    }
}