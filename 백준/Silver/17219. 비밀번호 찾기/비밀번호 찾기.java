import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> hm1 = new HashMap<>();

        int dic = sc.nextInt();
        int quiz_n = sc.nextInt();
        String[] quiz = new String[quiz_n];

        for (int i = 1; i < dic+1; i++) {
            String a = sc.next();
            String b = sc.next();
            hm1.put(a,b);
        }

        for (int i = 0; i < quiz_n; i++) {
            quiz[i] = sc.next();
        }

        for (int i = 0; i < quiz_n; i++) {
            System.out.println(hm1.get(quiz[i]));
        }

    }

}
