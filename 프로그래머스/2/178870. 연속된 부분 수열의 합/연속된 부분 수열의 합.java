class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {0,0};
        
        int sum = 0;
        int start = 0;
        int end;
        int shorterArr = sequence.length;

        for (end = 0; end < sequence.length; end++) {
            sum += sequence[end];

            while (sum > k) {
                sum -= sequence[start++];
            }

            if (sum == k) {
                int currentSize = end - start;

                if (currentSize < shorterArr) {
                    shorterArr = currentSize;
                    answer[0] = start;
                    answer[1] = end;
                } else if (currentSize == shorterArr) {
                    answer[0] = Math.min(answer[0], start);
                    answer[1] = Math.min(answer[1], end);
                }
            }
        }
        return answer;
    }
}