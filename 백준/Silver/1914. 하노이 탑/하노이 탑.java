import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ling = sc.nextInt();
        //하노이 탑은 규칙성이 있는 문제이다.
        //n개의 ling이 있을 때, 2^ling -1 의 규칙으로 정답을 구할 수 있음

        printTimes(ling);

    }

    private static void printTimes(int ling) {

        System.out.println(formula(ling));

        if (ling <= 20) {
            printProcess(ling, 1, 2, 3);
        }
    }

    private static BigInteger formula(int ling) {
        return BigInteger.valueOf(2).pow(ling).subtract(BigInteger.ONE);
    }

    private static void printProcess(int ling, int from, int via, int to) {

        if (ling == 1) {
            System.out.println(from + " " + to);
            return;
        }

        printProcess(ling - 1, from, to, via);
        System.out.println(from + " " + to);

        printProcess(ling - 1, via, from, to);


    }
}
