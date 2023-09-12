
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        String[] arr = sc.next().split("-");
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            String[] arr2 = arr[i].split("\\+");
            for(int j = 0; j < arr2.length; j++){
                sum += Integer.parseInt(arr2[j]);
            }
            if(i==0){
                res += sum;
            }
			else{
                res -= sum;
            }
        }
        System.out.println(res);
        sc.close();
    }

}

