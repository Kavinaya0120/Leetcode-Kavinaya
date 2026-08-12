// Last updated: 8/12/2026, 10:03:58 PM
1class Solution {
2    public int dayOfYear(String date) {
3
4        int year = Integer.parseInt(date.substring(0, 4));
5        int month = Integer.parseInt(date.substring(5, 7));
6        int day = Integer.parseInt(date.substring(8, 10));
7
8        int[] days = {
9            31, 28, 31, 30, 31, 30,
10            31, 31, 30, 31, 30, 31
11        };
12
13        if (isLeapYear(year)) {
14            days[1] = 29;
15        }
16
17        int result = day;
18
19        for (int i = 0; i < month - 1; i++) {
20            result += days[i];
21        }
22
23        return result;
24    }
25
26    private boolean isLeapYear(int year) {
27        return (year % 400 == 0) ||
28               (year % 4 == 0 && year % 100 != 0);
29    }
30}