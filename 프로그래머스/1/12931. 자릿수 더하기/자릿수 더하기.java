import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n/10 != 0){
            answer += n%10;
            n = n/10;
        }

        answer += n;
        return answer;

    }
}