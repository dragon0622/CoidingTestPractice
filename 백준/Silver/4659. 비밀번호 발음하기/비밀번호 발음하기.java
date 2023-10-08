import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] pw_arr;
        String pw;
        boolean status = true;
        boolean flag;
        char prev;
        int cnt;

        
        while(status){
            pw = sc.next();
            if(pw.equals("end")){
                break;
            }
            pw_arr = pw.toCharArray();
            prev = '.';
            cnt = 0;

            flag = false;
            for (char p : pw_arr){
                if(mo(p)){
                    flag = true;
                }

                if(mo(p) != mo(prev)){
                    cnt = 1;
                }
                else{
                    cnt++;
                }

                if(cnt > 2 || (prev ==  p &&(p != 'o' && p != 'e'))){
                    flag = false;
                    break;
                }

                prev = p;
            }

            if(flag == true){
                System.out.println("<" + pw + "> is acceptable.");
            }
            else{
                System.out.println("<" + pw + "> is not acceptable.");
            }
        }

        
    }

    public static boolean mo(char c){
        return (c == 'a'|| c == 'e' || c == 'i' || c== 'o' || c== 'u');
    }
}