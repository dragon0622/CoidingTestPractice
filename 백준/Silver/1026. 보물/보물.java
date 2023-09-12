import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stubsc.close();
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int[] arr1 = new int[N];
        Integer[] arr2 = new Integer[N];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2,Collections.reverseOrder());

        int out = 0;
        int answer = 0;
        for (int i = 0; i < arr1.length ; i++) {
            answer = arr1[i] * arr2[i];
            out += answer;
        }
        System.out.println(out);
    }
}

