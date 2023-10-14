import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int channel = sc.nextInt();
        int btn_num = sc.nextInt();
        int result = 0;

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < btn_num; i++) {
            int btn = sc.nextInt();
            al.add(btn);
        }

        result = Math.abs(100 - channel); //숫자버튼을 사용할 수 없을때 경우의 수

        int num = 987654321;
        int cnt = 0;


        for (int i = 0; i <= 999999; i++) {

            String str = String.valueOf(i);
            boolean chk = true;

            for (int j = 0; j < str.length(); j++) {
                if (al.contains(str.charAt(j) - '0')){
                    chk = false;
                    break;
                }
            }

            if (chk == false){
                continue;
            }

            cnt = str.length() + Math.abs(i-channel);

            if(cnt < num){
                num = cnt;
            }
        }

        if(num < result) {
            result = num;
        }

        System.out.println(result);


    }

}


