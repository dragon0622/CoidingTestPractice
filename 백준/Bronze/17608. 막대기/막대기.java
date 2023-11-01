import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
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
