import java.io.*;
import java.util.Arrays;
class Solution {
    public static int solution(int n, int[] lost, int[] reserve) {

        Arrays.sort(lost);
        Arrays.sort(reserve);

        int answer = 0;
        int[] students = new int[n];

        Arrays.fill(students, 1);

        for (int lostStudent : lost) {
            students[lostStudent - 1]--;
        }

        for (int reserveStudent : reserve) {
            students[reserveStudent - 1]++;
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i] == 2){
                if ( i-1 >= 0 && students[i-1] == 0){
                    students[i] = 1;
                    students[i-1] = 1;
                }
                else if ( i+1 <students.length && students[i+1] == 0) {
                    students[i] = 1;
                    students[i+1] = 1;
                }
            }
        }

        for (int student : students) {
            if (student != 0) {
                answer++;
            }
        }

        return answer;
    }
}