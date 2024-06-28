import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> set = new HashSet<>();
        int cnt = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < cnt; i++) {

            String cmd = sc.next();
            if (cmd.equals("ENTER")){
                sum += set.size();
                set = new HashSet<>();
            }
            else{
                set.add(cmd);
            }
        }
        sum += set.size();

        System.out.println(sum);
    }
}
