import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> st = new Stack<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(bf.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(s.nextToken());
        for (int i = 0; i < n; i++) {
            s = new StringTokenizer(bf.readLine());
            String method = s.nextToken(" ");
            switch (method){
                case "2":{
                    if (!st.isEmpty()){
                        bw.write(st.pop() + "\n");
                    }
                    else {
                        bw.write(-1 + "\n");
                    }
                    break;
                }
                case "3":{
                    bw.write(st.size() + "\n");
                    break;
                }
                case "4":{
                    if (st.isEmpty()){
                        bw.write(1 + "\n");
                    }
                    else {
                        bw.write(0 + "\n");
                    }
                    break;
                }
                case "5":{
                    if (st.isEmpty()){
                        bw.write(-1 + "\n");
                    }
                    else {
                        bw.write(st.peek() + "\n");
                    }
                    break;
                }
                default:{
                    int num = Integer.parseInt(s.nextToken());
                    st.push(num);
                }
            }
        }
        bf.close();
        bw.flush();
        bw.close();
    }
}


