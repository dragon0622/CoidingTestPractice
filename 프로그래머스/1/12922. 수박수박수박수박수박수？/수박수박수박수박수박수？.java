class Solution {
    public String solution(int n) {
        String answer = "";

        int cnt = 0;

        while(cnt < n){
            if (cnt%2 == 0){
                answer += "수";
            }else{
                answer += "박";
            }
            cnt++;
        }

        return answer;
    }
}