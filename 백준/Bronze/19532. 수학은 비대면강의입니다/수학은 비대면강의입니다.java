import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y;
        int[] num = new int[6];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        //a = num[0]
        //b = num[1]
        //c = num[2]
        //d = num[3]
        //e = num[4]
        //f = num[5]

        x = (num[2]*num[4] - num[1]*num[5]) / (num[0] * num[4] - num[1] * num[3]);
        y = (num[2]*num[3] - num[0]*num[5]) / (num[1] * num[3] - num[0] * num[4]);
        

        System.out.printf("%d %d",x,y);
    }
}
