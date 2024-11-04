import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> hm = new HashMap<>();

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            String target = sc.next();
            hm.put(target, hm.getOrDefault(target, 1) + 1);
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hm.entrySet());
        entryList.sort((e1, e2) -> {
            int valueCompare = e2.getValue().compareTo(e1.getValue());
            if (valueCompare != 0) {
                return valueCompare;
            } else {
                return e1.getKey().compareTo(e2.getKey());
            }
        });

        System.out.println(entryList.get(0).getKey());




        System.out.println();
    }
}
