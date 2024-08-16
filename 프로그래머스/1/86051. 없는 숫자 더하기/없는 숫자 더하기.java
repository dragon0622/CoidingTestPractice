class Solution {
    public static int solution(int[] numbers) {
        int answer = -1;

        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }

        answer = 44 - answer;
        
        return answer;
    }
}