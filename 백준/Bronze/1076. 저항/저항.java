import java.util.Scanner;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        String col = sc.next();
        String col2 = sc.next();
        String col3 = sc.next();

        String[] arr = {"black","brown","red","orange",
        "yellow","green","blue","violet","grey","white"};


        long a = 0;
        long b = 0;
        long c = 0;
        long result = 0;
    

        for (int i = 0; i < arr.length; i++) {
            if (col.equals(arr[i])) {
                a = i;
            }

            if (col2.equals(arr[i])) {
                b= i;
            }

            if (col3.equals(arr[i])) {
                c = (int)Math.pow(10,i);
            }
        }

        result = ((a*10)+b)*c;

        System.out.println(result);
        
    }
}
