class Solution {
    public String reformat(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else {
                digits.append(ch);
            }
        }
        if (Math.abs(letters.length() - digits.length()) > 1) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        boolean letterFirst = letters.length() >= digits.length();
        int i = 0, j = 0;
        while (i < letters.length() || j < digits.length()) {
            if (letterFirst && i < letters.length()) {
                result.append(letters.charAt(i++));
            } else if (!letterFirst && j < digits.length()) {
                result.append(digits.charAt(j++));
            }
            letterFirst = !letterFirst;
        }
        return result.toString();
    }
}