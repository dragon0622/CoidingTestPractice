import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int numberOfTruck = sc.nextInt();
        int lengthOfBridge = sc.nextInt();
        int maximumWeightOfBridge = sc.nextInt();
        int time = 0;
        int sumOfWeight = 0;

        int[] truckWeights = new int[numberOfTruck];


        for (int i = 0; i < numberOfTruck; i++) {
            truckWeights[i] = sc.nextInt();
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < lengthOfBridge; i++) {
            queue.add(0);
        }

        for (int truckWeight : truckWeights){
            while(true){
                sumOfWeight -= queue.poll();

                if (sumOfWeight + truckWeight <= maximumWeightOfBridge){
                    queue.add(truckWeight);
                    sumOfWeight += truckWeight;
                    time++;
                    break;
                }
                else{
                    queue.add(0);
                    time++;
                }
            }
        }
        
        int answer = time + lengthOfBridge;
        
        System.out.println(answer);
    }
}
