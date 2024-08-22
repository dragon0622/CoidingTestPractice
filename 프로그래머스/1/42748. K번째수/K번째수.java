class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            answer[i] = solution2(array, commands[i]);

        }
        return answer;
    }

    private static int solution2(int[] array, int[] command) {
        int[] temp = new int[(command[1]-command[0])+1];
        int cnt = 0;
        for (int i = command[0]-1; i < command[1]; i++) {
            temp[cnt] = array[i];
            cnt++;
        }

        sortArr(temp);


        return temp[command[2]-1];
    }

    static void sortArr(int[] arr){
        for(int i=0; i<arr.length-1; i++)
            for(int j=0; j<arr.length-1-i; j++)
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
    }
}