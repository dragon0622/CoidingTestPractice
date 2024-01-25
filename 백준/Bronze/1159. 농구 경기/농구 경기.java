import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        int n = Integer.parseInt(bf.readLine());
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            String name = bf.readLine();
            char firstName = name.charAt(0);
            arr[firstName - 97]++;
            if (arr[firstName - 97] == 5) {
                flag = true;
            }
        }

        if (flag) {
            for (int i = 0; i < 26; i++) {
                if (arr[i] >= 5) {
                    System.out.print((char)(i+97));
                }
            }
        }
        else{
            System.out.println("PREDAJA");
        }

    }
}
