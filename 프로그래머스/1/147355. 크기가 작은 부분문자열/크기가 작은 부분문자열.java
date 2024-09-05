class Solution {
    public static int solution(String t, String p) {
        int answer = 0;
        int start = 0;
        int end = p.length();

        long pValue = Long.parseLong(p);
        
        while(end<=t.length()) {

            long target = Long.parseLong(t.substring(start, end));

            if (pValue >= target) answer++;

            start++;
            end++;
        }
        return answer;
    }
}