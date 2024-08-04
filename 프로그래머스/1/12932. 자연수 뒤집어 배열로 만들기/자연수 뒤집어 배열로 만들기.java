class Solution {
    public int[] solution(long n) {
        String dummy = "" + n;
        int size = dummy.length();
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            answer[i] = (int)(n%10);
            n/=10;
        }
        
        return answer;
    }
}