import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            String line = br.readLine();
            Stack<Character> pwdStack = new Stack<>();
            Stack<Character> deleteStack = new Stack<>();
            int cursor = 0;
            for(int j=0; j<line.length(); j++) {
                char pos = line.charAt(j);
                if(pos == '<') {
                    if(!pwdStack.isEmpty()) {
                        deleteStack.push(pwdStack.pop());
                    }
                }else if(pos == '>') {
                    if(!deleteStack.isEmpty()) {
                        pwdStack.push(deleteStack.pop());
                    }
                }else if(pos == '-') {
                    if(!pwdStack.isEmpty()) {
                        pwdStack.pop();
                    }
                }else {
                    pwdStack.push(line.charAt(j));
                }
            }

            while(!deleteStack.isEmpty()) {
                pwdStack.push(deleteStack.pop());
            }

            for(int k=0; k<pwdStack.size(); k++) {
                bw.write(pwdStack.get(k));
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();

    }
}
