import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine().toUpperCase();

        int[] alpha = new int[26];

        for (int i = 0; i < word.length(); i++) {
            int temp = word.charAt(i) - 65;
            alpha[temp]++;
        }

        int max = -1;
        char same = '?';

        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] > max){
                max = alpha[i];
                same = (char)(i + 65);
            }
            else if (alpha[i] == max){
                same = '?';
            }
        }

        System.out.println(same);


    }
}
