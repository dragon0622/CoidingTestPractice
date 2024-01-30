class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int num = 0;
        
        for(int i = 0; i < strlist.length; i++){
            
            num = strlist[i].length();
            
            answer[i] = num;
            
        }
        
        
        return answer;
    }
}