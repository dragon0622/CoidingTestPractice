import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        boolean solution(String s)
        {
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '('){
                    st.push(s.charAt(i));
                }
                else{
                    if (st.size() == 0){
                        return false;
                    }
                    st.pop();
                }
            }
            if (st.size() == 1){
            return true;
            }
            else{
            return false;
            }
        


        }

        Stack<Character> st = new Stack<>();

        

    }
}