import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        int cntOne = 0;
        int cntZero = 0;

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c == '1'){
                cntOne++;
            }
            else{
                cntZero++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cntZero/2; i++) {
            sb.append("0");
        }
        for (int i = 0; i < cntOne/2; i++) {
            sb.append("1");
        }

        System.out.println(sb);
    }
}