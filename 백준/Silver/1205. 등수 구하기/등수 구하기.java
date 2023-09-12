import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stubsc.close();
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt(); //현재 등록되어있는 등수의 개수
        int TS = sc.nextInt(); //태수의 새로운 점수
        int P = sc.nextInt(); //등록될 수 있는 등수의 개수
        int [] score = new int[N];

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
        }

        int ranking = 1;
        int cnt = 0;

        if(P==N && score[N-1]>=TS){
            ranking = -1;
        }
        else{
            for (int i = 0; i < N; i++) {
                if (score[i]>TS){
                    ranking=ranking + cnt + 1;
                    cnt = 0;
                }
                else if (score[i] == TS){
                    cnt++;
                }

            }
            if(ranking>P){
                ranking = -1;
            }
        }

        System.out.println(ranking);
        sc.close();
    }
}

