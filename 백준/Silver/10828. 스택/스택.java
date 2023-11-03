import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; 
        int n = Integer.parseInt(bf.readLine());

        int cnt = 0;
        Stack<Integer> stack = new Stack<>();

        while (cnt < n) {
            st = new StringTokenizer(bf.readLine());
            String method = st.nextToken();

            if (method.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            }
            else if(method.equals("pop")){
                if (stack.empty() == true) {
                    System.out.println("-1");
                }
                else{
                    System.out.println(stack.pop());
                }
            }
            else if(method.equals("size")){
                System.out.println(stack.size());
            }
            else if (method.equals("empty")) {
                if (stack.empty() == true) {
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }
            else if (method.equals("top")) {
                if (stack.empty() == true) {
                    System.out.println("-1");
                }
                else{
                    int reInput = stack.pop();
                    System.out.println(reInput);
                    stack.push(reInput);
                }
                
            }
            cnt++;
        }
    }
}
