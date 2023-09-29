
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        HashSet<String> set = new HashSet<>();

        ArrayList<String> arrlist = new ArrayList<String>();

        for (int i = 0; i < a; i++) {
            set.add(sc.next());
        }
        for (int i = 0; i < b; i++) {
            String str = sc.next();
            if (set.contains(str)) {
                arrlist.add(str);
            }
        }

        Collections.sort(arrlist);

        System.out.println(arrlist.size());

        for (String s : arrlist) {
            System.out.println(s);
        }

    }

}
