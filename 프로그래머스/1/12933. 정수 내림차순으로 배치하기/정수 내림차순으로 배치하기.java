class Solution {
    public static long solution(long n) {
        String nString = "" + n;
        int size = nString.length();
        Integer[] arr = new Integer[size];

        for (int i = 0; i < size; i++) {
            String target = nString.substring(i,i+1);
            arr[i] = Integer.parseInt(target);
        }

        for(int j = 0; j < nString.length()-1; j++){
            for(int i = 0; i < nString.length()-1; i++) {
                if (arr[i] < arr[i+1]) {
                    int tmp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        nString = "";

        for (int i = 0; i < size; i++) {
            nString += arr[i];
        }

        return Long.parseLong(nString);
    }
}