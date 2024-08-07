class Solution {
    public String solution(int a, int b) {
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] DayOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int sum = b;
        for (int i = 0; i < a - 1; i++) {
            sum += DayOfMonth[i];
        }
        
        return day[sum % 7];
    }
}