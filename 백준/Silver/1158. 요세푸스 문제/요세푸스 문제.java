import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Queue<Integer> q = new LinkedList<>();

    int N = sc.nextInt();   //N입력
    int K = sc.nextInt();   //K입력

    for(int i = 1; i<=N; i++){
        q.add(i);
    }

    StringBuilder number = new StringBuilder();
    number.append('<');

    while(q.size()>1){

        for(int i = 0; i<K-1; i++){
            int value = q.poll();
            q.offer(value);
        }

        number.append(q.poll()).append(", ");

    }
    number.append(q.poll()).append('>');

    System.out.println(number);
    sc.close();
}
}