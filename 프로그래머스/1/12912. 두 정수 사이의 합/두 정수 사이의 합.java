class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        int bigInt = a;
        int smallInt = b;

        if (a!=b){
            if (a<b){
                bigInt = b;
                smallInt = a;
            }

            for (int i = smallInt; i <= bigInt; i++) {
                answer += i;
            }
        }

        else {
            answer = a;
        }


        return answer;
    }
}