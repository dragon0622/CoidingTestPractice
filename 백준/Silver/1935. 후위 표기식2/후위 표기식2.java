import java.util.Scanner;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int [] arr = new int[T+1];
        String s = sc.next();

        for(int i = 0; i<T; i++) {
            arr[i] = sc.nextInt();
        }

        //내가 멍청했다. A,B,... 그냥 문제에서 주는 거였는데 굳이 코드에 표현하려함
        //어차피 string으로 받고 배열 따로 선언해서 풀어도 되는건데 ㅇㅇ

        Stack<Double> st = new Stack<>();

        for(int i = 0; i<s.length(); i++) {

            char c = s.charAt(i);
            double a1 = 0;
            double a2 = 0;
            double a3 = 0;

            if (c == '+') {
                a1 = st.pop();
                a2 = st.pop();
                a3 = a2 + a1;
                st.push(a3);
            } else if (c == '-') {
                a1 = st.pop();
                a2 = st.pop();
                a3 = a2 - a1;
                st.push(a3);
            } else if (c == '*') {
                a1 = st.pop();
                a2 = st.pop();
                a3 = a2 * a1;
                st.push(a3);
            } else if (c == '/') {
                a1 = st.pop();
                a2 = st.pop();
                a3 = a2 / a1;
                st.push(a3);
            } else {
                int index = c - 'A';
                st.add((double) arr[index]);
            }
        }
        double result = st.pop();
        System.out.printf("%.2f", result);

    }





}


