import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int res = 0;
        
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            res = Math.max(res, num - min);
            min = Math.min(min, num);
        }

        System.out.println(res);
    }
}
