
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt();
        int store = sc.nextInt();
        int cheapSet;
        int cheapSingle;
        int set;
        int single;

        cheapSet = sc.nextInt();
        cheapSingle = sc.nextInt();

        for (int i = 1; i < store; i++) {
            set = sc.nextInt();
            single = sc.nextInt();

            if (set < cheapSet){
                cheapSet = set;
            }
            if (single < cheapSingle){
                cheapSingle = single;
            }
        }

        int mok = line/6;
        int namuji = line%6;

        int total1 = mok * cheapSet + namuji * cheapSingle;
        int total2;
        int total3 = line * cheapSingle;

        if (mok == 0){
            if (cheapSet < cheapSingle){
                total2 = cheapSet;
            }
            else{
                total2 = namuji * cheapSingle;
            }

        }
        else{
            total2 = (mok+1) * cheapSet;
        }

        if (total1 < total2){
            if (total1 < total3){
                System.out.println(total1);
            }
            else {
                System.out.println(total3);
            }
        }else {
            if (total2 < total3){
                System.out.println(total2);
            }
            else{
                System.out.println(total3);
            }
        }
    }
}
