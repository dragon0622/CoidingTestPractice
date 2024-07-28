import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            String line = sc.next();
            for (int j = 0; j < 8; j++) {
                char character = line.charAt(j);
                if (character == 'F'){
                    if ((i+j)%2 == 0){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
