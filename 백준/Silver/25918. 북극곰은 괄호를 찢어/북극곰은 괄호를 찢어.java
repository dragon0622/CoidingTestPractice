import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        String st = in.nextLine();

        Stack<Character> stack = new Stack<>();
        int result = 0;

        for (char c : st.toCharArray()) {
            if (!stack.isEmpty() && (stack.peek() == '(' && c == ')' || stack.peek() == ')' && c == '(')) {
                stack.pop();
            }
            else {
                stack.push(c);
            }
            result = Math.max(result, stack.size());
        }

        if (!stack.isEmpty()) {
            result = -1;
        }

        System.out.println(result);
    }
}