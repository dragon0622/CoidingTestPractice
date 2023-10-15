import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int m = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            if(binarysearch(arr, sc.nextInt())>=0){
                sb.append(1 + "\n");
            }
            else{
                sb.append(0 + "\n");
            }
        }

        System.out.println(sb);

    }

    public static int binarysearch(int[] arr, int target){

        int low = 0;
        int high = arr.length -1;

        while(low <= high){
            int mid = (low + high)/2;
            if (target < arr[mid]) {
                high = mid - 1;
            }
            else if(target > arr[mid]){
                low = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
