import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> hm1 = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();

        int dic = sc.nextInt();
        int quiz_n = sc.nextInt();
        String[] quiz = new String[quiz_n];

        for (int i = 1; i < dic+1; i++) {
            String b = sc.next();
            hm1.put(i,b);
            hm2.put(b,i);
        }

        for (int i = 0; i < quiz_n; i++) {
            quiz[i] = sc.next();
        }

        for (int i = 0; i < quiz_n; i++) {
            if (quiz[i].matches("[+-]?\\d*(\\.\\d+)?") == true){
                int a = Integer.parseInt(quiz[i]);
                System.out.println(hm1.get(a));
            }
            else{
                System.out.println(hm2.get(quiz[i]));
            }
        }

    }

}
