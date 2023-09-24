import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String code = sc.next();
        String code_div = "";
        StringBuilder sb = new StringBuilder();


        String [] alphabet = new String[8];
        alphabet[0] = "000000";
        alphabet[1] = "001111";
        alphabet[2] = "010011";
        alphabet[3] = "011100";
        alphabet[4] = "100110";
        alphabet[5] = "101001";
        alphabet[6] = "110101";
        alphabet[7] = "111010";

        for (int i = 0; i < n; i++) {
            code_div = code.substring(i*6,(i*6)+6); //6자리 마다 자르면서 초기화
            int status = -1;
            for (int j = 0; j < 8; j++) {
                int cnt = 0;
                for (int k = 0; k < 6; k++) {
                    if (code_div.charAt(k) == alphabet[j].charAt(k)){
                        cnt++;
                    }
                }

                if (cnt==5){
                    status = j;
                }
                else if (cnt == 6) {
                    status = j;
                    break;
                }
            }

            if (status == -1){
                System.out.println(i+1);
                return;
            }

            sb.append((char)(status + 65));
        }
        System.out.println(sb);

        }
}