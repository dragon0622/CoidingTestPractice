import java.io.*;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        int t = m;

        int boxNum = score.length/m;

        String stringScore[] = new String[score.length];

        for (int i = 0; i < stringScore.length; i++) {
            stringScore[i] = String.valueOf(score[i]);
        }

        Arrays.sort(stringScore, Collections.reverseOrder());
        
        for (int i = 0; i < boxNum; i++) {
            answer += Integer.parseInt(stringScore[m-1])*t;
            m+=t;
        }

        return answer;
    }
}