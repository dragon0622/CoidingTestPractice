class Solution {
    public int solution(int a, int b) {
        String answer_s1 = Integer.toString(a) + Integer.toString(b);
        String answer_s2 = Integer.toString(b) + Integer.toString(a);



        if (Integer.parseInt(answer_s2) > Integer.parseInt(answer_s1)){
            return Integer.parseInt(answer_s2);
        }
        else{
            return Integer.parseInt(answer_s1);
        }
    }
}