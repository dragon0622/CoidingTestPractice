import java.util.Scanner;

public class Main {
    static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            cal(n);
        }

        System.out.println(result%10);
    }

    private static void cal(int n) {
        result += n*n;
    }
}
