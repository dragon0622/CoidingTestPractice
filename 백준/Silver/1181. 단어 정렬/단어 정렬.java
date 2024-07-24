import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set;

        int n = sc.nextInt();
        String[] arr = new String[n];

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }


        Arrays.sort(arr, (s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            } else {
                return s1.length() - s2.length();
            }
        });

        set = new LinkedHashSet<>(Arrays.asList(arr));

        for(String word : set){
            System.out.print(word + "\n");
        }
    }
}
