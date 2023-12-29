import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Character> st;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String sentence = bf.readLine();
            if (sentence.equals(".")){
                break;
            }

            sentence.trim();    //공백제거


            st = new Stack<>();

            Boolean flag = true;

            for (int i = 0; i < sentence.length(); i++) {
                char a = sentence.charAt(i);
                if (a == '(' || a == '['){
                    st.push(a);
                }
                else if (a == ')' || a==']' ) {
                    if (!st.isEmpty() && st.peek().equals('(') && a == ')'){
                        st.pop();
                    }
                    else if(!st.isEmpty() && st.peek() == '[' && a == ']'){
                        st.pop();
                    }
                    else {
                        flag = false;
                        break;
                    }
                }
            }

            if (!sentence.endsWith(".") || !st.isEmpty()){
                flag = false;
            }

            if (!flag){
                bw.write("no\n");
            }
            else {
                bw.write("yes\n");
                st.clear();
            }

        }

        bf.close();
        bw.flush();
        bw.close();
    }
}


