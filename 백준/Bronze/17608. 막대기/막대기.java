import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(Integer.parseInt(br.readLine()));
        }

        //비교대상인 마지막 값 
        int compareNum = st.pop();
        int cnt = 1;
        int pop;
        for (int i = 0; i < n-1; i++) {
            pop = st.pop();
            if (compareNum < pop) {
                compareNum = pop;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
