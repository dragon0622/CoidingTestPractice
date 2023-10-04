import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        String s = "";

        s = sc.next();

        int result = 0;
        int cnt = 0;

        for (int i = 1; i < M-1; i++) {
            if (s.charAt(i-1) == 'I' && s.charAt(i) == 'O' && s.charAt(i+1) == 'I'){
                cnt++;

                if (cnt == N){
                    cnt--;
                    result++;
                }
                i++;
            }
            else{
                cnt = 0;
            }
        }

        System.out.println(result);
    }

}


