import java.io.*;
import java.util.Stack;
class Solution {
    public static int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> st = new Stack<>();

        for (int k : ingredient) {
            st.push(k);
            if (st.size() >= 4) {
                int size = st.size();
                if (st.get(size - 4) == 1 && st.get(size - 3) == 2 && st.get(size - 2) == 3
                        && st.get(size - 1) == 1) {
                    for (int j = 0; j < 4; j++) {
                        st.pop();
                    }
                    answer++;
                }
            }
        }


        return answer;
    }
}