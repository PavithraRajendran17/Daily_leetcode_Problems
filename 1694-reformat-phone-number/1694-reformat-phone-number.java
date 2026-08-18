class Solution {
    public String reformatNumber(String number) {
        String digits = number.replace(" ", "")
                              .replace("-", "");
        StringBuilder result = new StringBuilder();
        int i = 0;
        int n = digits.length();
        while (n - i > 4) {
            if (result.length() > 0) {
                result.append("-");
            }
            result.append(digits.substring(i, i + 3));
            i += 3;
        }
        int remaining = n - i;
        if (remaining == 2) {
            if (result.length() > 0) {
                result.append("-");
            }
            result.append(digits.substring(i, i + 2));
        }
        else if (remaining == 3) {
            if (result.length() > 0) {
                result.append("-");
            }
            result.append(digits.substring(i, i + 3));
        }
        else if (remaining == 4) {
            if (result.length() > 0) {
                result.append("-");
            }
            result.append(digits.substring(i, i + 2));
            result.append("-");
            result.append(digits.substring(i + 2, i + 4));
        }
        return result.toString();
    }
}