import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {

        Queue<String> queue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> queue2 = new LinkedList<>(Arrays.asList(cards2));

        for (String word : goal) {
            if (!queue1.isEmpty() && word.equals(queue1.peek())) {
                queue1.poll();
            } else if (!queue2.isEmpty() && word.equals(queue2.peek())) {
                queue2.poll();
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}