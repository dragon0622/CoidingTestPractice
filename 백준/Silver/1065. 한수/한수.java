import java.util.Scanner;

public class Main {
    private static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();

        if (Integer.parseInt(N)< 100){
            cnt = Integer.parseInt(N);
        }
        else{
            makeResult(N);
            cnt += 99;
        }
        System.out.println(cnt);
    }

    private static void makeResult(String n) {
        int targetNum = Integer.parseInt(n);

        for (int i = 110; i <= targetNum; i++) {
            String numToString = String.valueOf(i);
            checkNum(numToString);
        }
    }

    private static void checkNum(String i) {
        Character[] arr = new Character[i.length()];
        int depth;

        for (int j = 0; j < i.length(); j++) {
            arr[j] = i.charAt(j);
        }

        depth = arr[0] - arr[1];

        if (arr[1] - arr[2] == depth){
            cnt++;
        }

    }
}
