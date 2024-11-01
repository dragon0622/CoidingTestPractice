import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            hs.add(sc.next());
        }

        List<String> list = new ArrayList<>();

        for(String a : hs){
            for (String b : hs){
                list.add(a + " " + b);
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        for (String a : list){
            sb.append(a).append("\n");
        }

        System.out.println(sb);
    }
}
