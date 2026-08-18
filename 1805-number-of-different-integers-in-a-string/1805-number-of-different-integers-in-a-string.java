class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        int i = 0;
        while (i < word.length()) {
            if (!Character.isDigit(word.charAt(i))) {
                i++;
                continue;
            }
            int j = i;

            while (j < word.length() &&
                   Character.isDigit(word.charAt(j))) {
                j++;
            }
            String num = word.substring(i, j);
            num = num.replaceFirst("^0+", "");
            if (num.length() == 0) {
                num = "0";
            }

            set.add(num);

            i = j;
        }

        return set.size();
    }
}