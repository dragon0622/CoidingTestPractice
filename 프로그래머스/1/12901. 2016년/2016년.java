class Solution {
    public static String solution(int a, int b) {
        String answer = "";
        int sum = 0;

        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] daysOfMonth = {31,29,31,30,31,30,31,31,30,31,30,31};

        for (int i = 0; i < a-1; i++) {
            sum += daysOfMonth[i];
        }

        sum += (b-1);

        answer = day[sum%7];

        return answer;
    }
}