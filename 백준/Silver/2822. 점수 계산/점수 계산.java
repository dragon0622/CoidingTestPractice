import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[8];
        HashMap<Integer, Integer> hm = new HashMap();
        int[] result = new int[5];


        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            int a = score[i];
            hm.put(a, i);
        }

        Arrays.sort(score);

        int sum = 0;
        for (int i = 3; i < 8; i++) {
             sum += score[i];
             result[i-3] = hm.get(score[i]);
        }

        Arrays.sort(result);
        System.out.println(sum);
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d ",result[i]+1);
        }




    }

}
