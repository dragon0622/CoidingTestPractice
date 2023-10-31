import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<Integer>();

        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            if (input == 0) {
                st.pop();
            }
            else{
                st.add(input);
            }
        }

        int sum = 0;
        // int size = st.size();
        // for (int i = 0; i <= size; i++) {
        //     sum += st.pop();
        // }

        for(int o : st){
            sum += o;
        }

        System.out.println(sum);
    

    }
}
