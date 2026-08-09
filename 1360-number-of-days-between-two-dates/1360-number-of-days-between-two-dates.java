class Solution {
    public int daysBetweenDates(String date1, String date2) {
         return Math.abs(toDays(date1) - toDays(date2));
    }
    private int toDays(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        int totalDays = year * 365;
        totalDays += (year - 1) / 4;
        totalDays -= (year - 1) / 100;
        totalDays += (year - 1) / 400;
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }
        if (month > 2 && isLeapYear(year)) {
            totalDays++;
        }
        totalDays += day;
        return totalDays;
    }
    private boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
        
    }
}