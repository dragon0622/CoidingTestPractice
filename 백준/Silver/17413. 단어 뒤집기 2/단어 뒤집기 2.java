import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        Stack <Character> st = new Stack <> ();

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == '<') {
                while (!st.isEmpty()) {
                    sb.append(st.pop());
                }
                flag = true;
            }

            else if (string.charAt(i) == '>') {
                flag = false;
                sb.append(string.charAt(i));
                continue;
            }


            if (flag == true) {
                sb.append(string.charAt(i));
            }

            else if (flag == false) {
                if (string.charAt(i) == ' ') {
                    while (!st.isEmpty()) {
                        sb.append(st.pop());
                    }
                    sb.append(' ');
                    continue;
                } else {
                    st.push(string.charAt(i));
                }
            }


            if (i == string.length() - 1) {
                while (!st.isEmpty()) {
                    sb.append(st.pop());
                }
            }
        }

        System.out.println(sb);
    }
}