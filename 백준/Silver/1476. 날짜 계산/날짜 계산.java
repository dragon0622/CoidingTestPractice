import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int earth = 1;
        int sun = 1;
        int moon = 1;
        int year = 1;
       
        while(true){
            
            if (earth > 15) {
                earth = 1;
            }

            if (sun > 28) {
                sun = 1;
            }

            if (moon > 19) {
                moon = 1;
            }
            
            

            if (earth == E && sun == S && moon == M) {
                break;                
            }
            year++;
            earth++;
            sun++;
            moon++;

        }
        
        System.out.println(year);

        in.close();
        
    }
}
