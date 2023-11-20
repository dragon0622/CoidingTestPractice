import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int aSize = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> A = new HashMap<>();

        int bSize = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> B = new HashMap<>();

        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aSize; i++) {
            A.put(Integer.parseInt(st.nextToken()), i);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bSize; i++) {
            B.put(Integer.parseInt(st.nextToken()), i);
        }

        int result = 0;

        for(int n : A.keySet()){
            if (!B.containsKey(n)) {
                result++;
            }
        }

        for (int n : B.keySet()) {
            if (!A.containsKey(n)) {
                result++;
            }
        }

        sb.append(result);

        System.out.println(sb);
        br.close();


    }
}
