class Solution {
    public String reformatDate(String date) {
        String[] parts = date.split(" ");
        String day = parts[0].substring(0, parts[0].length() - 2);
        String month = parts[1];
        String year = parts[2];
        String[] months = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };
        int monthNum = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i].equals(month)) {
                monthNum = i + 1;
                break;
            }
        }
        return year + "-" +
               String.format("%02d", monthNum) + "-" +
               String.format("%02d", Integer.parseInt(day));
    }
}