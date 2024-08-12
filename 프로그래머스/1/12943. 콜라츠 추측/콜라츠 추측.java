class Solution {
    public static long solution(long num) {
        long answer = 0;
        int cnt = 0;

        if (num == 1){
            return 0;
        }
        
        while(cnt < 500){
            if (num%2 == 0){
                num /= 2;
            }
            else{
                num = num * 3 + 1;
            }

            if (num == 1){
                return cnt+1;
            }

            cnt++;
        }

        answer = -1;


        return answer;
    }
}