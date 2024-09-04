import java.io.*;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public static int[] solution(int[] answers) {
        List<Integer> answerList = new ArrayList<>();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int aSum = 0, bSum = 0, cSum = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % 5]) {
                aSum++;
            }
            if (answers[i] == b[i % 8]) {
                bSum++;
            }
            if (answers[i] == c[i % 10]) {
                cSum++;
            }
        }

        int high = Math.max(aSum,Math.max(bSum,cSum));

        if (aSum == high){
            answerList.add(1);
        }
        if (bSum == high){
            answerList.add(2);
        }
        if (cSum == high){
            answerList.add(3);
        }

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}