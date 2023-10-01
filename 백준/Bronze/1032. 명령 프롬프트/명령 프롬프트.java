import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < arr[0].length(); i++) {
            boolean status = true;

            for (int j = 1; j < n; j++) {
                if (arr[0].charAt(i) != arr[j].charAt(i)){
                    status = false;
                }
                }
            if (status){
                sb.append(arr[0].charAt(i));
            }
            else {
                sb.append("?");
            }
            }
        System.out.println(sb);
        }
}


