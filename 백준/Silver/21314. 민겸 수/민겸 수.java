import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stubsc.close();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        String mk = sc.next();
        int cnt = 0;

        // max
        for (int i = 0; i < mk.length(); i++) {
            if (mk.charAt(i) == 'M'){
                cnt++;
            } else if (mk.charAt(i) == 'K') {
                sb.append(5);
                for (int j = 0; j < cnt; j++) {
                    sb.append(0);
                }
                cnt= 0;
            }

        }
        for (int i = 0; i < cnt; i++) {
            sb.append(1);
        }

        cnt = 0;


        //min

        int plus = 0;
        for (int i = 0; i < mk.length(); i++) {
            if(mk.charAt(i) == 'M'){
                cnt++;
            }
            else if(mk.charAt(i) == 'K'){
                if (cnt != 0) {
                    sb2.append(1);
                    for (int j = 0; j < cnt-1; j++) {
                     sb2.append(0);
                    }
                    cnt = 0;
                }
                sb2.append(5);
            }
        }
        if (cnt != 0) {
            sb2.append(1);
            for (int j = 0; j < cnt-1; j++) {
                sb2.append(0);
            }
        }


        //output

        String a = sb.toString();
        String b = sb2.toString();

        System.out.println(a);
        System.out.println(b);

        sc.close();
    }
}

