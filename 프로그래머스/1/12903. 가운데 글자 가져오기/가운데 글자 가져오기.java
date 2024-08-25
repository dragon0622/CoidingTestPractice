class Solution {
    public static String solution(String s) {
        String answer = "";
        int halfLen = s.length()/2;

        if (s.length() % 2 != 0){
            answer += s.charAt(halfLen);
        }else{
            answer += s.charAt(halfLen-1);
            answer += s.charAt(halfLen);
        }

        return answer;
    }
}