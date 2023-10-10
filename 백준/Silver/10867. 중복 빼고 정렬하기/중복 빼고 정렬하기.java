import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        sb.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            
            
            if(arr[i] == arr[i-1]){
                continue;
            }
            else{
            sb.append(" ");
            sb.append(arr[i]);
            
            }
        }

        
        System.out.println(sb);
    }
}
