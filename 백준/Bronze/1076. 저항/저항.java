import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int[] val = {0,1,2,3,4,5,6,7,8,9};
        int[] mul = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
        String[] rst = new String[3];
        int[] value = new int[3];
        long[] multi = new long[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            String word = sc.next();
            rst[i] = word;
        }
        for(int i = 0; i < color.length; i++) {
            for(int j = 0; j < rst.length; j++) {
                if(color[i].equals(rst[j])) {
                    value[j] = val[i];
                    multi[j] = mul[i];
                }
            }
        }
        long rst1 = ((value[0] * 10) + value[1]) * multi[2];
        System.out.println(rst1);
    }
}