package Queue;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Ex_1966_프린터큐 {

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();
    
    

    for(int i = 0; i<num; i++){

        int N = sc.nextInt();
        int M = sc.nextInt();       //index인듯?
        int star;
        Queue<Integer> q = new LinkedList<Integer>();
        int[] arr = new int[N];
        for(int j = 0; j<N; j++){
            star = sc.nextInt();
            arr[j] = star;
            q.add(j);
            
        }
        int cnt = 0;
        while (!q.isEmpty()){
           boolean check = false;
           int before = q.poll();

           for(int j : arr){
                if(arr[before]<j){
                    q.add(before);
                    check = true;
                    break;
                }
           }

           if(!check){
            cnt++;
            arr[before] = 0;
            if(before == M){
                System.out.println(cnt);
                break;
            }
           }
        }



        
    }




    sc.close();
    }
    
}
