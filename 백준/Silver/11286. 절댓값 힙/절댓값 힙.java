import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if (Math.abs(o1) == Math.abs(o2)){
                    return o1 - o2;
                }
                else{
                    return Math.abs(o1) - Math.abs(o2);
                }
            }
        });

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();

            if (m == 0){
                if (queue.isEmpty()){
                    System.out.println(0);
                }
                else{
                    System.out.println(queue.poll());
                }
            }
            else{
                queue.add(m);
            }
        }
    }
}
