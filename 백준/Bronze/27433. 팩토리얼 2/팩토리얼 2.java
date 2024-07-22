import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(bf.readLine());
        System.out.println(factorial(n));
    }

    private static long factorial(long n) {
        if (n == 0 || n == 1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
